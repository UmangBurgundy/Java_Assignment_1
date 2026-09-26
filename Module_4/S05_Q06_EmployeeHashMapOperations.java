import java.util.HashMap;
import java.util.Map;

public class S05_Q06_EmployeeHashMapOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");
        System.out.println("Employees map: " + employees);

        int checkId = 102;
        System.out.println("Contains employee ID " + checkId + "? " + employees.containsKey(checkId));

        System.out.println("Iterating using KeySet:");
        for (Integer id : employees.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employees.get(id));
        }

        System.out.println("Iterating using EntrySet:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
