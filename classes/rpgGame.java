public class rpgGame {
    public static void main(String[] args){
        Wizard wizard = new Wizard("Merlin",100, 10,5);
        Warrior warrior = new Warrior("Ragnar",100,7,10);
        Archer archer = new Archer("Legolas",100,6,8);
        System.out.println(wizard.getName() + "'s health: " + wizard.getHealth());
        System.out.println(warrior.getName()+"'s health: " + warrior.getHealth());
        System.out.println(archer.getName()+"'s health: " + archer.getHealth());
        System.out.println("Game is starting...");
        System.out.println(warrior.getName()+" attacks " + wizard.getName() + ". Health updated: " + wizard.getHealth());
        System.out.println(warrior.getName()+" attacks " + archer.getName() + ". Health updated: " + archer.getHealth());
        System.out.println(wizard.getName()+" attacks " + warrior.getName() + ". Health updated: " + warrior.getHealth());
        System.out.println(wizard.getName()+" attacks " + archer.getName() + ". Health updated: " + archer.getHealth());
        System.out.println(archer.getName()+" attacks " + wizard.getName() + ". Health updated: " + wizard.getHealth());
        System.out.println(archer.getName()+" attacks " + warrior.getName() + ". Health updated: " + warrior.getHealth());
        wizard.setHealth(warrior);
        warrior.setHealth(wizard);
        archer.setHealth(archer);
    }
}
class Wizard {
    private String name;
    private int health;
    private int darkMagic;
    private int wizardArmor;

    public Wizard(String name, int health, int darkMagic, int wizardArmor){
        this.name = name;
        this.health = health;
        this.darkMagic = darkMagic;
        this.wizardArmor = wizardArmor;
    }
    public String getName() {
        return name;
    }
    public int getDarkMagic(){
        return darkMagic;
    }
    public void setHealth(Warrior attack) {
        health = health - (attack.getSword() - wizardArmor);
    }
    public int getHealth() {
        return health;
    }
}
class Warrior {
    private String name;
    private int health;
    private int sword;
    private int warriorArmor;

    public Warrior(String name, int health, int sword, int warriorArmor){
        this.name = name;
        this.health = health;
        this.sword = sword;
        this.warriorArmor = warriorArmor;
    }
    public String getName() {
        return name;
    }
    public int getSword() {
        return sword;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(Wizard attack) {
        health = health - (attack.getDarkMagic() - warriorArmor);
    }
}
class Archer{
    private String name;
    private int health;
    private int darkMagic;
    private int archerArmor;

    public Archer(String name, int health, int darkMagic, int archerArmor){
        this.name = name;
        this.health = health;
        this.darkMagic = darkMagic;
        this.archerArmor = archerArmor;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getDarkMagic() {
        return darkMagic;
    }
    public int getArcherArmor() {
        return archerArmor;
    }
    public void setHealth(Archer attack){
        health = health - (attack.getDarkMagic() - archerArmor);
    }
}
