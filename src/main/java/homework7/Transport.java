package homework7;

public interface Transport {
    boolean move(int distance, LocalityType localityType);

    String getType();
}