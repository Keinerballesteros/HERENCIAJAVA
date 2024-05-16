

package com.mycompany.herencia;

import com.mycompany.herencia.people.Admin;
import com.mycompany.herencia.people.Person;
import com.mycompany.herencia.people.Students;


public class Herencia {

    public static void main(String[] args) {
        
        //Person person = new Person("Pepito","El Negrito","190872","19");
        Students student = new Students("melo","calo","2098019","12",4.8);
        Admin admin = new Admin("juan","cole","19918","32","Jefe de laboratorio");
        System.out.println("Tu nombre es "+ student.getName());
        System.out.println("Tu promedio es: "+student.getAverage() );
        
        System.out.println("Hola, "+admin.getName());
        admin.doWork();
        
    }
}
