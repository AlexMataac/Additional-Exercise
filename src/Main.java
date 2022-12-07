import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static List<Employee> employees = new ArrayList<>();
    public static Map<Integer, String> map = new HashMap<>();
    public static boolean operationStatus = true;

    private static void sampleData() {
        employees.add(new Employee("10001", "Bryant", "Kobe", "Male", 44));
        employees.add(new Employee("10002", "Potter", "Harry", "Male", 36));
        employees.add(new Employee("10003", "Vermosa", "Kathryn", "Female", 26));
        employees.add(new Employee("10004", "Soberano", "Lisa", "Female", 23));
        employees.add(new Employee("10005", "Wagner", "Kuzz", "Male", 40));
    }

    private static void displayEmployee() {
        System.out.println("Original Employees List (displayed using traditional for loop):");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("\t" + employees.get(i));
        }
    }

    private static void setSortOptions() {
        map.put(1, "By Employee Id");
        map.put(2, "By Last Name");
        map.put(3, "By First Name");
        map.put(4, "By Gender");
        map.put(5, "By Age");
        map.put(-1, "Exit");
    }

    private static void chooseEmployeeSortOptions() {
        System.out.println("\n Choose Employee Sort Options");
        System.out.println("[1] By Employee Id");
        System.out.println("[2] By Last Name");
        System.out.println("[3] By First Name");
        System.out.println("[4] By Gender");
        System.out.println("[5] By Age");
        System.out.println("[-1] Exit");

        System.out.println("Enter Sort Option: ");
        int option = sc.nextInt();

        if (option == -1) {
            operationStatus = false;
            System.out.println("GoodBye!");
        } else if (!(option >= 1 && option <= 5)) {
            System.out.println("Unsupported sort option!");
        }else {
            sortEmployee(option);
            displaySortedEmployee(option);
        }
    }
    private static void sortEmployee(int option) {
        switch (option) {
            case 1 -> {
                employees.sort(new Employee.SortByEmployeeId());
                System.out.println("Sorted Employee List By Employee Id");
            }
            case 2 -> {
                employees.sort(new Employee.SortByFirstName());
                System.out.println("Sorted Employee List By First Name");
            }
            case 3 -> {
                employees.sort(new Employee.SortByLastName());
                System.out.println("Sorted Employee List By Last Name");
            }
            case 4 -> {
                employees.sort(new Employee.SortByGender());
                System.out.println("Sorted Employee List By Gender");
            }
            case 5 -> {
                employees.sort(new Employee.SortByAge());
                System.out.println("Sorted Employee List By Age");
            }
//            case -1 -> {
//                System.out.println("Goodbye!");
//                operationStatus = false;
//                break;
//            }
//            default -> {
//                System.out.println("Unsupported sort option!");
//                operationStatus = false;
//                break;
//            }
        }
    }
        private static void displaySortedEmployee (int option) {
            System.out.println("Sorted Employee List " + map.get(option) + "(displayed using foreach):");
            employees.forEach(System.out::println);
        }
    public static void main (String[]args){
        sampleData();
        displayEmployee();
        setSortOptions();

        while (operationStatus) {
            chooseEmployeeSortOptions();
        }
    }
}

