class Students {
    String name;
    int age;
    public String schoolname;
    private String schooladdress;

    void studentdetails() {
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
        System.out.println("School Name: " + schoolname);
        System.out.println("School Address: " + schooladdress);
    }
}

public class App {
    public static void main(String[] args) {
        // to create the object for the Students
        Students stud = new Students();
        stud.name = "Durgesh";
        stud.age = 12;
        stud.schoolname = "ABC School";
        // stud.schooladdress = "123 Main Street";
        stud.studentdetails();
    }
}