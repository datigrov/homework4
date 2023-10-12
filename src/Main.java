public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Привет мир!");


        // Задача № 1//

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        age = 17;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age
                    + " то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача № 2//
        int temperature = 3;
        if (temperature < 6) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        temperature = 10;
        if (temperature >= 15) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // Задача № 3 //
        int speed = 40;
        if (speed >= 61) {
            System.out.println("Если скорость " + speed + " то прийдется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то прийдется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }


        // Задача № 4 //
        int peopleAge = 5;
        if (peopleAge > 2 && peopleAge < 6) {
            System.out.println("Если возраст человека равен " + peopleAge +
                    " то ему нужно ходить в детский сад");
        } else if  (peopleAge >= 7 && peopleAge <= 17) {
            System.out.println("Если возраст человека равен " + peopleAge + " то ему нужно ходить в школу");
        } else if (peopleAge >= 18 && peopleAge <= 24) {
            System.out.println("Если возраст человека равен " + peopleAge + " то его место в университете");
        } else if (peopleAge > 24) {
            System.out.println("Если возраст человека равен " + peopleAge + " то ему пора ходить на работу");
        }

        // Задача № 5 //
        int babyAge = 4;
        if (babyAge < 5) {
            System.out.println("Если возраст ребенка равен " + babyAge
                    + " то он не может кататься на атракционе");
        } else if (babyAge > 5 && babyAge < 14) {
            System.out.println("Если возраст ребенка равен " + babyAge
                    + " лет, то он может кататься только в сопровождении взрослого."
                    + " Если взрослого нет, то кататься нельзя.");
        } else if (babyAge > 14) {
            System.out.println("Если возраст ребенка равен " + babyAge
                    + " лет, то он может кататься без сопровождения взрослого");
        }

        // Задача № 6 //
        int allPlaceInTheCarriage = 120;
        int sitPlaceInTheCarriage = 60;
        if (allPlaceInTheCarriage = 60  sitPlaceInTheCarriage = 55) {

    }
}