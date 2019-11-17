package com.csaszarteam.fileuploader.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailService userDetailService;

	@Autowired
	AuthenticationSuccess authenticationSuccess;


	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.userDetailsService(userDetailService);
		System.out.println("itt ni");

	}



	@Override
	protected void configure(HttpSecurity http) throws Exception {
		String[] a=new String[3];
		a[0]="/home"; a[1]="/login"; a[2]="/signup";
  		http.authorizeRequests().antMatchers(a).permitAll()
				.antMatchers("/upload").hasAuthority("test")
				.and().formLogin().loginPage("/login")
				.successHandler(authenticationSuccess);


	}
}






