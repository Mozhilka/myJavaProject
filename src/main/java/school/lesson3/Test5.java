package school.lesson3;

public class Test5 {
    public static class MainApp {
        public static void print2DArray(int[][] arr) {
            for (int i = 0; i <= arr[0].length; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i + 1 + " ");
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

    }




