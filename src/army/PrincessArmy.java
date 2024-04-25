package army;

import army.Soldier.Soldier;

import java.util.ArrayList;
import java.util.List;

public class PrincessArmy {

    private final List<Soldier> soldiers;

    public PrincessArmy() {this.soldiers = new ArrayList<>();}

    public void addSoldier(Soldier soldier) {
        this.soldiers.add(soldier);}

    public void report(){
        System.out.println("---------REPORT---------");
        for (Soldier soldier: soldiers) {
            soldier.reportItself();
        }
    }
    public void attack() {
        System.out.println("---------ATTACK--------");
        for (Soldier soldier : soldiers) {
             soldier.doAttack();
        }
    }
    public void defence() {
        System.out.println("---------DEFENCE--------");
        for (Soldier soldier : soldiers) {
            soldier.doDefence();
        }
    }

    public void doMagic() {
        System.out.println("---------MAGIC ATTACK--------");
        for (Soldier soldier : soldiers) {
            soldier.doMagic();
        }
    }
    public void beBad() {
        System.out.println("---------BAD LUCK--------");
        for (Soldier soldier : soldiers) {
            soldier.beBad();
        }
    }




}
