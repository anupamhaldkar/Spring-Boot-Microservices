package com.ahdev.bookstore.orders.clients.catalog;

import com.ahdev.bookstore.orders.ApplicationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
class CatalogServiceClientConfig {
    @Bean
    RestClient restClient(RestClient.Builder builder, ApplicationProperties properties) {

        // ClientHttpRequestFactory requestFactory = ClientHttpRequestFactoryBuilder.simple()
        //         .withCustomizer(customizer -> {
        //             customizer.setConnectTimeout(Duration.ofSeconds(5));
        //             customizer.setReadTimeout(Duration.ofSeconds(5));
        //         })
        //         .build();
        // return builder.baseUrl(properties.catalogServiceUrl())
        //         .requestFactory(requestFactory)
        //         .build();
        return RestClient.builder().baseUrl(properties.catalogServiceUrl()).build();
    }
}
