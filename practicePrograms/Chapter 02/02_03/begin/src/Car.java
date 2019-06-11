import java.awt.*;

public class Car {

    // Data Types:
    // int -> integer 1, 2, 3
    // double -> decimal 34.5, 32.1
    // String -> "a1a2" or "Hello World"
    // Color -> from awt library
    // boolean -> true or false

    doulble averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;

    //initializing the variables
    public Car(double inputAverageMPG,
               String inputLicensePlate,
               Color inputPaintColor,
               boolean inputAreTailingWorking){
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailingWorking = inputAreTailingWorking
    }
}
