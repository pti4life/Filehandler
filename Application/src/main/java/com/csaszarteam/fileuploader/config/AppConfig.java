package com.csaszarteam.fileuploader.config;

import com.csaszarteam.fileuploader.service.UserService;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.h2.tools.Server;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.annotation.PostConstruct;
import java.sql.SQLException;
import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.csaszarteam.fileuploader")
@EnableTransactionManagement
@PropertySource("classpath:database.properties")
@EnableJpaRepositories(value = "com.csaszarteam.fileuploader.database.repository",entityManagerFactoryRef ="sessionFactory")

public class AppConfig  implements WebMvcConfigurer {


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

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}


	//Session Factory bean
	@Bean
	public SessionFactory sessionFactory() {
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource());
		builder
				.scanPackages("com.csaszarteam.fileuploader.database.entity")
				.addProperties(getHibernateProperties());

		return builder.buildSessionFactory();
	}


	private Properties getHibernateProperties() {
		Properties prop = new Properties();
		prop.put("hibernate.hbm2ddl.auto","update");
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
	@Bean(name="transactionManager")
	public PlatformTransactionManager dbTransactionManager() {
		return  new JpaTransactionManager(sessionFactory());
	}


	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}
	/*
	@Bean("multipartResolver")
	public CommonsMultipartResolver multipartResolver(){
		CommonsMultipartResolver resolver=new CommonsMultipartResolver();
		resolver.setDefaultEncoding("utf-8");
		return resolver;
	}*/
}









