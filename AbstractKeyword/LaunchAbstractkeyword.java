/*
========================================================
REAL-LIFE DEVELOPMENT EXAMPLE: EMPLOYEE PAYROLL SYSTEM
========================================================

QUESTION:

Tum ek company mein Java developer ho.
Company ko Employee Payroll Management System banana hai.

Company mein 2 types ke employees hain:

1. Permanent Employee:
   Basic Salary + 20% Bonus

2. Contract Employee:
   Basic Salary + Rs. 2000 Fixed Allowance

REQUIREMENTS:

1. Employee naam ki abstract class banao.
2. name aur basicSalary common properties rakho.
3. calculateSalary() abstract method banao.
4. showDetails() normal method banao.
5. PermanentEmployee aur ContractEmployee classes banao.
6. Dono child classes mein calculateSalary() implement karo.
7. Parent reference se dono employees ke objects create karo.

WHY ABSTRACTION IS USED IN REAL PROJECTS?

- Common properties ek parent class mein rakhi jaati hain.
- Salary calculation ka implementation child classes mein hota hai.
- Har employee type apna salary calculation logic define karta hai.
- Common code reuse hota hai aur duplication kam ho sakta hai.

========================================================
JAVA CODE
========================================================
*/

abstract class Employee {

    // Common properties: sabhi employees ke liye
    String name;
    double basicSalary;

    // Parent class constructor
    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Abstract method: child class ko implementation dena hoga
    abstract double calculateSalary();

    // Common method: sabhi employees ki details print karega
    void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);

        // Runtime polymorphism:
        // Actual object ki calculateSalary() method execute hogi
        System.out.println("Final Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee {

    PermanentEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double calculateSalary() {

        // Permanent employee ko 20% bonus milega
        return basicSalary + (basicSalary * 20 / 100);
    }
}

class ContractEmployee extends Employee {

    ContractEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double calculateSalary() {

        // Contract employee ko Rs. 2000 fixed allowance milega
        return basicSalary + 2000;
    }
}

public class Main {

    public static void main(String[] args) {

        // Parent reference + PermanentEmployee object
        // Isse Upcasting bhi kehte hain
        Employee e1 = new PermanentEmployee("Rahul", 30000);

        // Parent reference + ContractEmployee object
        Employee e2 = new ContractEmployee("Aman", 25000);

        // Permanent employee ki details aur salary
        e1.showDetails();

        System.out.println("--------------------");

        // Contract employee ki details aur salary
        e2.showDetails();
    }
}

/*
========================================================
EXPECTED OUTPUT:

Employee Name: Rahul
Basic Salary: 30000.0
Final Salary: 36000.0
--------------------
Employee Name: Aman
Basic Salary: 25000.0
Final Salary: 27000.0

========================================================
IMPORTANT NOTES:

1. Employee abstract class hai, iska direct object nahi
   bana sakte.

2. calculateSalary() abstract method hai, jiska body
   parent class mein nahi hai.

3. PermanentEmployee aur ContractEmployee apna logic
   implement karte hain.

4. name aur basicSalary common properties hain,
   isliye parent class mein rakhi gayi hain.

5. Salary calculation alag hai, isliye child classes
   mein implement ki gayi hai.

6. Employee e1 = new PermanentEmployee(...);
   Reference type = Employee
   Actual object = PermanentEmployee

7. showDetails() ke andar calculateSalary() call hone
   par actual object ka overridden method execute hota hai.
   Ye Runtime Polymorphism hai.

8. Abstract class ka reference banana allowed hai,
   lekin abstract class ka direct object banana allowed nahi.

========================================================
*/