package ru.geekbrains.qa.java2.lesson1.GBLesson6;

public class HW6 {
    public static void main(String[] args) {
        Animals cat = new Cat("Барсик", "черный", 6, 100, 50);
        Animals dog = new Dog("Тор", "белый", 5, 500, 200);
        Animals cat2 = new Cat("Барсик2", "белый", 5, 200, 50);
        Animals dog3 = new Dog("Тор", "белый", 5, 500, 200);
        Animals[] anim = {cat, dog};

        for (Animals a : anim) {
            System.out.println(a);
        }

        cat.swim(3);
        cat.run(20);
        dog.swim(500);
        dog.run(100);

        System.out.println(Animals.count);
    }
}

class Cat extends Animals {
    Cat (String name, String color, int age, int limitRun, int limitSwim) {
        super(name, color, age, limitRun, limitSwim);
        count++;
    }

    @Override
    public void swim (int a){
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public void run (int a){
        if (a > limitRun) {
            System.out.println("Кот не смог пробежать такую длинную дистанцию");
        } else {
            System.out.println("Кот пробежал " + a + " метров");
        }
    }
}

class Dog extends Animals {
    Dog (String name, String color, int age, int limitRun, int limitSwim) {
        super(name, color, age, limitRun, limitSwim);
        count++;
    }

    @Override
    public void swim (int a){
        if (a > limitSwim) {
            System.out.println("Пес не смог проплыть такую длинную дистанцию");
        } else {
            System.out.println("Пес проплыл " + a + " метров");
        }
    }

    @Override
    public void run (int a){
        if (a > limitRun) {
            System.out.println("Пес не смог пробежать такую длинную дистанцию");
        } else {
            System.out.println("Пес пробежал " + a + " метров");
        }
    }
}

interface IAnimal {
    void swim(int a);
    void run(int a);
}

abstract class Animals implements IAnimal {
    protected String name;
    protected String color;
    protected int age;
    protected int limitRun;
    protected int limitSwim;
    static int count;

    Animals (String name, String color, int age, int limitRun, int limitSwim) {
            this.name = name;
            this.color = color;
            this.age = age;
            this.limitRun = limitRun;
            this.limitSwim = limitSwim;
    }

    @Override
    public String toString () {
        return "Кот по имени: " + name + ", цвет: " + color + ", возраст кота: " + age;
    }
}
