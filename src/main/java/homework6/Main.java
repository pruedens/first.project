package homework6;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Мурзик", 15),
                new Cat("Васька", 8)};

        Plate plate = new Plate(30);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        System.out.println("Состояние котов:");
        for (Cat cat : cats) {
            if (cat.isHungry()) {
                System.out.println(cat.getName() + " голодный(ая)");
            } else {
                System.out.println(cat.getName() + " сытый(ая)");
            }
        }
    }
}
