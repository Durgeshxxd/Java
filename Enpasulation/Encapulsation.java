class Encapulsation{
    private String name;
    private int age;
    private int marks;

    //creation of the methods

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if(marks>0 && marks <100){
            this.marks = marks;
            System.out.println("The value of marks is"+marks);
        }else {
            System.out.println("The value is assigned for the setter is not in between 5-30");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>5 && age<30) {
            this.age = age;
            System.out.println("The value of age is"+marks);
        }else {
            System.out.println("The value is assigned for the setter is not in between 5-30");
        }
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("This is the coding for Encapulsation");
        Encapulsation obj1=new Encapulsation();
//        obj1.name="Durgesh Upadhyay"; Encapulsation.java:17: error: name has private access in Encapulsation ===//1 error
        obj1.setMarks(25);
        obj1.getMarks();
        obj1.setAge(40);
        obj1.getAge();
    }
}
