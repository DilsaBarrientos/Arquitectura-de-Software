package co.edu.udea.microserviciosudeaqregistration.controller;

public class Home {
    private String name;

    public Home(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
