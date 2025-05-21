package CPAN211_Assignment1;

/**
 * TA class - attends only lab hours.
 */
public class TA extends Person {

    public TA(String firstName, String lastName) {
        super("TA", firstName, lastName);
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        return courseHours > 4 ? 2 : 1;  // only lab hours
    }
}
