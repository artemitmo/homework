package FarmVer2.Classes;

import java.util.ArrayList;

public class Farmer {
    int resourceFarm = 5;

    public int getResourceFarm() {
        return resourceFarm;
    }

    public void setResourceFarm(int resourceFarm) {
        this.resourceFarm = resourceFarm;
    }

    public void takeProfit() {
    }

    public void giveFood() {
    }

    ArrayList<Farmer> arrLFarmer = new ArrayList<>();
    public ArrayList<Farmer> getFarmer (){
        Farmer farmer1 = new Farmer();
        arrLFarmer.add(farmer1);
        return arrLFarmer;
    }
}
