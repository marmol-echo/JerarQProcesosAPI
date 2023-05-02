package com.aeroman.jerarq.jerarqprocesosapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.aeroman.jerarq.jerarqprocesosapi")
@EntityScan("com.aeroman.jerarq.jerarqprocesosapi.entities.vhur")
@EnableJpaRepositories(
		basePackages = "com.aeroman.jerarq.jerarqprocesosapi.repository.vhur",
		entityManagerFactoryRef = "vhurEmf",
		transactionManagerRef = "vhurTransactionManager"
		)
public class VhurJndiConfig {
    
    @Autowired
    private Environment env;

    @Bean(destroyMethod = "")	@Primary
    DataSource vhurDataSource() throws NamingException {
        return (DataSource) new JndiTemplate().lookup(env.getProperty("spring.datasource.vhur.jndi-name"));
    }

    @Bean	@Primary
    PersistenceExceptionTranslationPostProcessor vhurExceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    final Properties additionalProperties() {
        final Properties hibernateProperties = new Properties();
        //hibernateProperties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        //hibernateProperties.setProperty("hibernate.dialect", env.getProperty("oracleDialect"));
        hibernateProperties.setProperty("hibernate.cache.use_second_level_cache", "false");
        return hibernateProperties;
    }

    @Bean(name = "vhurEmf")	@Primary
    LocalContainerEntityManagerFactoryBean vhurEntityManagerFactory() throws NamingException {
        final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(vhurDataSource());
        em.setPackagesToScan("com.aeroman.jerarq.jerarqprocesosapi.entities.vhur");
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        em.setJpaProperties(additionalProperties());
        return em;
    }
    
    @Bean()	@Primary
    PlatformTransactionManager vhurTransactionManager(@Qualifier("vhurEmf") EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
}
