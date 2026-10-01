public class Discipline {
    private String name;
    private int hours;
    private Teacher teacher;
    private int semester;
    private String controlForm; // екзамен / залік

    public Discipline() {
    }

    public Discipline(String name, int hours, Teacher teacher,
                      int semester, String controlForm) {
        this.name = name;
        this.hours = hours;
        this.teacher = teacher;
        this.semester = semester;
        this.controlForm = controlForm;
    }

    public void assignTeacher(Teacher teacher) {
        // TODO: реалізація
    }

    public void getInfo() {
        // TODO: реалізація
    }

    public void changeHours(int newHours) {
        // TODO: реалізація
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", teacher=" + (teacher != null ? teacher.getFullName() : "null") +
                ", semester=" + semester +
                ", controlForm='" + controlForm + '\'' +
                '}';
    }
}
