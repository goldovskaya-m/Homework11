public class Main {
    public static void main(String[] args) {
        printIsLeapYear(2025);
        printValidTypeInfo(0, 2022);
        printValidTypeInfo(1, 2009);
        calculateDeliveryDays(101);
    }
    public static void printIsLeapYear(int year) {
        if (year > 1584 && (year % 4 == 0 || year % 100 != 0 && year % 400 == 0)) {
            System.out.println(year + "  год - является високосным годом.");
        } else {
            System.out.println(year + "  год - не является весокосным годом");
        }
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
        }
    }
    public static int calculateDeliveryDays(int distance) {

        int resultDays = 0;
        if (distance <= 20) {
            resultDays = 1;
            System.out.println("Потребуется на доставку " + resultDays + " день");
            resultDays++;
        }
        if (distance >= 21 && distance < 60) {
            resultDays += 2;
            System.out.printf("Потребуется на доставку %s дня%n", resultDays);
        }
        if (distance >= 100) {
            System.out.println("Delivery not possible");
            return -1;
        }
        return resultDays;
    }
}





