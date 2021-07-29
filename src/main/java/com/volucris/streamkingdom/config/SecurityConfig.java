package com.volucris.streamkingdom.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(final HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/css/**", "/").permitAll().antMatchers("/user/**", "/start")
				.hasRole("USER").and().formLogin().loginPage("/login").failureUrl("/login-error");
	}

}
