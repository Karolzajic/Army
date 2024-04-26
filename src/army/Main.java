package army;

import army.Soldier.Walkira;
import army.Soldier.Warrior;
import army.Soldier.Witch;

public class Main {
    public static void main(String[] args) {
        final Walkira walkira1 = new Walkira("Walkira Elen", "magic sword", 10);
        final Walkira walkira2 = new Walkira("Walkira Moore", "teleport ability", 12);
        final Witch witch1 = new Witch("Witch Sabrina", "magic cat Salem", 9);
        final Witch witch2 = new Witch("Witch Baba Jaga", "Gingerbread house full of children",20);
        final Warrior warrior1 = new Warrior("Warrior Eleven", "telekinesis",11);
        final Warrior warrior2 = new Warrior ("Warrior Chuck Norris","all super powers of the universe ",1);

        final PrincessArmy princessArmy = new PrincessArmy();
        princessArmy.addSoldier(walkira1);
        princessArmy.addSoldier(walkira2);
        princessArmy.addSoldier(witch1);
        princessArmy.addSoldier(witch2);
        princessArmy.addSoldier(warrior1);
        princessArmy.addSoldier(warrior2);

        System.out.println("---------PRINCESS ARMY---------");
        System.out.println();

        princessArmy.report();

        System.out.println();
        princessArmy.attack();

        System.out.println();
        princessArmy.doDefence();

        System.out.println();
        princessArmy.beBad();

        System.out.println();
        princessArmy.doMagic();








    }

}
