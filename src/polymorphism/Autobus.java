package polymorphism;

public class Autobus extends Vehicle{

    int kW;
    String colour;

    public Autobus(int kW, String colour){
        this.kW = kW;
        this.colour = colour;
    }

    public String getColour(){
        return colour;
    }
    public int getkW() {
        return kW;
    }

    void engineStart() {
        super.engineStart();
        System.out.println("Start of the Autobus engine");
    }
}
