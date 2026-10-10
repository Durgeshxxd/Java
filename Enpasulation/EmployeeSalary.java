class EmployeeSalary {

    private int id;
    private String name;
    private double salary;

    // Constructor
    public EmployeeSalary(int id, String name, double salary) {
        setId(id);
        setName(name);
        setSalary(salary);
    }

    // Getter
    public int getId() {
        return this.id;
    }

    // Setter
    public void setId(int id) {
        this.id = id;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Setter
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative");
        }
    }

    // Controlled modification
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * percentage / 100;
        }
    }

    // Getter
    public double getSalary() {
        return this.salary;
    }
}

class Main {
    public static void main(String[] args) {

        EmployeeSalary obj1 =
                new EmployeeSalary(123, "Durgesh", 50000);

        obj1.increaseSalary(10);

        System.out.println("Name: " + obj1.getName());
        System.out.println("ID: " + obj1.getId());
        System.out.println("Salary: " + obj1.getSalary());
    }
}