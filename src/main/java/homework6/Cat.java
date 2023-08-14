package homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(Plate plate) {
        if (plate.getCurrentFood() >= appetite) {
            plate.decreaseFood(appetite);
            hungry = false;
            System.out.println(name + " покушал(а) еды из тарелки");
        } else {
            System.out.println(name + " не покушал(а) еды из тарелки, потому что ее там недостаточно");
        }
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return hungry;
    }
}