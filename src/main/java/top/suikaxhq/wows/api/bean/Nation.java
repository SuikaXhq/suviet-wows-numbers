package top.suikaxhq.wows.api.bean;

public enum Nation {
    COMMONWEALTH("commonwealth"),
    EUROPE("europe"),
    NETHERLANDS("netherlands"),
    ITALY("italy"),
    USA("usa"),
    PAN_ASIA("pan_asia"),
    FRANCE("france"),
    USSR("ussr"),
    GERMANY("germany"),
    UK("uk"),
    JAPAN("japan"),
    SPAIN("spain"),
    PAN_AMERICA("pan_america");

    private Nation(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    private final String name;
}
