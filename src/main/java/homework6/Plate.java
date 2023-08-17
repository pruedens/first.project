package homework6;

public class Plate {
    private int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void addFood(int amount) {
        if (currentFood + amount <= maxFood) {
            currentFood += amount;
        } else {
            System.out.println("В тарелке лежит максимальное количество еды.");
        }
    }

    public boolean decreaseFood(int amount) {
        if (currentFood >= amount) {
            currentFood -= amount;
            return true;
        } else {
            System.out.println("В тарелке нет еды.");
            return false;
        }
    }

    public int getMaxFood() {
        return maxFood;
    }

    public int getCurrentFood() {
        return currentFood;
    }
}
