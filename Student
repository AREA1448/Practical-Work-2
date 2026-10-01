public class Student extends Person {
    private String studentId;
    private Group group;
    private String specialty;
    private int course;
    private double averageGrade;
    private String gradesList; // спрощено для структури

    public Student() {
        super();
    }

    public Student(String lastName, String firstName, String middleName,
                   String birthDate, String phone, String email,
                   String studentId, Group group, String specialty,
                   int course, double averageGrade, String gradesList) {
        super(lastName, firstName, middleName, birthDate, phone, email);
        this.studentId = studentId;
        this.group = group;
        this.specialty = specialty;
        this.course = course;
        this.averageGrade = averageGrade;
        this.gradesList = gradesList;
    }

    public void attendClass() {
        // TODO: реалізація
    }

    public void receiveGrade(Grade grade) {
        // TODO: реалізація
    }

    public void moveToNextCourse() {
        // TODO: реалізація
    }

    public void viewProgress() {
        // TODO: реалізація
    }

    public void changeGroup(Group newGroup) {
        // TODO: реалізація
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", group=" + (group != null ? group.getName() : "null") +
                ", specialty='" + specialty + '\'' +
                ", course=" + course +
                ", averageGrade=" + averageGrade +
                ", gradesList='" + gradesList + '\'' +
                ", " + super.toString() +
                '}';
    }
}
