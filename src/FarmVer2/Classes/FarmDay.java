package FarmVer2.Classes;
import java.util.ArrayList;

public class FarmDay {
    public void oneDay() {
        Farmer f = new Farmer();
        int account = f.getFarmer().get(0).getResourceFarm();
        account -= 2;
        System.out.println("Взята ежедневная плата, остаток на счете фермера " + account);
        DomAnimal d1 = new DomAnimal();
        WildAnimal w1 = new WildAnimal();
        ArrayList<DomAnimal> farmDomArr = d1.getDomAnArr();
        ArrayList<WildAnimal> farmWildArr = w1.getWildArrL();
        int indexDomAnimal = (int) (Math.random() * farmDomArr.size());
        int b = (int) (Math.random() * farmWildArr.size());
        int c = (int) (Math.random() * farmWildArr.size());
        if (b == c) {
            System.out.println("Фермер прогнал дикое животное");
            int d = farmWildArr.get(b).getCountOfBanish() + 1;
            farmWildArr.get(b).setCountOfBanish(d);
            if (farmWildArr.get(b).getCountOfBanish() == 3) { //3 раза прогнали
                farmWildArr.remove(b); //удаление зверя из листа
            }
        } else {
            w1.attack(farmDomArr.get(indexDomAnimal));
        }
        if (farmDomArr.get(indexDomAnimal) == null) {
            farmDomArr.remove(indexDomAnimal); // удаление домашнего животного из листа
        }
        System.out.println("Кормление животных, +1 к health всем оставшимся");
        for (int i = 0; i < farmDomArr.size(); i++) {
            farmDomArr.get(i).setHealth(farmDomArr.get(i).getHealth() + 1);
        }
        for (int i = 0; i < farmDomArr.size(); i++) {
            f.setResourceFarm(f.getResourceFarm() + farmDomArr.get(i).getOneDayPut());
        }
        System.out.println("Сбор ресурсов закончен, состояние общего счета " + f.getResourceFarm());
        int g = (int) (Math.random() * farmDomArr.size());
        if (f.getResourceFarm() < 3) {
            if (farmDomArr.get(g).getWeight() > 20) {
                f.setResourceFarm(f.getResourceFarm() + farmDomArr.get(g).getWeight());
                farmDomArr.remove(g);
                System.out.println("Одно из домашних животных убито");
            }
            else if (farmDomArr.size() == 0) {
                System.out.println("Game over");
            }
        }
        System.out.println();
    }
}
