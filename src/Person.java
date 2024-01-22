public abstract class Person implements Comparable<Person>, Payable{
    // Статическая переменная для отслеживания последнего id
    private static int lastId = 0;

    private final int id;
    private String name;
    private String surname;

    // Конструктор по умолчанию
    public Person() {
        this.id = ++lastId; // по умолчанию добавляет значение последнего айди
    }

    // Параметризованный конструктор, принимающий name и surname
    public Person(String name, String surname) {
        this(); // вызывает id
        this.name = name; // берет значение this чтобы не перепутать со значением констуртора
        this.surname = surname; // также и здесь
    }

    //метод туСтринг для вывода айди, имени и фамилии человека
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    // Метод для получения позиции
    public String getPosition() {
        return "Student";
    }

    // Реализация метода getPaymentAmount
    @Override
    public double getPaymentAmount() {
        // Возвращаем 0.00 по умолчанию для Person
        return 0.00;
    }

    // Реализация метода compareTo
    @Override
    public int compareTo(Person otherPerson) {
        // Сравнение на основе id для Person
        return Integer.compare(this.id, otherPerson.id);
    }

    // Реализация метода compareTo
    public abstract int compareTo(Student otherStudent);

    // Реализация метода compareTo
    public abstract int compareTo(Employee otherEmployee);

    // Геттер для поля id
    public int getId(){
        return id;
    }

    // Геттеры и сеттеры для полей name и surname
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
}
