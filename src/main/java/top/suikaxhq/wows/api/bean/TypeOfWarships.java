package top.suikaxhq.wows.api.bean;

public enum TypeOfWarships {
    AIR_CARRIER("AirCarrier"),
    BATTLESHIP("Battleship"),
    DESTROYER("Destroyer"),
    CRUISER("Cruiser"),
    SUBMARINE("Submarine");

    private TypeOfWarships(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    private final String name;
}
