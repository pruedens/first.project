package homework7.transports;

import homework7.AbstractTransport;
import homework7.LocalityType;

public class OffRoadVehicle extends AbstractTransport {

    private static final LocalityType[] RESTRICTED_TERRAINS = new LocalityType[0];
    public OffRoadVehicle() {
        super("вездеход", 70, 0, RESTRICTED_TERRAINS);
    }

    @Override
    public boolean move(int distance, LocalityType localityType) {
        if (canMoveOnTerrain(localityType) && fuel > 0) {
            System.out.println("Вездеход перемещается на " + distance + " метров по местности " + localityType);
            fuel -= distance / 15;
            return true;
        } else {
            System.out.println("Вездеход не может перемещаться по данному типу местности или закончился бензин");
            return false;
        }
    }
}
