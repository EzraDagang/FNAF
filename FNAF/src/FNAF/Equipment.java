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
    
}
