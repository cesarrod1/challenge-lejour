package br.com.lejour.utils.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateBeans {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
