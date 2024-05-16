
package com.mycompany.herencia.people;


public class Person {
    private String  name;
    private String lastname;
    private String id;
    private String age;

    public Person(String name, String lastname, String id, String age) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

   
    
}
