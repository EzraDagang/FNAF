package FNAF;

public class Equipment {
    public Equipment[] createEquipment(Flashlight f, CloseDoor c){
        Equipment[] equipment = {f,c};
        return equipment;
    }
    
    public void equipmentList(){
        System.out.println("this is the equipment");
    }
}

class Flashlight extends Equipment{
    
}

class CloseDoor extends Equipment{
    
}

