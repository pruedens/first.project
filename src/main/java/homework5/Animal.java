package homework5;

public class Animal {
    protected String name;
    protected double runningRate;
    protected double swimmingRate;
    protected int endurance;

    public Animal(String name, double runningRate, double swimmingRate, int endurance) {
        this.name = name;
        this.runningRate = runningRate;
        this.swimmingRate = swimmingRate;
        this.endurance = endurance;
    }

    public double run(int distance) {

        if (endurance < distance) {
            System.out.println(name + " не хватает выносливости для пробежки.");
            return -1;
        }

        if (runningRate == 0) {
            System.out.println(name + " не умеет бегать.");
            return -1;
        }

        double time = distance / runningRate;
        endurance -= distance;
        System.out.println(name + " пробежал " + distance + " метров за " + time + " секунд");
        return time;
    }

    public double swim(int distance) {

        if (endurance < distance) {
            System.out.println(name + " не хватает выносливости для плаванья.");
            return -1;
        }

        if (swimmingRate == 0) {
            System.out.println(name + " не умеет плавать.");
            return -1;
        }

        double time = distance / swimmingRate;
        System.out.println(name + " проплыл " + distance + " метров за " + time + " секунд");
        return time;
    }

    public void info() {
        System.out.println("Имя: " + name + ", Выносливость: " + endurance + ", Скорость бега: " + runningRate + " м/с, Скорость плавания: " + swimmingRate + " м/с");
    }
}
