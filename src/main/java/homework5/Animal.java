package homework5;

public class Animal {
    protected String name;
    protected double runningRate;
    protected double swimmingRate;
    protected int endurance;
    protected double runEnduranceCoefficient;
    protected double swimEnduranceCoefficient;

    public Animal(String name, double runningRate, double swimmingRate, int endurance, double runEnduranceCoefficient, double swimEnduranceCoefficient) {
        this.name = name;
        this.runningRate = runningRate;
        this.swimmingRate = swimmingRate;
        this.endurance = endurance;
        this.runEnduranceCoefficient = runEnduranceCoefficient;
        this.swimEnduranceCoefficient = swimEnduranceCoefficient;
    }

    public double run(int distance) {

        if (runningRate == 0) {
            System.out.println(name + " не умеет бегать.");
            return -1;
        }

        if (endurance < distance * runEnduranceCoefficient) {
            System.out.println(name + " не хватает выносливости для пробежки.");
            return -1;
        }

        double time = distance / runningRate;
        endurance -= distance * runEnduranceCoefficient;
        System.out.println(name + " пробежал " + distance + " метров за " + time + " секунд");
        return time;
    }

    public double swim(int distance) {

        if (swimmingRate == 0) {
            System.out.println(name + " не умеет плавать.");
            return -1;
        }

        if (endurance < distance * swimEnduranceCoefficient) {
            System.out.println(name + " не хватает выносливости для плаванья.");
            return -1;
        }

        double time = distance / swimmingRate;
        endurance -= distance * swimEnduranceCoefficient;
        System.out.println(name + " проплыл " + distance + " метров за " + time + " секунд");
        return time;
    }

    public void info() {
        System.out.println("Имя: " + name + ", Выносливость: " + endurance + ", Скорость бега: " + runningRate + " м/с, Скорость плавания: " + swimmingRate + " м/с");
    }
}