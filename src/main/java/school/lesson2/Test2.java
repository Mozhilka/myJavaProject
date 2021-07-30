package school.lesson2;

public class Test2 {
    public static void main(String[] args) {
        check(5, 10);
        positiveOrNegative(2);
        isNegative(2);
        printWordNTimes("Hello", 5);
        doYear(2021);
        changeArray();
        changeArray2();
        fillDiagonal();

    }


    public static void positiveOrNegative(int j) {

        if (j >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean check(int a, int b) {

        int s = a + b;
        return (10 <= s) && (s <= 20);
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printWordNTimes(String word, int times) {
        for (int l = 0; l < 5; l++) {
            System.out.println("word");
        }

    }

    public static void doYear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }

    static void changeArray() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("BEFORE: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;

        }
        System.out.print("\nAFTER:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void changeArray2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("BEFORE: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("\nAFTER:  ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }
    static void fillDiagonal() {
        int[][] sqrArray = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sqrArray[i][j] = (i == j || j == (4 - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }

    }
}







