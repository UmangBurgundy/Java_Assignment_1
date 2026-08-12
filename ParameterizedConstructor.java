public class ParameterizedConstructor {
    static class Employee {
        int id;
        String name;
        Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Alice");
        System.out.println("Employee: " + emp.id + " - " + emp.name);
    }
}
