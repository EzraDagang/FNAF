package FNAF;

public class Bonnie extends Monster{
    public void useUniqueAbility(){
        System.out.println("Bonnie can only be blocked by flashlight.");
    }
    
    public int getBatteryReduction(){
        return 1; 
    }
    
    public String toString(){
        return "Bonnie";
    }
}
