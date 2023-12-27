package FNAF;

public class Equipment {
    String name;
    static int battery;
    static int doorUses;
    public Equipment[] createEquipment(Flashlight f, CloseDoor c){
        Equipment[] equipment = {f,c};
        return equipment;
    }
    
    public String getName(){
        return name;
    }
    
    public void equipmentList(){
        System.out.println("Equipment List:");
        System.out.println("Flashlight Battery : " + battery);
        System.out.println("CloseDoor : " + doorUses);
    }
}

class Flashlight extends Equipment{
    
    Flashlight(){
        name = "Flashlight";
        battery = 100;
    }
}

class CloseDoor extends Equipment{
    
    CloseDoor(){
        name = "CloseDoor";
        doorUses = 10;
    }
}

class Charachter extends Equipment{
    public boolean useEquipment(String equipmentName , Monster monster){
        if(equipmentName.equalsIgnoreCase("Flashlight"))
            battery -= monster.getBatteryReduction();
        
        else if(equipmentName.equalsIgnoreCase("closedoor"))    
            doorUses--;
        
        else{
            battery -= monster.getBatteryReduction();
            doorUses--;
        }
        
        if(monster.toString().equals("Foxy") || monster.toString().equals("Chica") || battery<0)
            return false;
        if(monster.toString().equals("Bonnie") || monster.toString().equals("Chica") || doorUses<0)
            return false;
        if(monster.toString().equals("Fazbear") || doorUses<0 && battery<0)
            return false;
        return true;
    }
}
