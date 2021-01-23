package co.edu.udea.microserviciosudeaqregistration.api;

import co.edu.udea.microserviciosudeaqregistration.dto.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {
    @GetMapping(value = "/contact")
    public Contact contact(){
        return new Contact(10L, "Leonel", "Zapata", "+57 3136497466",
                "lalfonso.zapata@udea.edu.co");
    }
}
