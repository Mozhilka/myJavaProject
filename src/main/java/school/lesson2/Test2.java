package school.lesson2;

public class Test2 {
    public static void main(String[] args) {
        check(5, 10);
        positiveOrNegative(2);
        isNegative(-2);
        printWordNTimes("Hello", 5);
        doYear(2021);
        changeArray();
        createArray();
        changeArray2();
        fillDiagonal();
        findMininalAndMaximalElementOfArray();
        System.out.println(checkBalance(new int[] { 1, 1, 1, 2, 1 })); // true
        System.out.println(checkBalance(new int[] { 2, 1, 1, 2, 1 })); // false
        System.out.println(checkBalance(new int[] { 10, 10 })); //true

    }

    /**
     * Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное
     */

    public static void positiveOrNegative(int j) {

        if (j >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    /**
     * Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
     * в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    public static boolean check(int a, int b) {

        int s = a + b;
        if (10 > s && s <= 20) return true;
        else return false;
    }

    /**
     * Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
     * если число отрицательное, и вернуть false если положительное.
     */
    public static boolean isNegative(int number) {

        if (number < 0) return true;
        return false;
    }

    /**
     * Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
     * в консоль указанную строку, указанное количество раз;
     */
    public static void printWordNTimes(String word, int times) {
        for (int l = 0; l < 5; l++) {
            System.out.println("word");
        }

    }
    /**
     * * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
     * не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый
     * 400-й – високосный
     */
    public static void doYear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }

    /**
     * Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0
     */
    static void changeArray() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("BEFORE: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;

        }
        System.out.println("\nAFTER:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями
     * 1 2 3 4 5 6 7 8 … 100;
     */
    static void createArray() {
        int[] arr = new int[100];

        for (int i = 0, j = 0; i < arr.length; i++, j += 1) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }
    /**
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить
     * на 2
     */
    static void changeArray2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("BEFORE: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nAFTER:  ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
     * если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
     * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n]
     */
    public static void fillDiagonal() {
        int[][] sqrArray = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sqrArray[i][j] = (i == j || j == (4 - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Задать одномерный массив и найти в нем минимальный и максимальный элементы
     */
    static void findMininalAndMaximalElementOfArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -8};
        int min = arr[0];
        int max = arr[0];
        System.out.print("in array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println("\nminimal element is: " + min + "\nmaximal element is: " + max);
    }
    /**
     * Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
     * если в массиве есть место, в котором сумма левой и правой части массива равны.
     */
    static boolean checkBalance(int[] arr) {
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < arr.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }
}










