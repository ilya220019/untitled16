public class Hero {
    private int health;
    private int damage;
    private String superSila;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperSila() {
        return superSila;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, int damage, String superSila) {
        this.health = health;
        this.damage = damage;
        this.superSila = superSila;
    }
}
