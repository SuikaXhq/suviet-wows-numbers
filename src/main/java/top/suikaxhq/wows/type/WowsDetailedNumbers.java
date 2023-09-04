package top.suikaxhq.wows.type;

/**
 * 接口 WowsDetailedNumbers
 * 提供战绩（伤害、击杀、胜场等）数据，进一步包含命中率、潜在伤害等细节数据。
 */
public interface WowsDetailedNumbers extends WowsNumbers {
    int getArtAgro(); // 潜在伤害
    int getDamageScouting(); // 侦查伤害
    int getShotsByMain(); // 主炮射击数
    int getHitsByMain(); // 主炮命中数
    int getShotsByTorp(); // 鱼雷射击数
    int getHitsByTorp(); // 鱼雷命中数
}
