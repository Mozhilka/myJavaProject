package school.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        printColor();
        checkSumSign();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void printColor() {
        int value = -1;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void checkSumSign() {
        int a = 2;
        int b = 3;
        int c = a + b;

        if (c >= 0) {
            System.out.println("Сумма положительная");
        }

        if (a - b < 0) {
            System.out.println("- Сумма отрицательная");
        }
    }

    public static void compareNumbers() {
            int a = 1;
            int b = 2;

            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a<b");
            }
        }
    }
