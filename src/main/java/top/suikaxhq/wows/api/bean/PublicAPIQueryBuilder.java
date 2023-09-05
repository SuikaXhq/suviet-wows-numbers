package top.suikaxhq.wows.api.bean;

import java.util.ArrayList;
import java.util.List;


/**
 * top.suikaxhq.wows.api.bean.PublicAPIQueryBuilder
 * 用于构建Public API Query。一个示例用法如下：
 * Map<String, Object> query = PublicAPIQueryBuilder.newBuilder(PublicAPIQueryType.WARSHIPS_STATISTICS)
 *                                                  .applicationId("1a2b3c4d5e")
 *                                                  .accountId("12345678")
 *                                                  .shipId("567890")
 *                                                  .fields("pvp")
 *                                                  .build().toMap()
 */
public class PublicAPIQueryBuilder {
    private final PublicAPIQueryType beanType;

    // Common
    private String applicationId; // application_id
    private String accountId; // account_id
    private Language language;
    private List<String> fields;
    private List<String> extra;
    private int limit;

    // Account - Players
    private String search;
    private String typePlayers; // type (for search)

    // Account - Player statistics by date
    private List<String> dates;

    // Encyclopedia - Warships
    private List<Nation> nation;
    private List<TypeOfWarships> typeWarships; // type (of warships)
    private int pageNumber;

    // Warships - Statistics of player's ships
    private boolean inGarage; // in_garage
    private List<String> shipId; // ship_id

    public PublicAPIQueryBuilder newBuilder(PublicAPIQueryType beanType) {
        return new PublicAPIQueryBuilder(beanType);
    }

    public ToQueryAble build() throws ClassNotFoundException {
        switch (beanType) {
            case ACCOUNT_PLAYERS -> {
                return buildAccountPlayersQuery();
            }
            case ACCOUNT_PLAYER_STATISTICS_BY_DATE -> {
                return buildAccountPlayerByDateQuery();
            }
            case ENCYCLOPEDIA_WARSHIPS -> {
                return buildEncyclopediaWarshipsQuery();
            }
            case WARSHIPS_STATISTICS -> {
                return buildWarshipsStatisticsQuery();
            }
        }
        throw new ClassNotFoundException(String.format("Public API query type \"%s\" not implemented.", beanType.name()));
    }

    public PublicAPIQueryBuilder applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public PublicAPIQueryBuilder accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public PublicAPIQueryBuilder language(Language language) {
        this.language = language;
        return this;
    }
    public PublicAPIQueryBuilder fields(List<String> fields) {
        for (String field : fields) {
            field(field);
        }
        return this;
    }
    public PublicAPIQueryBuilder field(String field) {
        if (this.fields == null) {
            this.fields = new ArrayList<String>();
        }
        this.fields.add(field);
        return this;
    }
    public PublicAPIQueryBuilder extra(List<String> extra) {
        for (String field : extra) {
            extra(field);
        }
        return this;
    }
    public PublicAPIQueryBuilder extra(String field) {
        if (this.extra == null) {
            this.extra = new ArrayList<String>();
        }
        this.extra.add(field);
        return this;
    }
    public PublicAPIQueryBuilder limit(int limit) {
        this.limit = Math.max(Math.min(limit, 100), 1);
        return this;
    }
    public PublicAPIQueryBuilder search(String search) {
        this.search = search;
        return this;
    }
    public PublicAPIQueryBuilder typeOfSearch(String type) {
        this.typePlayers = type;
        return this;
    }
    public PublicAPIQueryBuilder dates(List<String> dates) {
        for (String date: dates) {
            date(date);
        }
        return this;
    }
    public PublicAPIQueryBuilder date(String date) {
        if (this.dates == null) {
            this.dates = new ArrayList<String>();
        }
        this.dates.add(date);
        return this;
    }
    public PublicAPIQueryBuilder nation(List<Nation> nation) {
        for (Nation nationElement: nation) {
            nation(nationElement);
        }
        return this;
    }
    public PublicAPIQueryBuilder nation(Nation nation) {
        if (this.nation == null) {
            this.nation = new ArrayList<Nation>();
        }
        this.nation.add(nation);
        return this;
    }
    public PublicAPIQueryBuilder typeOfWarships(List<TypeOfWarships> types) {
        for (TypeOfWarships type: types) {
            typeOfWarships(type);
        }
        return this;
    }
    public PublicAPIQueryBuilder typeOfWarships(TypeOfWarships type) {
        if (this.typeWarships == null) {
            this.typeWarships = new ArrayList<TypeOfWarships>();
        }
        this.typeWarships.add(type);
        return this;
    }
    public PublicAPIQueryBuilder pageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public PublicAPIQueryBuilder inGarage(boolean inGarage) {
        this.inGarage = inGarage;
        return this;
    }
    public PublicAPIQueryBuilder shipId(List<String> shipIds) {
        for (String shipId: shipIds) {
            shipId(shipId);
        }
        return this;
    }
    public PublicAPIQueryBuilder shipId(String shipId) {
        if (this.shipId == null) {
            this.shipId = new ArrayList<String>();
        }
        this.shipId.add(shipId);
        return this;
    }

    private PublicAPIQueryBuilder(PublicAPIQueryType beanType) {
        this.beanType = beanType;
    }

    private AccountPlayersQuery buildAccountPlayersQuery() {
        return new AccountPlayersQuery(
                applicationId,
                language,
                fields,
                search,
                limit,
                typePlayers
        );
    }
    private AccountPlayerByDateQuery buildAccountPlayerByDateQuery() {
        return new AccountPlayerByDateQuery(
                applicationId,
                accountId,
                language,
                fields,
                extra,
                dates
        );
    }
    private EncyclopediaWarshipsQuery buildEncyclopediaWarshipsQuery() {
        return new EncyclopediaWarshipsQuery(
                applicationId,
                language,
                nation,
                fields,
                extra,
                shipId,
                limit,
                pageNumber,
                typeWarships
        );
    }
    private WarshipsStatisticsQuery buildWarshipsStatisticsQuery() {
        return new WarshipsStatisticsQuery(
                applicationId,
                accountId,
                language,
                fields,
                extra,
                shipId,
                inGarage
        );
    }
}
