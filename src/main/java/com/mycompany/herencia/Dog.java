
package com.mycompany.herencia;

import animal.animal;


public class Dog extends animal{
    private String fur;

    public Dog(String fur, String hender, String especie, int size, String name) {
        super(hender, especie, size, name);
        this.fur = fur;
    }
    
    
    public void sniff(){
        System.out.println("Soy un perro olfateando");
    }
    public void talk(){
        System.out.println("Wauuuu");
    }
}
