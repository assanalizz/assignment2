// Employee class extends the Person class
public class Employee extends Person {
    // Private fields to store employee's position and salary
    private String position;
    private double salary;

    // Default constructor calling the superclass constructor
    public Employee() {
        super();
    }

    // Parameterized constructor initializing name, surname, position, and salary
    public Employee(String name, String surname, String position, double salary) {
        // Call superclass constructor to initialize name and surname
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    // Getter method for retrieving employee's position
    public String getPosition() {
        return position;
    }

    // Setter method for setting employee's position
    public void setPosition(String position) {
        this.position = position;
    }

    // Getter method for retrieving employee's salary
    public double getSalary() {
        return salary;
    }

    // Setter method for setting employee's salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override method to get payment amount, returns the salary
    @Override
    public double getPaymentAmount() {
        return salary;
    }

    // Override method to generate a string representation of the Employee
    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    // Override method to compare employees based on their salary
    @Override
    public int compareTo(Person o) {
        // Check if the compared object is an instance of Employee
        if (o instanceof Employee) {
            // Cast the compared object to Employee
            Employee otherEmployee = (Employee) o;
            // Compare salaries and return the result
            return Double.compare(this.salary, otherEmployee.salary);
        }
        // If the compared object is not an instance of Employee, use superclass comparison
        return super.compareTo(o);
    }
}
