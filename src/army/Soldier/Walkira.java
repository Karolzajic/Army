package army.Soldier;

import army.type.Attack;

public class Walkira extends Soldier implements Attack {

    public Walkira(String name, String superPower, int damage) {
        super(name, superPower, damage);

    }

    @Override
    public void reportItself() {
        System.out.println(super.getName() + " at your service. "  + "With special ability: "+ super.getSuperPower()+ " , type: " + attacktype);
    }

    @Override
    public void doAttack() {
        System.out.println( super.getName() + " deals " + super.getDamage() + " damage");

    }
}
