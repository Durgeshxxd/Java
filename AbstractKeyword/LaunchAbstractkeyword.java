//# Java Abstraction — Real-Life Development Example
//
//## 1. Real project mein Abstraction ki zaroorat kyon hoti hai?
//
//Suppose tum ek company mein Java developer ho aur tumhe ek **Employee Payroll Management System** develop karna hai.
//
//Company mein do types ke employees hain:
//
//        - Permanent Employee
//- Contract Employee
//
//Dono employees ki common properties hain:
//        - Employee name
//- Basic salary
//
//Lekin salary calculate karne ka logic alag hai:
//
//        - Permanent Employee: Basic Salary + 20% Bonus
//- Contract Employee: Basic Salary + ₹2,000 Allowance
//
//Agar har employee ki common properties aur methods alag-alag likhenge, toh code duplication ho sakta hai.
//
//**Solution:** Abstract class `Employee` banao, jisme common properties aur methods hon. Salary calculation ke liye abstract method rakho, jise har child class apne according implement kare.
//
//        ## 2. Real-Life Question
//
//Tum ek company ke Java developer ho. HR team ko employee salaries calculate karne ke liye application chahiye.
//
//**Requirements:**
//
//        1. `Employee` naam ki abstract class banao.
//        2. `name` aur `basicSalary` common properties rakho.
//3. `calculateSalary()` abstract method banao.
//        4. `showDetails()` normal method banao, jo employee details print kare.
//5. `PermanentEmployee` aur `ContractEmployee` classes banao.
//        6. Dono classes mein `calculateSalary()` implement karo.
//        7. `main()` mein parent reference se dono employees ke objects create karo.
//
//        ### Test Data
//
//| Employee Type | Name | Basic Salary |
//        |---|---|---:|
//        | Permanent | Rahul | ₹30,000 |
//        | Contract | Aman | ₹25,000 |
//
//        **Expected output:**
//
//        ```text
//Employee Name: Rahul
//Basic Salary: 30000.0
//Final Salary: 36000.0
//        --------------------
//Employee Name: Aman
//Basic Salary: 25000.0
//Final Salary: 27000.0
//        ```
//
//        ## 3. Complete Java Code
//
//```java
//// Abstract parent class
//abstract class Employee {
//
//    // Common properties for all employees
//    String name;
//    double basicSalary;
//
//    // Parent constructor
//    Employee(String name, double basicSalary) {
//        this.name = name;
//        this.basicSalary = basicSalary;
//    }
//
//    // Abstract method: child classes must implement it
//    abstract double calculateSalary();
//
//    // Common method shared by all employees
//    void showDetails() {
//        System.out.println("Employee Name: " + name);
//        System.out.println("Basic Salary: " + basicSalary);
//        System.out.println("Final Salary: " + calculateSalary());
//    }
//}
//
//// Permanent employee implementation
//class PermanentEmployee extends Employee {
//
//    PermanentEmployee(String name, double basicSalary) {
//        super(name, basicSalary);
//    }
//
//    @Override
//    double calculateSalary() {
//        // Basic salary + 20% bonus
//        return basicSalary + (basicSalary * 20 / 100);
//    }
//}
//
//// Contract employee implementation
//class ContractEmployee extends Employee {
//
//    ContractEmployee(String name, double basicSalary) {
//        super(name, basicSalary);
//    }
//
//    @Override
//    double calculateSalary() {
//        // Basic salary + fixed allowance
//        return basicSalary + 2000;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        // Parent reference + child objects
//        Employee e1 = new PermanentEmployee("Rahul", 30000);
//        Employee e2 = new ContractEmployee("Aman", 25000);
//
//        // Runtime polymorphism
//        e1.showDetails();
//
//        System.out.println("--------------------");
//
//        e2.showDetails();
//    }
//}
//```
//
//        ## 4. Code mein Abstraction kahan use hui?
//
//        - `abstract class Employee`: common employee structure define karti hai.
//        - `abstract double calculateSalary()`: salary calculation ka contract define karta hai.
//- `PermanentEmployee`: apna bonus calculation implement karta hai.
//        - `ContractEmployee`: apna allowance calculation implement karta hai.
//        - `Employee e1 = new PermanentEmployee(...)`: parent reference se child object access hota hai.
//        - `showDetails()`: common code reuse karta hai aur `calculateSalary()` call karne par actual child implementation execute hoti hai.
//
//## 5. Important Rules
//
//1. Abstract class ka direct object nahi bana sakte.
//        2. Abstract class mein abstract aur normal, dono methods ho sakte hain.
//        3. Concrete child class ko inherited abstract methods implement karne hote hain.
//4. Parent reference child object ko refer kar sakta hai.
//5. Overridden method ka execution actual object ke according hota hai.
//
//        **Real development takeaway:** Abstraction ka use tab karo jab related classes ke beech common structure ho, lekin kuch operations ka implementation alag-alag ho. Isse code reuse aur maintainability improve ho sakti hai.
