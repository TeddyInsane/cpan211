package CPAN211_Assignment1;

/**
 * Student class - attends all course hours.
 */
public class Student extends Person {

    public Student(String firstName, String lastName) {
        super("Student", firstName, lastName);
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        return courseHours;  // attends all hours
    }
}
