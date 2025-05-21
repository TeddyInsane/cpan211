package CPAN211_Assignment1;

/**
 * Professor class extending Person.
 * Professors attend only lecture hours.
 */
public class Professor extends Person {

    public Professor(String firstName, String lastName) {
        super("Professor", firstName, lastName);
    }

    /**
     * Calculate lecture hours: totalHours - labHours.
     * Lecture hours = courseHours - labHours
     * Lab hours = 2 if courseHours > 4 else 1
     */
    @Override
    public int getParticipatingHours(int courseHours) {
        int labHours = courseHours > 4 ? 2 : 1;
        return courseHours - labHours;
    }
}
