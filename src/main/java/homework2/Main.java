package homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printMessage(5, "Привет мир");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sumElementsMoreThan5(array);
        fullArray(array, 5);
        sumArray(array, 10);
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        compareArrays(array2);
    }

    // ДОМАШНЕЕ ЗАДАНИЕ 2
    // (1) Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз
    public static void printMessage(int number, String text) {
        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
    }

    /* (2) Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все
    элементы, значение которых больше 5, и печатающий полученную сумму в консоль
     */
    public static void sumElementsMoreThan5(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма элементов, которые больше 5: " + sum);
    }

    /* (3) Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
    массив, метод должен заполнить каждую ячейку массива указанным числом
     */
    public static void fullArray(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
        }
        System.out.println(Arrays.toString(arr));
    }

    /* (4) Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
    массив, увеличивающий каждый элемент массива на указанное число;
     */
    public static void sumArray(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += value;
        }
        System.out.println(Arrays.toString(arr));
    }

    /* (5) Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в
    консоль информацию о том, сумма элементов какой из половин массива больше
     */
    public static void compareArrays(int[] arr) {
        int middleArray = arr.length / 2;
        int sumFirstPart = 0;
        int sumSecondPart = 0;

        for (int i = 0; i < middleArray; i++) {
            sumFirstPart += arr[i];
        }
        for (int i = middleArray; i < arr.length; i++) {
            sumSecondPart += arr[i];
        }

        if (arr.length % 2 == 1) {
            sumSecondPart += arr[middleArray];
        }

        if (sumFirstPart > sumSecondPart) {
            System.out.println("Сумма элементов первой половины массива больше: " + sumFirstPart);
        } else if (sumSecondPart > sumFirstPart) {
            System.out.println("Сумма элементов второй половины массива больше: " + sumSecondPart);
        } else {
            System.out.println("Суммы элементов двух половин массива равны: " + sumFirstPart + " " + sumSecondPart);
        }
    }
}
