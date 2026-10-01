public class Grade {
    private int value;
    private String date;
    private Student student;
    private Discipline discipline;
    private Teacher teacher;
    private String type; // поточна, підсумкова, екзаменаційна

    public Grade() {
    }

    public Grade(int value, String date, Student student,
                 Discipline discipline, Teacher teacher, String type) {
        this.value = value;
        this.date = date;
        this.student = student;
        this.discipline = discipline;
        this.teacher = teacher;
        this.type = type;
    }

    public void assignGrade() {
        // TODO: реалізація
    }

    public void changeGrade(int newValue) {
        // TODO: реалізація
    }

    public void getInfo() {
        // TODO: реалізація
    }

    @Override
    public String toString() {
        return "Grade{" +
                "value=" + value +
                ", date='" + date + '\'' +
                ", student=" + (student != null ? student.getFullName() : "null") +
                ", discipline=" + (discipline != null ? discipline.toString() : "null") +
                ", teacher=" + (teacher != null ? teacher.getFullName() : "null") +
                ", type='" + type + '\'' +
                '}';
    }
}
