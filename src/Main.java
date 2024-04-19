import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task1
        int year = 2021;
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
        //task2
        printVersion(0, 2024);
        printVersion(1, 2013);
        printVersion(1, 2024);
        //task3
        int distance = 95;
        int deliveryDays = calculateDeliveryDays(distance);
        if (deliveryDays >= 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }

    static boolean isLeapYear(int year) { //task1
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    static void printVersion(int os, int releaseYear) { //task2
        int currentYear = LocalDate.now().getYear();
        if (os == 0) {
            if (releaseYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (os == 1) {
            if (releaseYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Устойство не поддерживается");
        }
    }

    static int calculateDeliveryDays(int distance) { //task3
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}