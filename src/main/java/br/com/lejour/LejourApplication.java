package br.com.lejour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootApplication
public class LejourApplication {

	public static void main(String[] args) {
		SpringApplication.run(LejourApplication.class, args);
	}

}
