//package com.foodapp.rest.r;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import com.foodapp.rest.r.service.CustomerService;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//	
//	@Autowired
//	private CustomerService customerService;
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.authenticationProvider(getAuthProvider());
//	}
//	
//	protected void config(HttpSecurity http) throws Exception {
//		http.authorizeHttpRequests()
//		.antMatchers(HttpMethod.GET, "/api/customer/login").authenticated()
//		.antMatchers(HttpMethod.GET, "/api/user/hello").permitAll()
//		.antMatchers(HttpMethod.GET, "/api/user/private/hello").authenticated()
//		.antMatchers(HttpMethod.GET, "/api/user/private/role/hello").hasAnyAuthority("Customer")
//		.anyRequest().permitAll()
//		.and().httpBasic()
//		.and().csrf().disable();
//	}
//
//	private DaoAuthenticationProvider getAuthProvider() {
//		DaoAuthenticationProvider dao = new DaoAuthenticationProvider();
//		
//		dao.setPasswordEncoder(getPasswordEncoder());
//		
//		dao.setUserDetailsService(customerService);
//		return null;
//	}
//
//	private PasswordEncoder getPasswordEncoder() {
//		PasswordEncoder encoder = new BCryptPasswordEncoder();
//		return encoder;
//	}
//	
//	
//
//}
