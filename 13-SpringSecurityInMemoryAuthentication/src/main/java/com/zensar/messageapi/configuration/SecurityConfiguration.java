package com.zensar.messageapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Bean // This will declare return object as Spring Bean
	public BCryptPasswordEncoder getBCryptPasswordEncoder() {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder;
	}

	// Authentication : is the process of determining someone is who it says
	// (Claims) to be
	// It is typically implemented by username and password
	// conf Enter
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth
			.inMemoryAuthentication()
			.withUser("Zensar")
			.password("$2a$10$2xL7edy6OpJq8V9/5pUYp.IA4Up9i0SWjXUE7G5lJqw4CbTydLBzO")
				// Password is stored in plain text which is bad thing
				// Spring security doesn't allow to do that
				// Store password in encoded form
			.roles("USER")
				// Though we are writing USER it is considered as ROLE_USER (ROLE_ (it is automatically added))
			.and()
			.withUser("admin")
			.password("$2a$10$l2whiNdJxCAfOcXHJzW4dOUWr9N57LUMqOaxp87g7/hmPGOFXYmPe")
			.roles("ADMIN");
	}
	
	// Authorization: - specifying access rights to a resource
	// Access based on Roles
	// What are you allowed to do?
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
			.csrf()
			.disable()
			.authorizeRequests()
			// we are allowing only admin to access 
			.antMatchers(HttpMethod.POST, "/api/message").hasRole("ADMIN") 
			.anyRequest()
			.authenticated()
			.and()
			.httpBasic()
				// This tells basic Authentication
			.and()
			.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS); // REST is STATELESS
	}
}