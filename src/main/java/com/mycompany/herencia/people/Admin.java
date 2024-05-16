
package com.mycompany.herencia.people;


public class Admin extends Person{
    private String rol;

    public Admin(String name, String lastname, String id, String age, String rol) {
        super(name, lastname, id, age);
        this.rol = rol;
    }
    
    public void doWork(){
        System.out.println("Estoy trabajando");
    }
}
