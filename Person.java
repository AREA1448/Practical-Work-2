public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private String birthDate;
    private String phone;
    private String email;

    // Конструктор за замовчуванням
    public Person() {
    }

    // Конструктор з параметрами
    public Person(String lastName, String firstName, String middleName,
                  String birthDate, String phone, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
    }

    // Методи з порожньою реалізацією
    public String getFullName() {
        // TODO: реалізація
        return null;
    }

    public void changeContactInfo(String phone, String email) {
        // TODO: реалізація
    }

    public void printInfo() {
        // TODO: реалізація
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


