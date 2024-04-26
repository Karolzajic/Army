package army;

import army.Soldier.Soldier;
import army.type.Attack;
import army.type.Defence;
import army.type.Insidious;
import army.type.Magician;

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
            if (soldier instanceof Attack) {
                ((Attack) soldier).doAttack();
            }
        }

    }

    public void beBad(){
        System.out.println("---------BAD LUCK--------");
        for (Soldier soldier: soldiers){
            if (soldier instanceof Insidious){
               ((Insidious) soldier).beBad();

            }
        }
    }

    public void doDefence(){
        System.out.println("---------DEFENCE--------");
        for (Soldier soldier: soldiers){
            if (soldier instanceof Defence){
                ((Defence) soldier).doDefence();
            }
        }
    }

    public void doMagic (){
        System.out.println("---------MAGIC ATTACK--------");for (Soldier soldier: soldiers){
            if (soldier instanceof Magician){
                ((Magician) soldier).doMagic();
            }
        }
    }



}





