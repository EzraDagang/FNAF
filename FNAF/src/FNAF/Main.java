package FNAF;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flashlight f = new Flashlight();
        CloseDoor cd = new CloseDoor();
        Charachter character = new Charachter();
        Equipment[] eqList = character.createEquipment(f,cd);
        
        character.equipmentList();
        
        FreddyHouse freddyHouse = new FreddyHouse(8);
        Monster[] monsList = freddyHouse.createMonster();
        freddyHouse.printMonsterAndAbilities();
        
        surviveTheNight(monsList, eqList);
    }
    
    public static void surviveTheNight(Monster[] monsList, Equipment[] eqList){
        for(int i=0 ; i<monsList.length ; i++){
            System.out.println("Monster List: " + monsList[i].toString());   
        }
    }
    
    public static String options(){
        Scanner keyboard = new Scanner(System.in);
        
        String choice;
        
        System.out.println("[A] Flashlight\n[B] Close Door\n[C] Both");
        choice = keyboard.nextLine(); 
        
        while(!(choice.equalsIgnoreCase("a")) && !(choice.equalsIgnoreCase("b")) && !(choice.equalsIgnoreCase("c"))){
            System.out.println("Invalid input. Try again.");
            choice = keyboard.nextLine(); 
        }
        
        return choice; 
    }
    
    
}
