package FarmVer2.Classes;

public class FarmDay {
    public void oneDay(){
        Farmer f = new Farmer();
        int account = f.getFarmer().get(0).resourceFarm;
        account -=2;
        System.out.println("Взята ежедневная плата, остаток на счете фермера " + account);
        DomAnimal d1 = new DomAnimal();
        WildAnimal w1 = new WildAnimal();
        int indexDomAnimal = (int)(Math.random()*d1.getDomAnArr().size());
        w1.attack(d1.getDomAnArr().get(indexDomAnimal));
    }
}
