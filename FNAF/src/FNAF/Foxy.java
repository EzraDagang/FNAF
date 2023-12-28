package FNAF;

public class Foxy extends Monster{
    public void useUniqueAbility(){
        System.out.println("Foxy can only be blocked by close door.");
    }
    
    public int getBatteryReduction(){
        return 0; 
    }
    
    public String toString(){
        return "Foxy";
    }
}
