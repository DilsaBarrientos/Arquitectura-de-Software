package co.edu.udea.microserviciosudeaqregistration.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {
   private String name;

    @RequestMapping(value = "/hellow")
    public String Home(){
        return ("hola desde el mundo spring boot");
    }



}
