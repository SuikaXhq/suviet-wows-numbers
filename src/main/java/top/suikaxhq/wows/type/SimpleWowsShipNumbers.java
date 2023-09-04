package top.suikaxhq.wows.type;

public class SimpleWowsShipNumbers implements WowsNumbers {
    private int damage;
    private int frags;
    private int wins;
    private int battles;

    public SimpleWowsShipNumbers(int damage, int frags, int wins, int battles) {
        this.damage = damage;
        this.frags = frags;
        this.wins = wins;
        this.battles = battles;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getFrags() {
        return frags;
    }

    public void setFrags(int frags) {
        this.frags = frags;
    }

    @Override
    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public int getBattles() {
        return battles;
    }

    public void setBattles(int battles) {
        this.battles = battles;
    }
}
