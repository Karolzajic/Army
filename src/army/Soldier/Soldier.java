package army.Soldier;

public abstract class Soldier {

    private final String name;

    private final String superPower;

    int damage;

    public Soldier(String name, String superPower,int damage){
        this.name = name;
        this.superPower = superPower;
        this.damage= damage;
    }

    public String getName() {
        return name;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public abstract void reportItself();
}
