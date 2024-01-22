import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Создаем список для хранения объектов типа Person
        ArrayList<Person> people = new ArrayList<>();

        // Добавляем сотрудников и студентов в список
        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Employee("George", "Harrison", "Developer", 50000.00));
        people.add(new Student("Ringo", "Starr", 2.5));
        people.add(new Student("Paul", "McCartney", 3.0));

        // Сортируем список
        Collections.sort(people);

        // Выводим отсортированные данные
        printData(people);
    }

    // Метод для вывода данных
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            if (person instanceof Payable) {
                Payable payablePerson = (Payable) person;
                System.out.println(person.toString() + " earns " + payablePerson.getPaymentAmount() + " tenge");
            }
        }
    }
}