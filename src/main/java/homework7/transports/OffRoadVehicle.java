package homework7.transports;

import homework7.AbstractTransport;
import homework7.LocalityType;

public class OffRoadVehicle extends AbstractTransport {
    public OffRoadVehicle() {
        type = "вездеход";
        fuel = 70;
    }

    @Override
    public boolean move(int distance, LocalityType localityType) {
        if (localityType != LocalityType.SWAMP && fuel > 0) {
            System.out.println("Вездеход перемещается на " + distance + " метров по местности '" + localityType);
            fuel -= distance / 15; // Примерное потребление бензина
            return true;
        } else {
            System.out.println("Вездеход не может перемещаться по данному типу местности или закончился бензин");
            return false;
        }
    }
}
