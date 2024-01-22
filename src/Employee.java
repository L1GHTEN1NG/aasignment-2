public class Employee extends Person{
    @Override
    public int compareTo(Student otherStudent) {
        return 0;
    }

    // Статическая переменная для отслеживания последнего id
    private static int lastId = 0;

    // Филды id, name, surname, position и salary
    private final int id;
    private String name;
    private String surname;
    private String position;
    private double salary;

    // Конструктор по умолчанию
    public Employee() {
        this.id = ++lastId; // по умолчанию добавляет значение последнего айди
    }

    // Параметризованный конструктор, принимающий name, surname, position и salary
    public Employee(String name, String surname, String position, double salary) {
        this(); // вызывает id
        this.name = name; // сохраняет значение имени
        this.surname = surname; // сохраняет значение фамилии
        this.position = position; // сохраняет значение позишн
        this.salary = salary; // сохраняет значение и салари
    }

    // Метод выводит значение айди, имени и фамилии сотрудника/рабочего
    public String toString() {
        return "Employee: " + id + ". " + name + " " + surname;
    }

    // Реализация метода getPaymentAmount
    @Override
    public double getPaymentAmount() {
        return salary;
    }

    // Реализация метода compareTo
    @Override
    public int compareTo(Employee otherEmployee) {
        // Сравнение на основе зарплаты
        return Double.compare(this.getPaymentAmount(), otherEmployee.getPaymentAmount());
    }

    // Геттер для поля id
    public int getId() {
        return id;
    }

    // Геттеры и сеттеры для полей name, surname, position и salary
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
