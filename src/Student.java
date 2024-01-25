public class Student extends Person {
    private double gpa;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        // Stipend is given in case student has gpa > 2.67
        return (gpa > 2.67) ? 36660.00 : 0.0;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public int compareTo(Person o) {
        if (o instanceof Student) {
            Student otherStudent = (Student) o;
            return Double.compare(this.getPaymentAmount(), otherStudent.getPaymentAmount());
        }
        return super.compareTo(o);
    }
}
