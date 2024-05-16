
package com.mycompany.herencia.people;


public class Students extends Person{
    Double average;

    public Students(String name, String lastname, String id, String age, double average) {
        super(name, lastname, id, age);
        this.average = average;
    }
    
    public void study(){
        System.out.println("Voy a estudiar");
    }
    public void homework(){
        System.out.println("Voy a hacer tarea");
       
    }
    public void goToClass(){
        System.out.println("Me voy pa' clase");
    }

    public double getAverage() {
        return average;
    }
    
}
