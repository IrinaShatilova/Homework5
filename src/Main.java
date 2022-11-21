public class Main {
    public static void main(String[] args) { task1(); task2(); task3(); task4(); task5(); }
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
    public static void task4() {
        //Задание 4
        System.out.println(" ");
        System.out.println("Задание 4"); // вычислить сколько дней потребуется для доставки продукта
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance > 20) {
            days = days + 1;
        }
        if (deliveryDistance > 60) {
            days = days + 1;
        }
        System.out.println("Требуется дней: " + days);
    }
    public static void task5() {
        //Задание 5
        System.out.println(" ");
        System.out.println("Задание 5"); // вычислить принадлежность к сезону по номеру месяца
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
                break;
        }
    }
}