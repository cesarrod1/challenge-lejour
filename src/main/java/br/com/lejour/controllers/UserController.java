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
    RestTemplate restTemplate = new RestTemplate();

    /**
     * Contagem total de usuários.
     * @return
     */
    @GetMapping("/usercount")
    public ResponseEntity UserDashboardEntity() {
        User[] forObject = restTemplate.getForObject(Foo.USER.getUrl(), User[].class);
        long count = Arrays.stream(forObject).map(User::getId).count();
        OutputUserDashboard outputUserDashboard = new OutputUserDashboard(count);
        return ResponseEntity.ok(outputUserDashboard.getTotalUser());
    }

    /**
     * Contagem dos status de visita, que podem ser:
     * CREATED, CONFIRMED, VISITED, CANCELED
     * @return
     */
    @GetMapping("/appointmentstatuscount") // Contagem dos Status de Appointment
    public ResponseEntity StatusEntity() {
        Appointment[] forObject = restTemplate.getForObject(Foo.APPOINTMENT.getUrl(), Appointment[].class);
        Map<String, Long> collect = Arrays.stream(forObject).collect(
                Collectors.groupingBy(Appointment::getStatus, Collectors.counting()));

        return ResponseEntity.ok(collect);
    }

    /**
     * Ranking das categorias de fornecedores mais contratados
     * @return
     */
    @GetMapping("/appointmentcategorycount")
    public ResponseEntity VendorCategoryEntity() {
        Appointment[] forObject = restTemplate.getForObject(Foo.APPOINTMENT.getUrl(), Appointment[].class);
        Map<String, Long> collect = Arrays.stream(forObject).collect(
                Collectors.groupingBy(Appointment::getVendorCategory, Collectors.counting()));

        return ResponseEntity.ok(collect);
    }

    /**
     * Ranking dos fornecedores mais favoritados
     * @return
     */
    @GetMapping("/favoritevendorcount") // TOP fornecedores favoritados
    public ResponseEntity FavoriteVentorEntity() {
        WeddingFavorites[] forObject = restTemplate.getForObject(Foo.WEDDING_FAVORITES.getUrl(), WeddingFavorites[].class);
        Map<Integer, Long> collect = Arrays.stream(forObject).collect(
                Collectors.groupingBy(WeddingFavorites::getVendorId, Collectors.counting()));

        return ResponseEntity.ok(collect);

    }

    /**
     * Contratos Aceitos (TRUE) e Contratos rejeitados (FALSE)
     * @return
     */
    @GetMapping("/invoiceacceptedcount") // TOP contratos aceitos x Cancelados
    public ResponseEntity InvoiceAcceptedEntity() {
        Invoice[] forObject = restTemplate.getForObject(Foo.INVOICE.getUrl(), Invoice[].class);
        Map<String, Long> collect = Arrays.stream(forObject).collect(
                Collectors.groupingBy(Invoice::isAccepted, Collectors.counting()));

        return ResponseEntity.ok(collect);
    }

    @GetMapping("/weddingstylecount") // Tipos de casamentos preferidos
    public ResponseEntity WeddingStyle() {
        Wedding[] forObject = restTemplate.getForObject(Foo.WEDDING.getUrl(), Wedding[].class);
        Map<String, Long> collect = Arrays.stream(forObject).collect(
                Collectors.groupingBy(Wedding::getStyle, Collectors.counting()));

        return ResponseEntity.ok(collect);
    }

    /**
     * Ranking dos fornecedores contratados
     * @return
     */
    @GetMapping("/topvendorcount") // TOP Fornecedores contratados.
    public ResponseEntity Vendor() {
        Invoice[] forObject = restTemplate.getForObject(Foo.INVOICE.getUrl(), Invoice[].class);
        Map<Integer, Long> collect = Arrays.stream(forObject).collect(
                Collectors.groupingBy(Invoice::getVendorId, Collectors.counting()));

        return ResponseEntity.ok(collect);
    }

}
