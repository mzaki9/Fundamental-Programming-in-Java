package main;

public class Weapon {
    private String weaponName;
    private String weaponType;
    private int damage = 9999999;

    public Integer getDamage(){
        return this.damage;
    }
    
    public String getweaponName(){
        return this.weaponName;
    }

    public void setweaponName(String weaponName){
        this.weaponName = weaponName;
    }

    public String getweaponType(){
        return this.weaponType;
    }

    public void setweaponType(String weaponType){
        this.weaponType = weaponType;
    }

    void printWeapon(){
        System.out.println("Data Senjata");
        System.out.println("======================");
        System.out.println("Weapon Name = " + this.weaponName);
        System.out.println("Weapon Type = " + this.weaponType);
        System.out.println("Weapon damage = " + this.damage);
        System.out.println("----------------------");
        System.out.println(" ");
        System.out.println(" ");
    }
}
