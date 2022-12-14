package com.example.assignmentt2009m1springboot.config;

import com.example.assignmentt2009m1springboot.filter.MyAuthenticationFilter;
import com.example.assignmentt2009m1springboot.service.AccountService;
import com.example.assignmentt2009m1springboot.filter.MyAuthenticationFilter;
import com.example.assignmentt2009m1springboot.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    final AccountService accountService;
    final PasswordEncoder passwordEncoder;
    @Bean
    @Override

    public AuthenticationManager authenticationManagerBean() throws Exception{
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(accountService).passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        MyAuthenticationFilter authenticationFilter = new MyAuthenticationFilter(authenticationManagerBean());
        authenticationFilter.setFilterProcessesUrl("/api/v1/accounts/login");
        http.cors().and().csrf().disable();
        http.authorizeHttpRequests().antMatchers("/api/v1/hello", "/api/v1/accounts/*").permitAll();
        http.authorizeHttpRequests().antMatchers("/api/v1/user").hasAnyAuthority("USER", "ADMIN");
        http.authorizeHttpRequests().antMatchers("/api/v1/admin").hasAnyAuthority("ADMIN");
        http.addFilter(authenticationFilter);
    }
}
