package army.Soldier;

import army.Soldier.Soldier;

public class Walkira extends Soldier {

    public Walkira (String name, String superPower, int damage){
        super(name,superPower,damage);

        }

    @Override
    public void reportItself() {
        System.out.println( super.getName() + "at your service" + "type:");
    }
}
}
