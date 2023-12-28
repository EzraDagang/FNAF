package FNAF;

public class Chica extends Monster{
    public void useUniqueAbility(){
        System.out.println("Chica can only be blocked by both flashlight and close door. ");
    }
    
    public int getBatteryReduction(){
        return 8; 
    }
    
    public String toString(){
        return "Chica";
    }
}
