import java.util.concurrent.atomic.AtomicInteger;

// Class definition for a Person implementing Payable and Comparable interfaces
public class Person implements Payable, Comparable<Person> {
    // Static AtomicInteger to generate unique ids for each Person object
    private static final AtomicInteger count = new AtomicInteger(0);

    // Instance variables for id, name, and surname
    private final int id;
    private String name;
    private String surname;

    // Default constructor to initialize id using AtomicInteger
    public Person() {
        this.id = count.incrementAndGet();
    }

    // Parameterized constructor to set name, surname, and invoke the default constructor
    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    // Getter method for retrieving the id
    public int getId() {
        return id;
    }

    // Getter method for retrieving the name
    public String getName() {
        return name;
    }

    // Setter method for updating the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for retrieving the surname
    public String getSurname() {
        return surname;
    }

    // Setter method for updating the surname
    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Implementation of the getPaymentAmount method from the Payable interface
    @Override
    public double getPaymentAmount() {
        // Default implementation for Payable interface in Person class
        return 0.0;
    }

    // Override of the toString method to provide a custom string representation of the Person
    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    // Method to get the position (default: "Student")
    public String getPosition() {
        return "Student";
    }

    // Implementation of the compareTo method from the Comparable interface for default comparison based on id
    @Override
    public int compareTo(Person o) {
        // Default comparison for Person class based on id
        return Integer.compare(this.id, o.id);
    }
}
