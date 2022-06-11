package com.saidworks.jwt.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
 * https://www.toptal.com/spring/spring-security-tutorial
 * https://github.com/Yoh0xFF/java-spring-security-example/tree/master/src/main
 * https://github.com/spring-projects/spring-security-samples/tree/main/servlet/spring-boot/java/jwt/login
 * https://jwt.io/introduction
 * https://www.javainuse.com/spring/boot-jwt
 */

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) {
		
	}
	
	@Override
	protected void configure(HttpSecurity http) {
		
	}
	
}
