package ru.geekbrains.qa.java2.lesson1.Practice;

public class Student {
    int numberTicket;
    String name;
    String surname;
    int year;
    int scoreMath;
    int scoreEconomic;
    int scoreLanguage;
    int scoreAll;

    Student (int numberTicket1, String name1, String surname1, int year1, int scoreMath1, int scoreEconomic1, int scoreLanguage1) {
        numberTicket = numberTicket1;
        name = name1;
        surname = surname1;
        year = year1;
        scoreMath = scoreMath1;
        scoreEconomic = scoreEconomic1;
        scoreLanguage = scoreLanguage1;
    }

    Student (int numberTicket2, String name2, String surname2) {
        this(numberTicket2, name2, surname2, 0, 0, 0, 0);
    }

    Student () {

    }

    @Override
    public String toString(){
        return numberTicket + " " + name + " " + surname + " " + year + " " + scoreMath + " " + scoreEconomic + " " + scoreLanguage;
    }

}
