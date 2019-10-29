package FarmGame.Classes;

public class WildAnimals extends Animals {
    private int damage;

    public WildAnimals(String name, int weight, int speed, int damage) {
        super(name, weight, speed);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

   public void hunt (DomesticAnimals prey) {

        int a = prey.getHealth();
        if(a > this.getDamage()) {
            a = prey.getHealth() - this.getDamage();
            a = prey.getHealth();
        }

        else {
            System.out.println("Животное убито");
        }
    }
}