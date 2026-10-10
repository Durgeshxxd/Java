class Parentemployee {
    String name;
    double salary;
}

class developerchild extends Parentemployee {
    String programmingLanguage;
    void details() {
        System.out.println("The value for name, " + name + ", The value for salary, " + salary + ", The value for programminglanguage, " + programmingLanguage);
    }

}

class Employee {
    public static void main(String[] args) {
    developerchild d1=new developerchild();
    d1.name="Durgesh";
    d1.salary=40000;
    d1.programmingLanguage="Java";
    d1.details();
    }
}


//============================================Question====================================
//Q4. Employee → Developer
//
//Parent class:
//
//class Employee {
//    String name;
//    double salary;
//}
//
//Child class:
//
//class Developer extends Employee {
//    String programmingLanguage;
//}
//
//Task:
//Create a Developer object and set:
//
//name = "Durgesh"
//salary = 50000
//programmingLanguage = "Java"
//
//Then display all three values.