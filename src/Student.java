public class Student extends Person {
    private double gpa; // GPA (Grade Point Average) of the student

    public Student() {
        super(); // Call the default constructor of the superclass (Person)
    }

    // Parameterized constructor with name, surname, and GPA
    public Student(String name, String surname, double gpa) {
        super(name, surname); // Call the parameterized constructor of the superclass (Person)
        this.gpa = gpa; // Set the GPA for the student
    }

    public double getGpa() {
        return gpa; // Return the GPA of the student
    }

    public void setGpa(double gpa) {
        this.gpa = gpa; // Set the GPA of the student
    }

    @Override
    public double getPaymentAmount() {
        // Stipend is given in case the student has a GPA greater than 2.67
        return (gpa > 2.67) ? 36660.00 : 0.0;
    }

    @Override
    public String toString() {
        // Return a string representation of the Student object
        return "Student: " + super.toString(); // Call the toString method of the superclass and append "Student: "
    }

    @Override
    public int compareTo(Person o) {
        if (o instanceof Student) {
            // If the comparison object is also a Student, compare based on payment amount
            Student otherStudent = (Student) o;
            return Double.compare(this.getPaymentAmount(), otherStudent.getPaymentAmount());
        }
        // If the comparison object is not a Student, use the default comparison from the superclass
        return super.compareTo(o);
    }
}
