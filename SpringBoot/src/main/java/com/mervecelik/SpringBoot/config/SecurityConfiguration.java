package com.mervecelik.SpringBoot.config;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers("/dashboard").authenticated()//sayfa için login zorunlu
                        .requestMatchers("/index").permitAll()//herkes ulaşabilir
                        .anyRequest().authenticated()
                )
//                .httpBasic()//kullanılmıyor
//                .and()
//                .formLogin();
                .httpBasic(withDefaults()) // httpBasic için güncellenmiş
                .formLogin(withDefaults());

        return http.build();
    }
}
