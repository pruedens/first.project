package homework7.transports;

import homework7.AbstractTransport;
import homework7.LocalityType;

public class Horse extends AbstractTransport {
    public Horse() {
        type = "лошадь";
        strength = 50;
    }

    @Override
    public boolean move(int distance, LocalityType localityType) {
        if (localityType != LocalityType.SWAMP && strength > 0) {
            System.out.println("Лошадь перемещается на " + distance + " метров по местности '" + localityType);
            strength -= distance / 5;
            return true;
        } else {
            System.out.println("Лошадь не может перемещаться по данному типу местности или у лошади не хватает сил");
            return false;
        }
    }
}
