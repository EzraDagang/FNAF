package FNAF;

public class Fazbear extends Monster{
    public void useUniqueAbility(){
        System.out.println("Bonnie can be blocked by flashlight or close door.");
    }
    
    public int getBatteryReduction(){
        return 1; 
    }
    
    public String toString(){
        return "Fazbear";
    }
}
