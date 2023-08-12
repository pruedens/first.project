package homework5;

class Cat extends Animal {
    public Cat(String name, double runningRate, int endurance) {
        super(name, runningRate, 0, endurance);
    }

    @Override
    public double swim(int distance) {
        System.out.println("Кот не умеет плавать");
        return -1;
    }

    @Override
    public double run(int distance) {

        if (endurance < distance) {
            System.out.println(name + " не хватает выносливости для пробежки.");
            return -1;
        }

        double time = distance / runningRate;
        endurance -= distance;
        System.out.println(name + " пробежал " + distance + " метров за " + time + " секунд");
        return time;
    }
}
