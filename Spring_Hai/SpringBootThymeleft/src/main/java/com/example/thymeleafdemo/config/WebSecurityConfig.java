package com.example.thymeleafdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
    private UserDetailsService userDetailsService;
	@Autowired
    CustomSuccessHandler customSuccessHandler;
			
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception        
    {
        return super.authenticationManagerBean();
    }
	
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        	.csrf().disable()
            .authorizeRequests()
	            .antMatchers("/webjars/**").permitAll()
	    		.antMatchers("/css/**", "/js/**", "/templates/**").permitAll()
            	.antMatchers("/register", "/index").permitAll()
	    		.antMatchers("/css/**", "/js/**", "/templates/**","/assets/**").permitAll()
            	.antMatchers("/register").permitAll()
                .antMatchers("/user/**").hasRole("MEMBER")
                .antMatchers("/admin/**").hasRole("ADMIN")
        		.antMatchers("/favicon.ico", "/**").permitAll()
        		.antMatchers("/home", "/about","/layout").permitAll()
                .anyRequest().authenticated()
                .and()
				.formLogin().loginPage("/login").successHandler(customSuccessHandler)
				.and()
				.logout().permitAll()
				.and()
				.exceptionHandling().accessDeniedPage("/403");
    }
}
