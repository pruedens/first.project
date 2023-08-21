package homework7.transports;

import homework7.AbstractTransport;
import homework7.LocalityType;

public class Horse extends AbstractTransport {
    public Horse() {
        super("лошадь", 0, 100, new LocalityType[]{LocalityType.SWAMP});
    }

    @Override
    public boolean move(int distance, LocalityType localityType) {
        if (canMoveOnTerrain(localityType) && strength > 0) {
            System.out.println("Лошадь перемещается на " + distance + " метров по местности " + localityType);
            strength -= distance / 20;
            return true;
        } else {
            System.out.println("Лошадь не может перемещаться по данному типу местности или у лошади не хватает сил");
            return false;
        }
    }
}
