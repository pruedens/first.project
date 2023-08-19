package homework7;

import homework7.transports.Bicycle;
import homework7.transports.Car;
import homework7.transports.Horse;
import homework7.transports.OffRoadVehicle;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Петя");
        Car car = new Car();
        Horse horse = new Horse();
        Bicycle bicycle = new Bicycle();
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();

        person.enterTransport(car);
        person.move(100, LocalityType.DENSE_FOREST);
        person.leaveTransport();

        person.enterTransport(horse);
        person.move(100, LocalityType.DENSE_FOREST);
        person.leaveTransport();

        person.enterTransport(bicycle);
        person.move(100, LocalityType.PLAIN);

        person.enterTransport(offRoadVehicle);
        person.move(100, LocalityType.PLAIN);
    }
}
