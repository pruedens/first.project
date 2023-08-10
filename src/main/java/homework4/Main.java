package homework4;

public class Main {
    public static void main(String[] args) {
        /* (4) В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью
           цикла выведите информацию только о пользователях старше 40 лет. */
        User[] user = new User[10];
        user[0] = new User("Козлов", "Николай", "Иванович", 1995, "12345@mail.ru");
        user[1] = new User("Козлов", "Никита", "Иванович", 1985, "12345@mail.ru");
        user[2] = new User("Козлов", "Вячеслав", "Иванович", 1975, "12345@mail.ru");
        user[3] = new User("Козлов", "Слава", "Иванович", 1965, "12345@mail.ru");
        user[4] = new User("Козлов", "Андрей", "Иванович", 1955, "12345@mail.ru");
        user[5] = new User("Козлов", "Артем", "Иванович", 1945, "12345@mail.ru");
        user[6] = new User("Козлов", "Эдуард", "Иванович", 1935, "12345@mail.ru");
        user[7] = new User("Козлов", "Алексей", "Иванович", 1925, "12345@mail.ru");
        user[8] = new User("Козлов", "Антон", "Иванович", 1915, "12345@mail.ru");
        user[9] = new User("Козлов", "Максим", "Иванович", 1905, "12345@mail.ru");

        int currentYear = 2023;
        for (int i = 0; i < user.length; i++) {
            if (user[i].getBirthYear() < currentYear - 40) {
                user[i].printInformation();
                System.out.println();
            }
        }

        Box box = new Box(5, 5, 5, "зеленый");
        box.printInfo();
        box.open();
        box.putObject("Ручка");
        box.close();
        box.printInfo();
    }
}