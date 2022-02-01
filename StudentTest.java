package ru.geekbrains.qa.java2.lesson1.Practice;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Ivan", "Ivanov", 25, 5, 3, 4);
        Student student2 = new Student(2, "Petr", "Sidorov");
        Student student3 = new Student();
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }


    static int calculateArithmeticMean (Student student) {
        int score = (student.scoreMath + student.scoreLanguage + student.scoreEconomic) / 3;
        return score;
    }
}
