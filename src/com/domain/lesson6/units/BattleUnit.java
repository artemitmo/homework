package com.domain.lesson6.units;
//абстрактный класс для наследования, может иметь методы без реализации, перенятые от интерфейса. От абстракт-класса нельзя создать объект.
abstract public class BattleUnit extends Unit implements AttackAble{
    protected int attackScore;


    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        if(attackScore>0){
        this.attackScore = attackScore;}
        else {
            this.attackScore = 1;
        }
    }

    public BattleUnit(String name, int speed, int health, int attackScore) {
        super(name, speed); // вызов конструктора родителя
        if (health > 0) {
            this.health = health;
        }
        else {
            this.health = 1;
        }
        // придумать правила проверки значений здоровья и атаки, чтобы не было отрицательных значений.
        if (attackScore > 0) {
            this.attackScore = attackScore; // реализовать метод атаки.
        }
        else {
            this.attackScore = 1;
        }
    }

    @Override
    public void escapeBattleField() {
        System.out.println("BattleUnit покидает бой");
    }


    public static BattleUnit returnUnit (String yourChoice){
        if (yourChoice.equals("Warrior")){
            Warrior war1 = new Warrior("Warrior" + (int)(Math.random()*10), (int)(Math.random()*10), (int)(Math.random()*100), (int)(Math.random()*5));
            return war1;
        }
        else if (yourChoice.equals("Doctor")){
            Doctor doc1 = new Doctor("Doc" + (int)(Math.random()*10), (int)(Math.random()*5), (int)(Math.random()*100), (int)(Math.random()*40));
            return doc1;
        }
        else if (yourChoice.equals("Knight")){
            Knight knight1 = new Knight("Knight"+ (int)(Math.random()*10), (int)(Math.random()*5),(int)(Math.random()*100), (int)(Math.random()*40));
            return knight1;
            }
        else {
            return null;
        }
        }
    }
    //Base-class Unit. BattleUnit extends Unit
    //Наследование, инкапсуляция, полиморфизм, абстракция
    //Населедование extends, расширение функционала родительского класса без его изменения
    //Инкапсуляция - скрытие деталей реализации, модификаторы доступа
    //Абстракция - это интерфейс и абстрактные классы. Методы, которые должны будут потом реализованы, описаны и тд
    //Полиморфизм - работа через общий тип данных, создаем объект...полиморфизм наследования (полиморфного юнита создали)
    //Реализован в перегрузке методов. Когда метод имеет одинаковое название, возвращаемое значение, но разные аргументы.


