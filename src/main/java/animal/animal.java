
package animal;

public class animal {
    String hender;
    String especie;
    int size;
    String name;

    public animal(String hender, String especie, int size, String name) {
        this.hender = hender;
        this.especie = especie;
        this.size = size;
        this.name = name;
    }
    
    public void talk(){
        System.out.println("Say something");
    }
}
