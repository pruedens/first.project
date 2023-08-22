package homework7.transports;

import homework7.AbstractTransport;
import homework7.LocalityType;

public class Bicycle extends AbstractTransport {

    private static final LocalityType[] RESTRICTED_TERRAINS = new LocalityType[]{LocalityType.SWAMP};
    public Bicycle() {
        super("велосипед", 0, 150, RESTRICTED_TERRAINS);
    }

    @Override
    public boolean move(int distance, LocalityType localityType) {
        if (canMoveOnTerrain(localityType) && strength > 0) {
            System.out.println("Велосипед перемещается на " + distance + " метров по местности " + localityType);
            strength -= distance / 10;
            return true;
        } else {
            System.out.println("Велосипед не может перемещаться по данному типу местности или у водителя не хватает сил");
            return false;
        }
    }
}