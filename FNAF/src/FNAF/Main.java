package FNAF;

public class Main {
    public static void main(String[] args) {
        Flashlight f = new Flashlight();
        CloseDoor cd = new CloseDoor();
        Charachter c = new Charachter();
        Equipment[] eqList = c.createEquipment(f,cd);
        c.equipmentList();
        FreddyHouse freddyHouse = new FreddyHouse(8);
        Monster[] monsList = freddyHouse.createMonster();
        freddyHouse.printMonsterAndAbilities();
    }
    
    public static void surviveTheNight(Monster[] monsList, Equipment[] eqList){
        for(int i=0 ; i<monsList.length)
    }
}
