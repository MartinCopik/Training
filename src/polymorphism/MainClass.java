package polymorphism;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        Vehicle myAutobus = new Autobus(121, "white");
        Vehicle myAuto = new Auto(135, "blue");

        Vehicle[] fieldOfVehicleObjets = new Vehicle[3];
        fieldOfVehicleObjets[0] = myAutobus;
        fieldOfVehicleObjets[1] = new Auto(85,"red");
        fieldOfVehicleObjets[2] = myAuto;

        for (Vehicle joyo : fieldOfVehicleObjets){
            joyo.engineStart();
        }

        System.out.println("second ");
        for (int i = 0; i < fieldOfVehicleObjets.length; i++){
            fieldOfVehicleObjets[i].engineStart();
        }
    }
}
