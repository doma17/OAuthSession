package com.example.oauthsession.oauth2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.oauth2.client.JdbcOAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;

@Configuration
public class CustomOAuth2AuthorizedClientService {

    @Bean
    public OAuth2AuthorizedClientService oAuth2AuthorizedClientService(JdbcTemplate jdbcTemplate, ClientRegistrationRepository clientRegistrationRepository) {

        // In Memory -> JDBC 방식으로 변경
        return new JdbcOAuth2AuthorizedClientService(jdbcTemplate, clientRegistrationRepository);
    }
}
