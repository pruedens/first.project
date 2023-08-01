package homework3;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{-1, -2, 3}, {-10, 8, -9}, {16, 21, -22}};
        int sum = sumOfPositiveElements(array);
        System.out.println("Сумма положительных элементов: " + sum);
        int size = 10;
        printSquare(size);
        int[][] array2 = {{6, 6, 6}, {6, 6, 6}, {6, 6, 6}};
        zeroDiagonals(array2);
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(findMax(array));
    }

    /* (1) Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
    метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0 */
    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    /* (2) Реализовать метод, который принимает в качестве аргумента int size и печатает
    в консоль квадрат из символов * со сторонами соответствующей длины */
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* (3) Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
    и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе) */
    public static void zeroDiagonals(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i][i] = 0;
            arr[i][n - 1 - i] = 0;
        }
    }

    // (4) Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива
    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}

