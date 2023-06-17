package com.abacus.usersvc.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().requestMatchers("예외처리하고싶은 url 1", "예외처리하고싶은 url 2");
    }

//    protected SecurityFilterChain webSecurityFilterChain(HttpSecurity http) throws Exception{
//        http
//                .authorizeHttpRequests()
//                .requestMatchers("허용해주고싶은 url 1").permitAll()
//                .anyRequest().authenticated()
//
//            .and()
//                .formLogin()
//                .loginProcessingUrl("로그인 처리될 url")
//                .permitAll()
//                .successHandler()
//                .failureHandler();
//
//
//        http
//                .sessionManagement()
//                .invalidSessionUrl()
//;
//
//
//    }
}
