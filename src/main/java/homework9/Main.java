package homework9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    (1) Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList
    с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1)
     */
    public static ArrayList<Integer> minMaxGenerator(int min, int max) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            result.add(i);
        }
        System.out.println("Порядок чисел: " + result);
        return result;
    }

    /*
    (2) Реализуйте метод, принимающий в качестве аргумента список целых чисел,
    суммирующий все элементы, значение которых больше 5, и возвращающий сумму
     */
    public static int moreThanFiveGenerator(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num > 5) {
                sum += num;
            }
        }
        System.out.println("Сумма чисел, которые больше 5: " + sum);
        return sum;
    }

    /*
    (3) Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
    метод должен переписать каждую заполненную ячейку списка указанным числом
     */
    public static void updateList(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
        System.out.println("Обновленный список: " + list);
    }

    /*
    (4) Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
    увеличивающий каждый элемент списка на указанное число
     */
    public static void incrementList(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int currentValue = list.get(i);
            list.set(i, currentValue + number);
        }
    }

    /*
    (6) Реализуйте метод, принимающий в качестве аргумента список сотрудников,
    и возвращающий список их имен
     */
    public static List<String> getEmployeeNameList(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    /*
    (7) Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
    и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу
     */
    public static List<Employee> filterEmployeeAge(List<Employee> employees, int minAge) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge) {
                result.add(employee);
            }
        }
        return result;
    }

    /*
    (8) Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
    и проверяющий что средний возраст сотрудников превышает указанный аргумент
     */
    public static boolean averageAge(List<Employee> employees, double minAverageAge) {
        int totalAge = 0;
        for (Employee employee : employees) {
            totalAge += employee.getAge();
        }
        double averageAge = (double) totalAge / employees.size();
        return averageAge > minAverageAge;
    }

    /*
    (9) Реализуйте метод, принимающий в качестве аргумента список сотрудников,
    и возвращающий ссылку на самого молодого сотрудника
     */
    public static Employee getYoungestEmployee(List<Employee> employees) {
        Employee youngest = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getAge() < youngest.getAge()) {
                youngest = employee;
            }
        }
        return youngest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> generatedRange = Main.minMaxGenerator(10, 20);
        System.out.println();
    }
}