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
        System.out.println(name + " отказался от транспорта " + currentTransport.getType());
        currentTransport = null;
    }

    public boolean move(int distance, LocalityType localityType) {
        if (currentTransport != null) {
            return currentTransport.move(distance, localityType);
        } else {
            System.out.println(name + " осуществляется ходьбу пешком " + distance + " метров по местности '" + localityType);
            return true;
        }
    }
}
