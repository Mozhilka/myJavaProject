package school.lesson1;

public class Test {
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 3;
        int b = 2;

        if (a+b >= 0) {
            System.out.println("Сумма положительная");
        }
        if (a+b < 0) {
            System.out.println("Сумма отрицательная");
        }

    }
}


