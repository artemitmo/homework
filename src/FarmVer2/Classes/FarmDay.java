package FarmVer2.Classes;

import java.util.ArrayList;

public class FarmDay {
    public void oneDay(){
        Farmer f = new Farmer();
        int account = f.getFarmer().get(0).resourceFarm;
        account -=2;
        System.out.println("Взята ежедневная плата, остаток на счете фермера " + account);
        DomAnimal d1 = new DomAnimal();
        WildAnimal w1 = new WildAnimal();
        ArrayList <DomAnimal> farmDomArr = d1.getDomAnArr();
        int indexDomAnimal = (int)(Math.random()*farmDomArr.size());
        w1.attack(farmDomArr.get(indexDomAnimal));
        if (farmDomArr.get(indexDomAnimal)==null) {
            farmDomArr.remove(indexDomAnimal);
        }
    }
}
