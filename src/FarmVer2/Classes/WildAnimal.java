package FarmVer2.Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class WildAnimal extends Animals implements Attack {
    private int damage;
    private int countOfBanish;

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

    public WildAnimal (){

    }

    @Override
    public DomAnimal attack(DomAnimal prey) {
        WildAnimal w = new WildAnimal();
        int a = prey.getHealth();
        int b = (int)(Math.random()*10/w.getWildArrL().size());
        int c = (int)(Math.random()*10/w.getWildArrL().size());
        int indexW = (int)(Math.random()*10/w.getWildArrL().size());
        int d = w.getWildArrL().get(indexW).getDamage();
        int s = w.getWildArrL().get(indexW).getSpeed();
        if (b == c){
            System.out.println("Фермер прогнал дикое животное");
        }

        else if (prey.getSpeed() > s){
            System.out.println("Животное убегает от хищника");
        }

        else if(a > d) {
            a = prey.getHealth() - d;
            prey.setHealth(a);
            System.out.println("Животное ранено, осталось здоровья " + prey.getHealth());
        }
        else {
            System.out.println("Животное убито");
            prey = null;
        }
        return prey;
    }
}
