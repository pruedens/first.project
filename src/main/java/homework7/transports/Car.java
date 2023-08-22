package homework7.transports;

import homework7.AbstractTransport;
import homework7.LocalityType;


public class Car extends AbstractTransport {

    private static final LocalityType[] RESTRICTED_TERRAINS = new LocalityType[]{LocalityType.DENSE_FOREST, LocalityType.SWAMP};

    public Car() {
        super("машина", 1000, 0, RESTRICTED_TERRAINS);
    }

    @Override
    public boolean move(int distance, LocalityType localityType) {
        if (canMoveOnTerrain(localityType) && fuel > 0) {
            System.out.println("Машина перемещается на " + distance + " метров по местности " + localityType);
            fuel -= distance / 10;
            return true;
        } else {
            System.out.println("Машина не может перемещаться по данному типу местности или закончился бензин");
            return false;
        }
    }
}