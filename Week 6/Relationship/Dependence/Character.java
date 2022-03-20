package main;

public class Character {
    //state /data field
    private String name;
    private String charClass;
    String race;
    

    //behaviour
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getcharClass(){
        return this.charClass;
    }

    public void setcharClass(String charClass){
        this.charClass = charClass;
    }

    void printCharacter(){
        System.out.println("Data Karakter");
        System.out.println("======================");
        System.out.println("Name = " + this.name);
        System.out.println("Character Class = " + this.charClass);
        System.out.println("Character race = " + this.race);
        System.out.println(" ");
    }
}
