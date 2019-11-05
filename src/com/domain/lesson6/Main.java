package com.domain.lesson6;

import com.domain.lesson6.units.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите тип персонажа");
        String userChoice = scanner.nextLine();
        BattleUnit battleUnit = null;
        if ("warrior".equals(userChoice)){
            battleUnit = new Warrior("Воин", 3,20,15);
        }
        else if ("knight".equals(userChoice)){
            battleUnit = new Knight("Рыцарь", 4,22,18);
        }
        else if ("doctor".equals(userChoice)){
            battleUnit = new Doctor("Доктор", 2, 40, 5);
        }
        battleUnit.run();
        System.out.println("Ваш выбор " + battleUnit);
        //warrior knight doctor*/
        System.out.println(BattleUnit.returnUnit("Knight"));
        King k = new King();
        System.out.println(k.returnKing("Artur", 12, 14));
    }
}
