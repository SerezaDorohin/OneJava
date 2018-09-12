package com.oneJava.lesson2_3_4.jaeger;

public class Jaeger {
    //------Config----------
    private int kaijuKilled;
    private String launched;
    private String mark;
    private String status;
    private String name;
    //--------Attack-----------
    private int height;
    private int weight;
    private int speed;
    private int strenght;
    private int armor;
    private int health;
    //------------------------
    public Jaeger(int kaijuKilled,
                  String launched,
                  String mark,
                  String status,
                  String name,
                  int height,
                  int weight,
                  int speed,
                  int strenght,
                  int armor,
                  int health) {
        //--------Config----------
        this.kaijuKilled = kaijuKilled;
        this.launched = launched;
        this.mark = mark;
        this.status = status;
        this.name = name;
        //---------Attack----------
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strenght = strenght;
        this.armor = armor;
        this.health = health;
        //------------------------
    }

    public int getArmor() {
        return armor;
    }

    public int getHealth() {
        return health;
    }
    public int getStrenght(){
        return strenght;
    }

    public void getInformation() {
        System.out.print("KaijuKilled: " + kaijuKilled + " |\n");
        System.out.print("Launched: " + launched + " |\n");
        System.out.print("Mark: " + mark + " |\n");
        System.out.print("Status: " + status + " |\n");
        System.out.print("Name: " + name + " |\n");
        System.out.print("Height: " + height + " |\n");
        System.out.print("Weight: " + weight + " |\n");
        System.out.print("Speed: " + speed + " |\n");
        System.out.print("Armor: " + armor + " |\n");
        System.out.print("Health: " + health + " |\n");
    }

    public int attack(int armor) {
            int healt = strenght - armor;
        return healt;
    }
}