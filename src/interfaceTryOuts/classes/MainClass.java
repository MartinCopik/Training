package interfaceTryOuts.classes;


import interfaceTryOuts.interfacesIvanSkuska.IJumps;

public class MainClass {
    public static void main(String[] args) {

        IJumps kity = new Cat();
        kity.jumps();

        kity.run();

        Cat kocur = new Cat();
        kocur.run();

    }
}
