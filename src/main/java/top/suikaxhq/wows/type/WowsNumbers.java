package top.suikaxhq.wows.type;

/**
 * 接口 WowsNumbers
 * 提供战绩（伤害、击杀、胜场等）数据。
 */
public interface WowsNumbers {
    int getDamage(); // 伤害
    int getFrags(); // 击杀数
    int getWins(); // 胜场
    int getBattles(); // 总场次
}
