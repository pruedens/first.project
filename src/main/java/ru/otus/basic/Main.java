package ru.otus.basic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //greetings();
        //checkSign(6, 7, 8);
        //selectColor();
        //compareNumbers();
        //addOrSubtractAndPrint(5, 6, false);
        printMessage(5, "Привет мир");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sumElementsMoreThan5(array);
        fullArray(array, 5);
        sumArray(array, 10);
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        compareArrays(array2);
    }

    // ДОМАШНЕЕ ЗАДАНИЕ 1

    // (1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java.
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    /* (2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c. Метод должен посчитать
    их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае -
    “Сумма отрицательная”;
     */
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /* (3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением. Если data
    меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”, если от 10 до 20 включительно, то
    “Желтый”, если больше 20 - “Зеленый”;
     */
    public static void selectColor() {
        int data = (int) (Math.random() * 30);
        System.out.println(data);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    /* (4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми начальными
    значениями. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
     */
    public static void compareNumbers() {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        System.out.println("а = " + a);
        System.out.println("b = " + b);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    /* (5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment). Если increment = true, то метод должен к
    initValue прибавить delta и отпечатать в консоль результат, в противном случае - вычесть;
     */
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            int sum = initValue + delta;
            System.out.println(sum);
        } else {
            int minus = initValue - delta;
            System.out.println(minus);
        }
    }

    /* При запуске приложения, запросите у пользователя число от 1 до 5, после ввода которого выполните метод,
    соответствующий указанному номеру (если методу требуются аргументы, то сгенерируйте их через Math.random());
     */

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