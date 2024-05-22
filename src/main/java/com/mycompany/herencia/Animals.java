
package com.mycompany.herencia;

import animal.animal;


public class Animals {
    public static void main(String [] args){
        animal Animal = new animal("desconocida","macho",50,"Generico" );
        
        Cat cat = new Cat("amarillo","mamiferos","hembra",12,"gato");
        
        Dog dog = new Dog("corto","mamifero","Macho",12,"Aquiles");
        
        Animal.talk();
        cat.talk();
        dog.talk();
    }
}
