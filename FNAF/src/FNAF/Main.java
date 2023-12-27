package FNAF;

public class Main {
    public static void main(String[] args) {
        Flashlight f = new Flashlight();
        CloseDoor cd = new CloseDoor();
        Charachter c = new Charachter();
        Equipment[] eqList = c.createEquipment(f,cd);
        c.equipmentList();
        
    }
}
