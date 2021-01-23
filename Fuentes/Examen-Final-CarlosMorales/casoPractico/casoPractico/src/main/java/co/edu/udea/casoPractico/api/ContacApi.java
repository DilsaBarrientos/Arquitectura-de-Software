package co.edu.udea.casoPractico.api;

import co.edu.udea.casoPractico.dto.Contactos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

public class ContacApi {
        @RestController
        @ResponseBody
        public class ContactApi {

            @GetMapping(value = "/contacts")
            public Contactos contact(){
                return new Contactos (10L, "Carlos", "Morales", "+57 3148460795",
                        "carlose.morales@udea.edu.co");
            }
        }
    }

