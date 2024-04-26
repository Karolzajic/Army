package army.Soldier;

import army.type.Adaptable;
import army.type.Attack;
import army.type.Insidious;

public class Warrior extends Soldier implements Attack, Adaptable, Insidious {

    public Warrior (String name, String superPower, int damage){
        super (name,superPower, damage);
    }

    @Override
    public void reportItself() {
        System.out.println(super.getName() + " at your service. "  + "With special ability: "+ super.getSuperPower()+ " , type: " + adaptableType);

    }

    @Override
    public void doAttack() {

    }

    @Override
    public void beBad() {

    }
}

