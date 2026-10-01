public class Group {
    private String name;
    private String specialty;
    private int course;
    private int studentsCount;
    private Teacher curator;
    private String studentsList; // спрощено

    public Group() {
    }

    public Group(String name, String specialty, int course,
                 int studentsCount, Teacher curator, String studentsList) {
        this.name = name;
        this.specialty = specialty;
        this.course = course;
        this.studentsCount = studentsCount;
        this.curator = curator;
        this.studentsList = studentsList;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        // TODO: реалізація
    }

    public void removeStudent(Student student) {
        // TODO: реалізація
    }

    public double calculateAverageGrade() {
        // TODO: реалізація
        return 0.0;
    }

    public void getStudentsList() {
        // TODO: реалізація
    }

    public void changeCurator(Teacher newCurator) {
        // TODO: реалізація
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", course=" + course +
                ", studentsCount=" + studentsCount +
                ", curator=" + (curator != null ? curator.getFullName() : "null") +
                ", studentsList='" + studentsList + '\'' +
                '}';
    }
}
