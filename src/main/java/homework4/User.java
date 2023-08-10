package homework4;

// (1) Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email
public class User {
    private String lastName;
    private String firstName;
    private String middleName;
    private int birthYear;
    private String email;

    // (2) Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта
    public User(String lastName, String firstName, String middleName, int birthYear, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /* (3) В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
       ФИО: фамилия имя отчество
       Год рождения: год рождения
       e-mail: email */

    public void printInformation() {
        System.out.println("ФИО: " + lastName + " " + firstName + " " + middleName);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("e-mail: " + email);
    }
}
