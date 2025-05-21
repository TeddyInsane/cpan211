package CPAN211_Assignment1;

import java.util.HashMap;
import java.util.Map;

/**
 * Main class to run the program and calculate total participation hours
 */
public class Main {
    public static void main(String[] args) {
        // Data for all participants
        String[] data = {
            "Professor Isaac Newton Physics 6",
            "TA Marie Curie Physics 6",
            "Professor Isaac Newton Calculus 4",
            "Student Amy Adams Calculus 4",
            "Student Will Smith Calculus 4",
            "Student Brad Pitt Physics 6",
            "Student Will Smith Physics 6",
            "Professor Dmitri Mendeleev Chemistry 6",
            "TA Carl Gauss Calculus 4",
            "Student Amy Adams Economics 3",
            "Professor Adam Smith Economics 3",
            "TA Marie Curie Chemistry 6",
            "Student Brad Pitt Chemistry 6",
            "Student Will Smith Chemistry 6"
        };

        Map<String, Person> people = new HashMap<>();

        for (String line : data) {
            String[] parts = line.split(" ");
            String role = parts[0];
            String firstName = parts[1];
            String lastName = parts[2];
            // String course = parts[3];  // Not used but can be saved if needed
            int courseHours = Integer.parseInt(parts[4]);

            // Unique key for each person to avoid duplicates
            String key = role + " " + firstName + " " + lastName;

            // Retrieve person or create new if not exists
            Person person = people.get(key);
            if (person == null) {
                switch (role) {
                    case "Professor":
                        person = new Professor(firstName, lastName);
                        break;
                    case "TA":
                        person = new TA(firstName, lastName);
                        break;
                    case "Student":
                        person = new Student(firstName, lastName);
                        break;
                    default:
                        System.out.println("Unknown role: " + role);
                }
                people.put(key, person);
            }

            // Add participation hours for this course
            person.addCourseHours(courseHours);
        }

        // Print all participants with total hours
        for (Person p : people.values()) {
            System.out.println(p);
        }
    }
}
