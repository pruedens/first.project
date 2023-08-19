package homework7;

public abstract class AbstractTransport implements Transport {
    protected String type;
    protected int fuel;
    protected int strength;

    public String getType() {
        return type;
    }
}
