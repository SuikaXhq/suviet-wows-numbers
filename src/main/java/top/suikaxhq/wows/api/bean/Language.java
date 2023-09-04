package top.suikaxhq.wows.api.bean;

public enum Language {
    ZH_CN("zh-cn"),
    EN("en"),
    ZH_TW("zh-tw"),
    JA("ja");

    private Language(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    private final String name;

}
