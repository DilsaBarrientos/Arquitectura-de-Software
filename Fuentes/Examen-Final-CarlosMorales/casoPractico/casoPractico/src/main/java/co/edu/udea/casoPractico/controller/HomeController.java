package co.edu.udea.casoPractico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;
    @Controller
    @ResponseBody

    public class HomeController{
        private final AtomicLong counter = new AtomicLong();
        private static final String template = "Hola %s";
        @RequestMapping
        public HomeGreetings home(@RequestParam(value = "name", defaultValue = "desde el mundo Spring Boot") String name){
            return new HomeGreetings(10L, String.format(template, name));
        }


    }

