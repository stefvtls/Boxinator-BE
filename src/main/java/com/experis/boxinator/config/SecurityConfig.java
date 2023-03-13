package com.experis.boxinator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {




    // this section permits all, ALL ROUTES PUBLICLY ACCESSIBLE, for early stage of development only
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpsec) throws Exception {
        httpsec
                .cors()
                .and()
                .sessionManagement().disable()
                .csrf().disable()
                .authorizeHttpRequests(authorize -> authorize
                                // routes publicly accessible
                                .anyRequest().permitAll()
                ).oauth2ResourceServer()
                .jwt();
        return httpsec.build();
    }






    // READY SOLUTION FOR PRODUCTION WITH PROTECTION OF THE ENDPOINTS, UNCOMMENT WHOLE SECTION BELOW (two beans).

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity httpsec) throws Exception {
//        httpsec
//                .cors()
//                .and()
//                .sessionManagement().disable()
//                .csrf().disable()
//                .authorizeHttpRequests(authorize -> authorize
//                        // define mapping
//
//                        // routes publicly accessible
////                                .anyRequest().permitAll()
//                        .requestMatchers("/api/v1/resources/public").permitAll()
//
//                        // routes that require admin permissions
//                        .requestMatchers("/api/v1/resources/authorized").hasRole("ADMIN")
//
//                        // routes that to be logged in (on default all of them) - for now uncommented, because for testing is annoying to add new token every five minutes:
//                        .anyRequest().authenticated()
//
//                ).oauth2ResourceServer()
//                .jwt()
//                .jwtAuthenticationConverter(jwtConverter());
//        return httpsec.build();
//    }
//
//    @Bean
//    public JwtAuthenticationConverter jwtConverter() {
//        JwtGrantedAuthoritiesConverter grantedAuthoritiesConverter = new JwtGrantedAuthoritiesConverter();
//        grantedAuthoritiesConverter.setAuthoritiesClaimName("roles");
//        grantedAuthoritiesConverter.setAuthorityPrefix("ROLE_");
//
//        JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
//        jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(grantedAuthoritiesConverter);
//        return jwtAuthenticationConverter;
//    }
}
