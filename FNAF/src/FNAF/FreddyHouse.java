package FNAF;

import java.util.Random;

public class FreddyHouse {
    int num;
    
    FreddyHouse(int num){
        this.num = num;
    }
    public Monster[] createMonster(){
        Random rand = new Random();
        Chica chica = new Chica();
        Bonnie bonnie = new Bonnie();
        Fazbear fazbear = new Fazbear();
        Foxy foxy = new Foxy();
        
        Monster[] monster = {chica, bonnie, fazbear, foxy};
        Monster[] round = new Monster[num];
        for(int i=0 ; i<num ; i++){
            round[i] = monster[rand.nextInt(4)];
        }
        
        return round;
    }
    
    public void printMonsterAndAbilities(){
        Chica chica = new Chica();
        Bonnie bonnie = new Bonnie();
        Fazbear fazbear = new Fazbear();
        Foxy foxy = new Foxy();
        System.out.println("\nMonster:");
        chica.useUniqueAbility();
        bonnie.useUniqueAbility();
        fazbear.useUniqueAbility();
        foxy.useUniqueAbility();
    }
}
