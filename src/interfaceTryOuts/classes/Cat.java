package interfaceTryOuts.classes;

import interfaceTryOuts.classes.interfaces.IRuns;

public class Cat extends Animal implements IRuns {


    public void jumps() {
        System.out.println("cat jumps");
    }

    public void run() {
        System.out.println("cat runs");
    }
    public void eat() {
        System.out.println("cat is eating");
    }
}
