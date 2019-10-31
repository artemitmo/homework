package FarmVer2.Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class DomAnimal extends Animals {
    private int health;
    private int oneDayPut;

    //создаем конструктор со всеми параметрами
    public DomAnimal(String name, int weight, int speed, int health, int oneDayPut) {
        super(name, weight, speed);
        this.health = health;
        this.oneDayPut = oneDayPut;
    }

    public DomAnimal(String name, int weight, int speed, int health) {
        super(name, weight, speed);
        this.health = health;
    }

    public DomAnimal(){
        super();
    };

    //создаем ArrayList для домашних животных
    ArrayList <DomAnimal> domAnimalArrayList = new ArrayList<>();

    //метод, создающий ArrayList заполненный
    public ArrayList<DomAnimal> getDomAnArr (){
        DomAnimal cow1 = new DomAnimal ("Cow1", 50, 40, 50, 10);
        DomAnimal cow2  = new DomAnimal("Cow2", 100, 5, 70, 19);
        DomAnimal cow3 = new DomAnimal("Cow3", 110, 5, 60, 10);
        DomAnimal cat1 = new DomAnimal("Cat1", 15, 30, 20);
        DomAnimal rabbit = new DomAnimal("Rabbit",5 , 27, 20);
        DomAnimal rabbit1 = new DomAnimal("Rabbit1", 2, 25, 20);
        DomAnimal chicken = new DomAnimal("Chicken", 5, 10, 30, 3);
        DomAnimal chicken2 = new DomAnimal("Chicken2", 5, 14, 30, 3);
        domAnimalArrayList.addAll(Arrays.asList(cow1, cow2, cow3, cat1, rabbit, rabbit1, chicken, chicken2));
        return domAnimalArrayList;
    }

    @Override
    public String toString() {
        return "DomAnimal{" +
                "health=" + health +
                ", oneDayPut=" + oneDayPut +
                ", domAnimalArrayList=" + domAnimalArrayList +
                "} " + super.toString();
    }
}
