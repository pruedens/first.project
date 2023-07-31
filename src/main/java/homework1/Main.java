package homework1;

public class Main {
    public static void main(String[] args) {

        greetings();
        checkSign(6, 7, 8);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(5,6,false);
    }

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
}