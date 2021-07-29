package school.lesson2;

public class Test2 {
    public static void main(String[] args) {
        check(5,10);
        positiveOrNegative(2);
        isNegative(2);
        printWordNTimes( "Hello",5);
        doSeven(2021);
    }

    public static void positiveOrNegative(int j) {

        if (j >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean check(int a, int b) {

    int s =a + b;
        return (10 <= s) && (s <= 20);
    }
    public static boolean isNegative(int number) {
        return number < 0;
    }
    public static void printWordNTimes(String word, int times) {
        for (int l=0; l<5; l++ ) {
            System.out.println("Hello");
        }

        }
    public static void doSeven(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}






