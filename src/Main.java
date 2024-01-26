import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Main class to demonstrate sorting of Person objects
public class Main {

    public static void main(String[] args) {
        // Create a list to store Person objects
        List<Person> people = new ArrayList<>();

        // Add several employees and students to the list
        people.add(new Employee("Kurt", "Cobain", "Manager", 270000.00));
        people.add(new Student("Kairat", "Nurtas", 3.99));
        people.add(new Student("Jon", "Jones", 1.2));
        people.add(new Employee("Kanye", "West", "Developer", 809900.00));

        // Sort the list based on the natural order defined in the Person class
        Collections.sort(people);

        // Call the printData method to display information about each person
        printData(people);
    }

    // Method to print information about each person in the provided Iterable
    public static void printData(Iterable<Person> people) {
        // Iterate through the collection and print details for each person
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}
