public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Привет мир!");



        // Задача № 1//

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        int age1 = 17;
        if (age1 < 18) {
            System.out.println("Если возраст человека равен " + age1
                    + " то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача № 2//
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        int temperature1 = 5;
        if (temperature1 > 5) {
            System.out.println("На улице " + temperature1 + " градусов, можно идти без шапки");
        }
    }
}