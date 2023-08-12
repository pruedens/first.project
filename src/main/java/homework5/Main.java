package homework5;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 5, 200);
        Dog dog = new Dog("Буся", 5, 5, 500);
        Horse horse = new Horse("Буря", 10, 5, 1000);

        cat.info();
        cat.run(50);
        cat.swim(10);

        dog.info();
        dog.run(100);
        dog.swim(20);

        horse.info();
        horse.run(200);
        horse.swim(50);
    }
}
