package army.Soldier;

import army.type.Attack;
import army.type.Defence;
import army.type.Magician;


public class Witch extends Soldier implements Defence, Magician, Attack {



    public Witch (String name, String superPower, int damage){
        super(name,superPower,damage);


    }

    @Override
    public void reportItself() {
        System.out.println(super.getName() + " at your service. " +"With special ability: "+ super.getSuperPower()+ ", type: " + defenceType);

    }

    @Override
    public void doDefence() {
        System.out.println( super.getName() + " deals " + super.getDamage() + " damage.");

    }

    @Override
    public void doMagic() {
        System.out.println( super.getName() +" use "+ super.getSuperPower() + " and turning enemy to the stone for 10 minutes and heals her allies.");

    }

    @Override
    public void doAttack() {
        System.out.println( super.getName() + " deals " + super.getDamage() + " damage.");
    }
}
