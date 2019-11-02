package FarmVer2.Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class WildAnimal extends Animals implements Attack {
    private int damage;
    private int countOfBanish;

    public int getCountOfBanish() {
        return countOfBanish;
    }

    public void setCountOfBanish(int countOfBanish) {
        this.countOfBanish = countOfBanish;
    }

    public WildAnimal (String name, int weight, int speed, int damage, int countOfBanish) {
        super(name, weight, speed);
        this.damage = damage;
        this.countOfBanish = countOfBanish;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    ArrayList <WildAnimal> wildArrL = new ArrayList();

    public ArrayList<WildAnimal> getWildArrL() {
        WildAnimal wolf = new WildAnimal("Wolf", 100, 30, 30, 0);
        WildAnimal fox = new WildAnimal("Fox", 70, 25, 20, 0);
        WildAnimal bear = new WildAnimal("Bear", 70, 30, 20, 0);
        wildArrL.addAll(Arrays.asList(wolf, fox, bear));
        return wildArrL;
    }

    public WildAnimal (){

    }

    @Override
    public DomAnimal attack(DomAnimal prey) {
        System.out.println("Дикое животное подошло к ферме");
        WildAnimal w = new WildAnimal();
        int a = prey.getHealth();
        int indexW = (int)(Math.random()*w.getWildArrL().size());
        int d = w.getWildArrL().get(indexW).getDamage();
        int s = w.getWildArrL().get(indexW).getSpeed();

        if (prey.getSpeed() > s){
            System.out.println("Животное убегает от хищника");
        }

        else if(a > d) {
            a = prey.getHealth() - d;
            prey.setHealth(a);
            System.out.println("Домашнее животное ранено, осталось здоровья " + prey.getHealth());
        }
        else {
            System.out.println("Животное убито");
            prey=null;
        }
        return prey;
    }
}
