import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<String> courses;

    public Student(String name, String id) {
        super(name, id);
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(String courseName) {
        courses.add(courseName);
        System.out.println(name + " enrolled in " + courseName);
    }

    public void listCourses() {
        System.out.println(name + "'s courses: " + courses);
    }
}
