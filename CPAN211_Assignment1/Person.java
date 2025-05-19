package CPAN211_Assignment1;

public abstract class Person implements ParticipateHours {
    protected String firstName;
    protected String lastName;
    protected String title;
    protected int totalHours;

    public Person(String title, String firstName, String lastName) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalHours = 0;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getTitle() {
        return title;
    }

    public void addCourseHours(int courseHours) {
        this.totalHours += getParticipatingHours(courseHours);
    }

    public int getTotalHours() {
        return totalHours;
    }

    // This method will be implemented differently in each subclass
    public abstract int getParticipatingHours(int courseHours);
}
