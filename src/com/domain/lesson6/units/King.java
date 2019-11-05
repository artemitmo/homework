package com.domain.lesson6.units;

public class King extends Unit {
    private King(String name, int speed, int health) {
        super(name, speed);
        if (health > 0) {
            this.health = health;
        }
        else {
            this.health = 1;
        }
    }

    public King returnKing (String name, int speed, int health){
        this.name = name;
        this.speed = speed;
        this.health = health;
        King lion = new King(name, speed, health);
        return lion;
    }
    public King(){
        super();
    };

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void rest() {}
}
