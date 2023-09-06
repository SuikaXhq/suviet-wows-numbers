package top.suikaxhq.wows.api.bean;

/**
 * Public API query类型，用于指定PublicAPIQueryBuilder类型
 * @see PublicAPIQueryBuilder
 */
public enum PublicAPIQueryType {
    /**
     * @see AccountPlayersQuery
     */
    ACCOUNT_PLAYERS,
    /**
     * @see AccountPlayerByDateQuery
     */
    ACCOUNT_PLAYER_STATISTICS_BY_DATE,
    /**
     * @see EncyclopediaWarshipsQuery
     */
    ENCYCLOPEDIA_WARSHIPS,
    /**
     * @see WarshipsStatisticsQuery
     */
    WARSHIPS_STATISTICS;


}
