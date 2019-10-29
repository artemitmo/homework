package FarmGame.Classes;

public class DomesticAnimals extends Animals {
    private int health;
    private int oneDayPut;

    public DomesticAnimals(String name, int weight, int speed, int health, int oneDayPut) {
        super(name, weight, speed);
        this.health = health;
        this.oneDayPut = oneDayPut;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getOneDayPut() {
        return oneDayPut;
    }

    public void setOneDayPut(int oneDayPut) {
        this.oneDayPut = oneDayPut;
    }

    public DomesticAnimals (String name, int weight, int speed, int health) {
        super(name, weight, speed);
        this.health = health;
    }

    @Override
    public String toString() {
        return "DomesticAnimals{" +
                "health=" + health +
                ", oneDayPut=" + oneDayPut +
                "} " + super.toString();
    }
}
