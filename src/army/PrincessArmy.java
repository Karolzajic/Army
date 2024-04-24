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
}
