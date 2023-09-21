package interfaceTryOuts.classes.mainClass;


import interfaceTryOuts.classes.Animal;
import interfaceTryOuts.classes.Cat;
import interfaceTryOuts.interfaces.IRuns;

public class MainClass {
    public static void main(String[] args) {

        /*IJumps kity = new Cat();
        kity.jumps();
        kity.run();

        Cat kocur = new Cat();
        kocur.run();
        kocur.jumps();
        kocur.crawls();*/

        Animal zviera = new Animal();
        IRuns macka3 = (Cat)zviera;
        macka3.run();
        macka3.jumps();

//        macka3.eat();
//        nema pristup



    }
}
