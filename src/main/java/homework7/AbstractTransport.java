package homework7;

public abstract class AbstractTransport implements Transport {
    protected String type;
    protected int fuel;
    protected int strength;
    private LocalityType[] restrictedTerrains;

    public AbstractTransport(String type, int fuel, int strength, LocalityType[] restrictedTerrains) {
        this.type = type;
        this.fuel = fuel;
        this.strength = strength;
        this.restrictedTerrains = restrictedTerrains;
    }

    @Override
    public boolean canMoveOnTerrain(LocalityType localityType) {
        for (LocalityType restrictedTerrain : restrictedTerrains) {
            if (localityType == restrictedTerrain) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getType() {
        return type;
    }
}
