import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        // Add several employees and students
        people.add(new Employee("Cristiano", "Ronaldo", "Manager", 2700.78));
        people.add(new Student("Victor", "Tsoy", 3.7));
        people.add(new Student("Nursultan", "Khaimuldin", 0.07));
        people.add(new Employee("George", "Harrison", "Developer", 50000.00));

        // Sort the list based on the amount of money they make
        Collections.sort(people);

        // Call printData method
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}
