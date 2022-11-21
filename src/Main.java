public class Main {
    public static void main(String[] args) { task1(); task2(); task3(); }
    public static void task1() {
        System.out.println("Homework5");
        //Задание 1
        System.out.println(" ");
        System.out.println("Задание 1");
        int clientOS = 1; // 0 - iOS, 1 - Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        //Задание 2
        System.out.println (" ");
        System.out.println ("Задание 2");
        int clientOS = 0; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2010; // < 2015 - облегченная версия, >= 2015 - обычная
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static void task3() {
        //Задание 3
        System.out.println(" ");
        System.out.println("Задание 3"); // вычислить является год високосным или нет
        int year = 2021;
        int year4 = year % 4;
        int year100 = year % 100;
        int year400 = year % 400;
        if (year4 == 0 && year100 != 0 || year400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}