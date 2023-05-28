package RandomCoding;

public class Balok extends Encapsulation {
    void sayHello(String name){
        System.out.println("Hello , boss" + name);
    }

    void getSayHelloParent(String name){
        super.sayHello(name);
    }


}
