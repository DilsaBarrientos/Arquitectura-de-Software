package co.edu.udea.microserviciosudearegistration.controller;

import co.edu.udea.microserviciosudearegistration.model.Home;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "home")
public class HomeController {

    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello %s";

    @GetMapping
    public Home home(@RequestParam(value = "name", defaultValue = "desde el mundo Spring Boot") String name){
        return new Home(10L, String.format(template, name));
    }

}
