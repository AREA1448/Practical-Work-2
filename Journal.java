public class Journal {
    private Group group;
    private Discipline discipline;
    private int semester;
    private String gradesList; // спрощено

    public Journal() {
    }

    public Journal(Group group, Discipline discipline, int semester, String gradesList) {
        this.group = group;
        this.discipline = discipline;
        this.semester = semester;
        this.gradesList = gradesList;
    }

    public void addGrade(Grade grade) {
        // TODO: реалізація
    }

    public void viewGroupGrades() {
        // TODO: реалізація
    }

    public double calculateAverage() {
        // TODO: реалізація
        return 0.0;
    }

    public void saveJournal() {
        // TODO: реалізація
    }

    public void printJournal() {
        // TODO: реалізація
    }

    @Override
    public String toString() {
        return "Journal{" +
                "group=" + (group != null ? group.getName() : "null") +
                ", discipline=" + (discipline != null ? discipline.toString() : "null") +
                ", semester=" + semester +
                ", gradesList='" + gradesList + '\'' +
                '}';
    }
}
