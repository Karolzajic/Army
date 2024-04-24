package army.Soldier;

import army.Soldier.Soldier;

public class Witch extends Soldier {

    public Witch (String name, String superPower, int damage){
        super(name,superPower,damage);

    }

    @Override
    public void reportItself() {
        System.out.println(super.getName() + "at your service." + "type:");

    }
}
