package co.edu.udea.microserviciosudearegistration.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {

@GetMapping(value = "/hellow")
    public  Home  home (String  name ) {
        return  new  Home ("Hola desde el mundo Spring Boot");
    }
}
