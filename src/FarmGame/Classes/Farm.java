package FarmGame.Classes;

import java.util.ArrayList;

public class Farm {

    public DomesticAnimals[] callArrPet () {
        DomesticAnimals[] petsM = new DomesticAnimals[8];
        petsM[0] = new DomesticAnimals("Cow1", 120, 5, 60, 15);
        petsM[1]  = new DomesticAnimals("Cow2", 100, 5, 70, 19);
        petsM[2] = new DomesticAnimals("Cow3", 110, 5, 60, 10);
        petsM[3] = new DomesticAnimals("Cat1", 15, 30, 20);
        petsM[4] = new DomesticAnimals("Rabbit",5 , 27, 20);
        petsM[5] = new DomesticAnimals("Rabbit1", 2, 25, 20);
        petsM[6] = new DomesticAnimals("Chicken", 5, 10, 30, 3);
        petsM[7] = new DomesticAnimals("Chicken2", 5, 14, 30, 3);
        return petsM;
    }

    public WildAnimals[] callArrWild(){
        WildAnimals[] wildA = new WildAnimals[3];
        wildA[0] = new WildAnimals("Wolf", 100, 10, 30);
        wildA[1] = new WildAnimals("Fox", 70, 25, 20);
        wildA[2] = new WildAnimals("Bear", 70, 10, 20);
        return wildA;
    }

    public Farmer[] callFarmer(){
        Farmer[] farmer = new Farmer[5];
        farmer[0] = new Farmer(5);
        return farmer;
    }


    public void passDay(){
        int account = callFarmer()[0].getResourceFarm() - 2; //ежедневная плата
        callFarmer()[0].setResourceFarm(account);
        System.out.println("Взята ежедневная плата 2 единицы, остаток ресурсов фермера - " + account +" ед.");
        int r = (int)(Math.random()*3);
        callArrWild()[r].hunt(callArrPet()[(int)(Math.random()*8)]);

    }
}
