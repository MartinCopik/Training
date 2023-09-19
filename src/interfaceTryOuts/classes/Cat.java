package interfaceTryOuts.classes;

public class Cat extends Animal{

    @Override
    public void jumps() {
        System.out.println("cat jumps");
    }

    @Override
    public void run() {
        System.out.println("cat runs");
    }
}
