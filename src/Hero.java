public class Hero {

    private int xp;

    private int damage;

    private String adilyty;

    public Hero(int xp, int damage, String adilyty) {
        this.xp = xp;
        this.damage = damage;
        this.adilyty = adilyty;
    }

    public Hero(int xp, int damage) {
        this.xp = xp;
        this.damage = damage;
    }

    public int getXp() {
        return xp;
    }

    public int getDamage() {
        return damage;
    }

    public String getAdilyty() {
        return adilyty;
    }
}
