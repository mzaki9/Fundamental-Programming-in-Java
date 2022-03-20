package main;

public class mainApp {
    public static void main(String[] args){
        //instansiasi objek 1
        Character c1 = new Character();
        Weapon cx = new Weapon();
        c1.setName("Lich King");
        c1.setcharClass("Death Knight");
        c1.race = "Undead";
        cx.setweaponName("Frostmourne");
        cx.setweaponType("Sword");
        cx.getDamage();
        c1.printCharacter();
        cx.printWeapon();

         //instansiasi objek 2
         Character c2 = new Character();
         Weapon cx2 = new Weapon();
         c2.setName("Sylvanas Windrunner");
         c2.setcharClass("Necromancer");
         c2.race = "Unknown";
         cx2.setweaponName("Rae'shalare, Death's Whisper");
         cx2.setweaponType("Bow");
         cx2.getDamage();
         c2.printCharacter();
         cx2.printWeapon();
    }
}
