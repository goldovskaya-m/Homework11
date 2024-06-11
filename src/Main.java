public class Main {
    public static void main(String[] args) {
        printIsLeapYear(2024);
        System.out.println("Homework11");
        System.out.println("Задача 1");
        int[] year2 = {2021, 2006, 3000, 2024};
        for (int i = 0; i < year2.length; i++) {
            System.out.println(year2[i]);
            if ((i + 1) % 4 == 0) {
                System.out.println("Год является високосный.");
            } else {
                System.out.println("Год не является високосный.");
            }
        }
        System.out.println("Задача 1.2");
    }

    public static void printIsLeapYear(int year) {
        if (year > 1584 && (year % 4 == 0 || year % 100 != 0 && year % 400 == 0)) {
            System.out.println(year + "  год - является високосным годом.");
        } else {
            System.out.println(year + "  год - не является весокосным годом");
        }
        System.out.println("Задача 2");
        printValidTypeInfo(0, 2022);
        printValidTypeInfo(1, 2009);
    }

    public static void printValidTypeInfo(int type, int year) {
        if (type == 0 && year > 2015) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        } else if (type == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (type == 1 && year > 2015) {
            System.out.println("Установите  версию приложения для Android по ссылке");
        } else if (type == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

            System.out.println("Задача 3");
            calculateDeliveryDays(21);

        }
    }

    public static int calculateDeliveryDays(int distance) {

        int resultDays = 1;
        if (distance <= 20) {
            System.out.println("Потребуется на доставку " + resultDays + " день");
            resultDays++;
        }
        if (distance >= 21 && distance < 60) {
            System.out.printf("Потребуется на доставку %s%n дня", resultDays += 2);
            resultDays++;
        }
        if (distance >= 100) {
            System.out.println("Delivery not possible");
            return -1;
        }
        return resultDays;
    }
}




