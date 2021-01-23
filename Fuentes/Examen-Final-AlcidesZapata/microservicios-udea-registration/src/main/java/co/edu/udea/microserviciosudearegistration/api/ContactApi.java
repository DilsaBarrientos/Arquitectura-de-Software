package co.edu.udea.microserviciosudearegistration.api;

import co.edu.udea.microserviciosudearegistration.dto.Contactos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {
@GetMapping(value = "/contactos")
    public Contactos contactos(){
return new Contactos(10L, "Alcides", "Zapata", "+57 3218559034",
        "alaz.gesan@gmail");
    }
}
