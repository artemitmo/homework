package FarmVer2.Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class WildAnimal extends Animals implements Attack {
    private int damage;

    public WildAnimal (String name, int weight, int speed, int damage) {
        super(name, weight, speed);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    ArrayList <WildAnimal> wildArrL = new ArrayList();

    public ArrayList<WildAnimal> getWildArrL() {
        WildAnimal wolf = new WildAnimal("Wolf", 100, 10, 30);
        WildAnimal fox = new WildAnimal("Fox", 70, 25, 20);
        WildAnimal bear = new WildAnimal("Bear", 70, 10, 20);
        wildArrL.addAll(Arrays.asList(wolf, fox, bear));
        return wildArrL;
    }

    @Override
    public DomAnimal attack(DomAnimal dma) {
        return null;
    }
}
