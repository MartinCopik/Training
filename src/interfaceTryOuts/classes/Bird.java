package interfaceTryOuts.classes;

import interfaceTryOuts.classes.interfaces.IFly;

public class Bird extends Animal implements IFly {

    public void fly(){
        System.out.println("bird fly");
    }

}
