package ru.geekbrains.qa.java2.lesson1.Practice6;

public class Student {
    String name;
    int course;
    double grade;

    Student (String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 2, 4.3);
        Student st2 = new Student("Ivan", 2, 4.3);
        StudentTest.compareStudents(st1, st2);
        StudentTest.compareStudents2(st1, st2);
    }
}


class StudentTest {

    static void compareStudents (Student st1, Student st2) {
        if (st1.name == st2.name && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }



    static void compareStudents2 (Student st1, Student st2) {
        if (st1.name == st2.name) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Студенты равны");
                } else {
                    System.out.println("Студенты не равны, так как у них разные оценки");
                }
            } else {
                System.out.println("Студенты не равны, так как они на разных курсах");
            }
        } else {
            System.out.println("Студенты не равны, так как у них разные имена");
        }
    }
}
