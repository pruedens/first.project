package homework7.transports;

import homework7.AbstractTransport;
import homework7.LocalityType;

public class Car extends AbstractTransport {
    public Car() {
        type = "машина";
        fuel = 1000;
    }

    @Override
    public boolean move(int distance, LocalityType localityType) {
        if (localityType != LocalityType.DENSE_FOREST && localityType != LocalityType.SWAMP && fuel > 0) {
            System.out.println("Машина перемещается на " + distance + " метров по местности '" + localityType);
            fuel -= distance / 100;
            return true;
        } else {
            System.out.println("Машина не может перемещаться по данному типу местности или закончился бензин");
            return false;
        }
    }
}
