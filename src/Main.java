public class Main {

    // Задание 1
    private static void yearIsLeap(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("год является високосным");
        } else if (year % 100 != 0) {
            System.out.println("год является невисокосным\n");
        }
    }
    // Задание 2
        public static void chooseAppVersion ( int clientOs, int clientDeviceYear){
            if (clientDeviceYear >= 2015 && clientOs == 0) {
                System.out.println("Установите версию приложения для IOS по ссылке\n");
            } else if (clientDeviceYear < 2015 && clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else if (clientDeviceYear >= 2015 && clientOs == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientDeviceYear < 2015 && clientOs == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
            }
        }
        //Задание 3

        public static void cardDelivery ( int deliveryDistance){
            if (deliveryDistance == 20) {
                System.out.println("Потребуется 1 день на доставку");
            } else if (deliveryDistance > 20 && deliveryDistance == 60) {
                System.out.println("Потребуется 2 дня на доставку");
            } else if (deliveryDistance > 60 && deliveryDistance <= 80) {
                System.out.println("Потребуется 3 дня на доставку");
            } else if (deliveryDistance > 80 && deliveryDistance <= 100) {
                System.out.println("Потребуется 4 дня на доставку\n");
            }
        }



            public static void main (String[]args){
                yearIsLeap(2022);
                yearIsLeap(2045);
                yearIsLeap(2050);
                chooseAppVersion(1, 2015);
                chooseAppVersion(0, 2023);
                chooseAppVersion(1, 2008);
                cardDelivery (500);
                cardDelivery(50);
            }
        }



