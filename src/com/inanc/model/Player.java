package com.inanc.model;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        if(healthPercentage>100) {
            this.healthPercentage = 100;
        } else if (healthPercentage<0) {
            this.healthPercentage = 0;
        }
        this.healthPercentage = healthPercentage;

        this.name = name;
        this.weapon = weapon;
    }

    public int healthRemaining(){
        if(this.healthPercentage < 0){
            this.healthPercentage = 0;
        }
        return this.healthPercentage;
    }

    public void loseHealth(int damage){
        int healthLeft = this.healthPercentage = this.healthPercentage - damage;
        if(healthLeft <= 0){
            System.out.println(this.name + " player has been knocked out of game");
        }
        this.healthPercentage = healthLeft;
    }

    public void restoreHealth(int healthPotion){
        int newHealth = this.healthPercentage + healthPotion;
        if(newHealth > 100) {
            newHealth = 100;
        }
        this.healthPercentage = newHealth;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
