import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        // Add several employees and students
        people.add(new Employee("Donald", "Trump", "Manager", 2700.78));
        people.add(new Student("Will", "Smith", 3.99));
        people.add(new Student("Alexander", "Lukashenko", 0.08));
        people.add(new Employee("Kanye", "West", "Developer", 80990.00));

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
