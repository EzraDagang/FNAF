package FNAF;

public class Fazbear extends Monster{
    public void useUniqueAbility(){
        System.out.println("Fazbear can only be blocked by flashlight or close door.");
    }
    
    public int getBatteryReduction(){
        return 5; 
    }
    
    public String toString(){
        return "Fazbear";
    }
}
