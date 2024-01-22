public class Student extends Person{
    // Статическая переменная для отслеживания последнего присвоенного id
    private static int lastId = 0;

    // Филды id, name, surname и gpa
    private final int id;
    private String name;
    private String surname;
    private double gpa;

    // Конструктор по умолчанию
    public Student() {
        this.id = ++lastId;
    }

    // Параметризованный конструктор, принимающий name, surname и gpa
    public Student(String name, String surname, double gpa) {
        this();  // Вызываем конструктор по умолчанию для установки id
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    // Метод для получения строки с информацией о студенте
    public String toString() {
        return "Student: " + id + ". " + name + " " + surname;
    }

    // Константа для стипендии
    private static final double SCHOLARCHIP = 36660.00;

    // Реализация метода getPaymentAmount
    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return SCHOLARCHIP;
        } else {
            return 0.00;
        }
    }

    // Реализация метода compareTo
    @Override
    public int compareTo(Student otherStudent) {
        // Сравнение на основе суммы (стипендии)
        return Double.compare(this.getPaymentAmount(), otherStudent.getPaymentAmount());
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return 0;
    }

    // Геттер для поля id
    public int getId() {
        return id;
    }

    // Геттеры и сеттеры для полей name, surname и gpa
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
