package FNAF;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flashlight f = new Flashlight();
        CloseDoor cd = new CloseDoor();
        Charachter character = new Charachter();
        Equipment[] eqList = character.createEquipment(f,cd);
        
        character.equipmentList();
        
        FreddyHouse freddyHouse = new FreddyHouse(15);
        Monster[] monsList = freddyHouse.createMonster();
        freddyHouse.printMonsterAndAbilities();
        
        if(surviveTheNight(monsList, eqList, character)){
            System.out.println("Congrats !! You survive the night!!");
        }
        else
            System.out.println("Boohoo You DIED :(");
    }
    
    public static boolean surviveTheNight(Monster[] monsList, Equipment[] eqList, Charachter character){
        String choice;
        boolean alive = true;
        for(int i=0 ; i<monsList.length ; i++){
            System.out.println("Monster List " + (i+1) + " : " + monsList[i].toString());   
        }
        
        for(int i=0 ; i<monsList.length ; i++){
            System.out.println("\nround 1: " + monsList[i].toString());
            System.out.println("flashlight: " + (eqList[0].battery>=0? eqList[0].battery : 0));
            System.out.println("close door: " + (eqList[1].doorUses>=0? eqList[1].doorUses : 0));
            choice = options();
            alive = character.useEquipment(choice, monsList[i]);
            if(!alive){
                return alive;
            }
            System.out.println("flashlight: " + (eqList[0].battery>=0? eqList[0].battery : 0));
            System.out.println("close door: " + (eqList[1].doorUses>=0? eqList[1].doorUses : 0));
        }
        return alive;
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
