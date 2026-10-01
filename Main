public class Main {
    public static void main(String[] args) {
        // Створення викладача
        Teacher teacher = new Teacher(
                "Іваненко", "Олена", "Петрівна",
                "15.03.1980", "+380501112233", "ivanenko@college.edu.ua",
                "T-001", "Циклова комісія ІТ", "Викладач",
                12, "ООП, Бази даних"
        );

        // Створення групи
        Group group = new Group(
                "К-31", "Комп'ютерні науки", 3,
                25, teacher, "Коваленко, Петренко, Сидоренко"
        );

        // Створення студента
        Student student = new Student(
                "Коваленко", "Ярослав", "Русланович",
                "12.07.2005", "+380671234567", "kovalenko@student.edu.ua",
                "ST-2023-045", group, "122 Комп'ютерні науки",
                3, 9.4, "10, 11, 9, 12"
        );

        // Створення дисципліни
        Discipline discipline = new Discipline(
                "Об'єктно-орієнтоване програмування", 72,
                teacher, 5, "Екзамен"
        );

        // Створення оцінки
        Grade grade = new Grade(
                11, "28.09.2026", student, discipline, teacher, "Поточна"
        );

        // Створення журналу
        Journal journal = new Journal(
                group, discipline, 5, "Коваленко:11, Петренко:10"
        );

        // Вивід toString() для всіх об'єктів
        System.out.println("=== Викладач ===");
        System.out.println(teacher.toString());
        System.out.println();

        System.out.println("=== Група ===");
        System.out.println(group.toString());
        System.out.println();

        System.out.println("=== Студент ===");
        System.out.println(student.toString());
        System.out.println();

        System.out.println("=== Дисципліна ===");
        System.out.println(discipline.toString());
        System.out.println();

        System.out.println("=== Оцінка ===");
        System.out.println(grade.toString());
        System.out.println();

        System.out.println("=== Журнал ===");
        System.out.println(journal.toString());
    }
}
