package com.csaszarteam.fileuploader.config;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.csaszarteam.fileuploader")
@EnableTransactionManagement
@PropertySource("classpath:database.properties")
@EnableJpaRepositories(value = "com.csaszarteam.fileuploader.repository",entityManagerFactoryRef ="sessionFactory")


public class AppConfig {


	//Jdbc connection attributes
	@Value("${database.dialect}")
	private String dialect;

	@Value("${database.driverClass}")
	private String driverClass;

	@Value("${database.username}")
	private String username;

	@Value("${database.password}")
	private String password;

	@Value("${database.url}")
	private String url;

	// define a bean for ViewResolver

	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}

	//Session Factory bean
	@Bean
	public SessionFactory sessionFactory() {
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource());
		builder
				.scanPackages("com.csaszarteam.fileuploader.entity")
				.addProperties(getHibernateProperties());


		return builder.buildSessionFactory();
	}


	private Properties getHibernateProperties() {
		Properties prop = new Properties();
		prop.put("hibernate.hbm2ddl.auto","create-drop");
		prop.put("hibernate.dialect", dialect);
		return prop;
	}

	@Bean(name = "dataSource")
	public BasicDataSource dataSource() {

		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driverClass);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);

		return ds;
	}

	@Bean
	public HibernateTransactionManager txManager() {
		return new HibernateTransactionManager(sessionFactory());
	}
	
}









