package br.com.lejour.controllers;

import br.com.lejour.foo.Foo;
import br.com.lejour.input.*;
import br.com.lejour.output.OutputUserDashboard;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @GetMapping("/user")
    public ResponseEntity UserEntity(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Object[]> forEntity = restTemplate.getForEntity(Foo.USER.getUrl(), Object[].class);
        Object[] body = forEntity.getBody();
        return ResponseEntity.ok(body);
    }

    @GetMapping("/usercount")
    public ResponseEntity UserDashboardEntity() {
        RestTemplate restTemplate = new RestTemplate();
        User[] forObject = restTemplate.getForObject(Foo.USER.getUrl(), User[].class);
        long count = Arrays.stream(forObject).map(User::getId).count();
        OutputUserDashboard outputUserDashboard = new OutputUserDashboard(count);
        return ResponseEntity.status(HttpStatus.OK).body("Total de Usuarios: " + outputUserDashboard.getTotalUser());
    }

    @GetMapping("/appointmentstatuscount")
    public ResponseEntity StatusCancelledEntity(){
        RestTemplate restTemplate = new RestTemplate();
        Appointment[] forObject = restTemplate.getForObject(Foo.APPOINTMENT.getUrl(), Appointment[].class);
        Map<String, Long> collect = Arrays.stream(forObject).collect(
                Collectors.groupingBy(Appointment::getStatus, Collectors.counting()));

        return ResponseEntity.ok(collect);
    }
}
