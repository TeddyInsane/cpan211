package CPAN211_Assignment1;

/**
 * Abstract class representing a person involved in the college program.
 * Implements ParticipateHours interface.
 */
public abstract class Person implements ParticipateHours {
    protected String firstName;
    protected String lastName;
    protected String title;
    protected int totalHours;

    /**
     * Constructor to initialize a Person.
     */
    public Person(String title, String firstName, String lastName) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalHours = 0;
    }

    /**
     * Returns the full name of the person.
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * Returns the title (Professor, TA, Student).
     */
    public String getTitle() {
        return title;
    }

    /**
     * Adds hours attended in a course based on participation rules.
     */
    public void addCourseHours(int courseHours) {
        this.totalHours += getParticipatingHours(courseHours);
    }

    /**
     * Returns total hours accumulated.
     */
    public int getTotalHours() {
        return totalHours;
    }

    /**
     * Abstract method to calculate participating hours based on course hours.
     * Must be implemented by subclasses.
     */
    public abstract int getParticipatingHours(int courseHours);

    /**
     * Overrides toString to provide formatted output for each person.
     */
    @Override
    public String toString() {
        return title + " " + firstName + " " + lastName + " " + totalHours;
    }
}
