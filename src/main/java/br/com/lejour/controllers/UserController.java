package br.com.lejour.controllers;

import br.com.lejour.foo.Foo;
import br.com.lejour.input.*;
import br.com.lejour.output.OutputUserDashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/usertest")
    public ResponseEntity UserEntity() {
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
        return ResponseEntity.ok(outputUserDashboard.getTotalUser());
    }

    @GetMapping("/appointmentstatuscount")
    public ResponseEntity StatusEntity(){
        RestTemplate restTemplate = new RestTemplate();
        Appointment[] forObject = restTemplate.getForObject(Foo.APPOINTMENT.getUrl(), Appointment[].class);
        Map<String, Long> collect = Arrays.stream(forObject).collect(
                Collectors.groupingBy(Appointment::getStatus, Collectors.counting()));

        return ResponseEntity.ok(collect);
    }

    @GetMapping("/appointmentcategorycount")
    public ResponseEntity VendorCategoryEntity(){
        RestTemplate restTemplate = new RestTemplate();
        Appointment[] forObject = restTemplate.getForObject(Foo.APPOINTMENT.getUrl(), Appointment[].class);
        Map<String, Long> collect = Arrays.stream(forObject).collect(
                Collectors.groupingBy(Appointment::getVendorCategory, Collectors.counting()));

        return ResponseEntity.ok(collect);
    }

    @GetMapping("/favoritevendorcount")
    public ResponseEntity FavoriteVentorEntity(){
        WeddingFavorites[] forObject = restTemplate.getForObject(Foo.WEDDING_FAVORITES.getUrl(), WeddingFavorites[].class);
        Map<Integer, Long> collect = Arrays.stream(forObject).collect(
                Collectors.groupingBy(WeddingFavorites::getVendorId, Collectors.counting()));

        return ResponseEntity.ok(collect);

    }

    @GetMapping("/invoiceacceptedcount")
    public ResponseEntity InvoiceAcceptedEntity() {
        Invoice[] forObject = restTemplate.getForObject(Foo.INVOICE.getUrl(), Invoice[].class);
        Map<String, Long> collect = Arrays.stream(forObject).collect(
                Collectors.groupingBy(Invoice::isAccepted, Collectors.counting()));

        return ResponseEntity.ok(collect);
    }
    @GetMapping("/weddingstylecount")
    public ResponseEntity WeddingStyle() {
        Wedding[] forObject = restTemplate.getForObject(Foo.WEDDING.getUrl(), Wedding[].class);
        Map<String, Long> collect = Arrays.stream(forObject).collect(
                Collectors.groupingBy(Wedding::getStyle, Collectors.counting()));

        return ResponseEntity.ok(collect);
    }
}
