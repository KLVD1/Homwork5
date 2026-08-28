public class Main {
    static void main() {

        System.out.println("\n\tЗадание#1\n");

        int clientOS = 0;// 0 — iOS, 1 — Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else  (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else{
            System.out.println("Операционная система не опознана ");
        }

        System.out.println("\n\tЗадание#2\n");

        int clientDeviceYear = 2014; // Год выпуска.
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("\n\tЗадание#3\n");

        int year = 1588;
        if (year <= 1584) {
            System.out.println(year + " Год не является високосны");
        } else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год не является високосным");
        }

        System.out.println("\n\tЗадание#4\n");

        int deliveryDistance = 95; // дистанцию до клиента
        int deliveryDays = 0; // количество дней
        if (deliveryDistance > 100) {
            System.out.println("Доставка невозможна: расстояние свыше 100 км.");
        } else if (deliveryDistance <= 20) {
            deliveryDays = 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else { // от 61 до 100 км
            deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        }

        System.out.println("\n\tЗадание#5\n");

        int monthNumber = 10; // номер месяца
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц " + "принадлежит к сезону Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц " + "принадлежит к сезону Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц " + "принадлежит к сезону Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц " + "принадлежит к сезону Осень");
                break;
            default:
                System.out.println("Такого сезона не существует");
        }


    }
}