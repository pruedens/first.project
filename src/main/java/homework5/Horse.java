package homework5;


class Horse extends Animal {
    public Horse(String name, double runningRate, double swimmingRate, int endurance) {
        super(name, runningRate, swimmingRate, endurance);
    }

    @Override
    public double swim(int distance) {

        if (endurance < distance * 4) {
            System.out.println(name + " не хватает выносливости для плавания.");
            return -1;
        }

        double time = distance / swimmingRate;
        endurance -= distance * 4;
        System.out.println(name + " проплыл " + distance + " метров за " + time + " секунд");
        return time;
    }

    @Override
    public double run(int distance) {

        if (endurance < distance * 1) {
            System.out.println(name + " не хватает выносливости для пробежки.");
            return -1;
        }

        double time = distance / runningRate;
        endurance -= distance * 1;
        System.out.println(name + " пробежал " + distance + " метров за " + time + " секунд");
        return time;
    }
}
