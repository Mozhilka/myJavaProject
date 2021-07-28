package school.lesson1;

public class Test {
    public static void main(String[] args) {
        checkSumSign();
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
}





