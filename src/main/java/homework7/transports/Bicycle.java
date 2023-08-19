package homework7.transports;

import homework7.AbstractTransport;
import homework7.LocalityType;

public class Bicycle extends AbstractTransport {
    private int Strength;

    public Bicycle() {
        type = "велосипед";
        Strength = 150;
    }

    @Override
    public boolean move(int distance, LocalityType localityType) {
        if (localityType != LocalityType.SWAMP && Strength > 0) {
            System.out.println("Велосипед перемещается на " + distance + " метров по местности " + localityType);
            Strength -= distance / 5;
            return true;
        } else {
            System.out.println("Велосипед не может перемещаться по данному типу местности или у водителя не хватает сил");
            return false;
        }
    }
}