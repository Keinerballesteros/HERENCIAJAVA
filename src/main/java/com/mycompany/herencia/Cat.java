
package com.mycompany.herencia;

import animal.animal;

public class Cat extends animal{
    String color;

    public Cat(String color,String hender, String especie, int size, String name) {
        super(hender, especie, size, name);
    }
    
    
    public void play(){
        System.out.println("Soy un gato Jugando");
    }
    
    @Override
    public void talk(){
        System.out.println("Emite maullidos");
    }
}
