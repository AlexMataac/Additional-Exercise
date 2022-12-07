import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private String employeeId;
    private String lastName;
    private String firstName;
    private String gender;
    private int age;

    public Employee(String id, String lastName, String firstName, String gender, int age) {
        this.employeeId = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String id) {
        this.employeeId = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + employeeId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }

    public static class SortByEmployeeId implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getEmployeeId().compareTo(o2.getEmployeeId());
        }
    }

    public static class SortByLastName implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }

    public static class SortByFirstName implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }

    public static class SortByGender implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getGender().compareTo(o2.getGender());
        }
    }
    public static class SortByAge implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getAge() - o2.getAge();
        }
    }

}
