package br.com.lejour.controllers;

import br.com.lejour.foo.Foo;
import br.com.lejour.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @GetMapping("/user")
    public ResponseEntity UserEntity(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Object[]> forEntity = restTemplate.getForEntity(Foo.USER.getUrl(), Object[].class);
        Object[] body = forEntity.getBody();
        return ResponseEntity.ok(body);
    }
}
