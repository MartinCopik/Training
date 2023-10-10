package interfaceTryOuts.classes.mainClass;


import interfaceTryOuts.classes.Animal;
import interfaceTryOuts.classes.Bird;
import interfaceTryOuts.classes.Cat;
import interfaceTryOuts.classes.interfaces.IRuns;

public class MainClass {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Bird bird = new Bird();

        cat.eat();
        cat.jumps();
        cat.run();


        bird.fly();
        bird.eat();

//        Animal zviera = new Animal();
        Animal zviera = new Cat(); //takto by to slo
        IRuns macka3 = (Cat) zviera;
        macka3.run();
        macka3.jumps();

        feedAnimal(cat);
        feedAnimal(bird);

    }
    public static void feedAnimal(Animal animal) {
        animal.eat();
    }
}