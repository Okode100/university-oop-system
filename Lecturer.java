public class Lecturer extends Person implements Payable {
    public Lecturer(String name, String id) {
        super(name, id);
    }

    @Override
    public void paySalary() {
        System.out.println(name + " has been paid their salary.");
    }

    public void assignGrade(Student student, String course, String grade) {
        System.out.println(name + " assigned grade " + grade + " to " + student.name + " in " + course);
    }
}
