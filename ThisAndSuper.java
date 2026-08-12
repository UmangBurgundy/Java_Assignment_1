public class ThisAndSuper {
    static class ParentPerson {
        String name;
        ParentPerson(String name) { this.name = name; }
    }

    static class EmployeePerson extends ParentPerson {
        int id;
        EmployeePerson(String name, int id) {
            super(name);
            this.id = id;
        }

        void display() {
            System.out.println("ID: " + id + ", Name: " + super.name);
        }
    }

    public static void main(String[] args) {
        EmployeePerson emp = new EmployeePerson("Alice", 101);
        emp.display();
    }
}
