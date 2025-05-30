public class UniversityApp {
    public static void main(String[] args) {
        Person student1 = new Student("Mercy", "S001");
        Person lecturer1 = new Lecturer("Dr. Okode", "L101");

        student1.displayInfo();
        lecturer1.displayInfo();

        // Cast to access specific methods
        ((Student) student1).enrollCourse("Java Programming");
        ((Student) student1).listCourses();

        ((Lecturer) lecturer1).assignGrade((Student) student1, "Java Programming", "A");
        ((Payable) lecturer1).paySalary();
    }
}
