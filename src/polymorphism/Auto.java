package polymorphism;

public class Auto extends Vehicle{
    int kW;
    String colour;

    public Auto(int kW, String colour){
        this.kW = kW;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
    public int getkW() {
        return kW;
    }

    void engineStart() {
        super.engineStart();
        System.out.println("Start of the Auto engine");
    }
}
