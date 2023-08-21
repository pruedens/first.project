package homework7;

public class Person {
    private String name;
    private Transport currentTransport;

    public Person(String name) {
        this.name = name;
    }

    public void enterTransport(Transport transport) {
        if (currentTransport != null) {
            System.out.println(name + " сначада должен оказаться от текущего транспорта");
        } else {
            this.currentTransport = transport;
            System.out.println(name + " выбрал транспорт " + currentTransport.getType());
        }
    }

    public void leaveTransport() {
        if (currentTransport != null) {
            System.out.println(name + " отказался от транспорта " + currentTransport.getType());
            currentTransport = null;
        } else {
            System.out.println(name + " сначала должен выбрать транспорт, а потом от него отказаться");
        }
    }

    public boolean move(int distance, LocalityType localityType) {
        if (currentTransport != null) {
            return currentTransport.move(distance, localityType);
        } else {
            System.out.println(name + " осуществляет ходьбу пешком " + distance + " метров по местности '" + localityType);
            return true;
        }
    }
}
