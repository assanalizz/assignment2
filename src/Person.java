import java.util.concurrent.atomic.AtomicInteger;

public class Person implements Payable, Comparable<Person> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String name;
    private String surname;

    public Person() {
        this.id = count.incrementAndGet();
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

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

    @Override
    public double getPaymentAmount() {
        // Default implementation for Payable interface in Person class
        return 0.0;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public int compareTo(Person o) {
        // Default comparison for Person class based on id
        return Integer.compare(this.id, o.id);
    }
}
