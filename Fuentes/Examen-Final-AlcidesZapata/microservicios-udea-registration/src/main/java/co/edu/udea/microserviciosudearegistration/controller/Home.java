package co.edu.udea.microserviciosudearegistration.controller;

public class Home {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Home(String name) {
        this.name = name;
    }
}
