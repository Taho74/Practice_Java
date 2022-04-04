package ru.geekbrains.qa.java2.lesson1.GBLesson7;

public class HW7 {
    public static void main(String[] args) {
        Plate plate = new Plate(50);

        Cat [] cats = {
                new Cat("Барсик", 5),
                new Cat("Рыжик", 8),
                new Cat("Мурзик", 2)
        };

        for (Cat a : cats) {
            a.setFull(false);
            a.eat(plate);
            System.out.println(a);
        }

        System.out.println(plate);

    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean full;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        full = false;
    }

    void setFull (boolean status) {
        full = status;
    }

    public void eat (Plate plate){
        if (!full) {
            full = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString () {
        return "Кот по имени: " + name + " с аппетитом: " + appetite + " сытость : " + full;
    }

}

class Plate {
    private int food;

    Plate(int food){
        this.food = food;
    }

    boolean decreaseFood (int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void addFood (int food) {
        this.food += food;
    }

    @Override
    public String toString () {
        return "Еда в тарелке: " + food;
    }

}