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

        System.out.println(cat.swim(3));
        System.out.println(cat.run(20));
        System.out.println(dog.swim(500));
        System.out.println(dog.run(100));


        System.out.println(Animals.count);
    }
}

class Cat extends Animals {
    Cat (String name, String color, int age, int limitRun, int limitSwim) {
        super(name, color, age, limitRun, limitSwim);
        count++;
    }

    @Override
    public String swim (int a) {
        return "Кот не умеет плавать";
    }

}

class Dog extends Animals {
    Dog (String name, String color, int age, int limitRun, int limitSwim) {
        super(name, color, age, limitRun, limitSwim);
        count++;
    }
}

interface IAnimal {
    String swim(int a);
    String run(int a);
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
    public String swim (int a) {
        if (a > limitSwim) {
            return name + " не смог проплыть данную дистанцию";
        } else {
            return name + " проплыл " + a + " метров";
        }
    }

    @Override
    public String run (int a) {
        if (a > limitRun) {
            return name + " не смог пробежать данную дистанцию";
        } else {
            return name + " пробежал " + a + " метров";
        }
    }

    @Override
    public String toString () {
        return "Кот по имени: " + name + ", цвет: " + color + ", возраст кота: " + age;
    }
}
