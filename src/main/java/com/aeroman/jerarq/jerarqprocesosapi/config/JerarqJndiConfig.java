package com.aeroman.jerarq.jerarqprocesosapi.config;

import java.util.Properties;

import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.aeroman.jerarq.jerarqprocesosapi")
@EntityScan("com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq")
@EnableJpaRepositories(
		basePackages = "com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq",
		entityManagerFactoryRef = "jqEmf",
		transactionManagerRef = "jqTransactionManager"
		)
public class JerarqJndiConfig {

    @Autowired
    private Environment env;

    @Bean(destroyMethod = "")
    DataSource jqDataSource() throws NamingException {
        return (DataSource) new JndiTemplate().lookup(env.getProperty("spring.datasource.jerarq.jndi-name"));
    }

    @Bean
    PersistenceExceptionTranslationPostProcessor jqExceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    final Properties jqAdditionalProperties() {
        final Properties hibernateProperties = new Properties();
        //hibernateProperties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        hibernateProperties.setProperty("hibernate.dialect", env.getProperty("oracleDialect"));
        hibernateProperties.setProperty("hibernate.cache.use_second_level_cache", "false");
        return hibernateProperties;
    }

    @Bean(name = "jqEmf")
    LocalContainerEntityManagerFactoryBean jqEntityManagerFactory() throws NamingException {
        final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(jqDataSource());
        em.setPackagesToScan("com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq");
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        em.setJpaProperties(jqAdditionalProperties());
        return em;
    }
    
    @Bean
    PlatformTransactionManager jqTransactionManager(@Qualifier("jqEmf") EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }

}
