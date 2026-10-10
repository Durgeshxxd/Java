class m1 {
    static int age = 10;
    String name = "Durgesh";

    static class m2 {
        void m4() {
            System.out.print("This m3 method of the class obj is executed");
            System.out.println("The static value for the outer class," + age);
            //we can access the value for the outer class static variables for non static variable we cannot access it value
            System.out.println("Accessing the value of non-static value for the outer class," + name);
            //for line number 10 if we try to access it shows user@user-Latitude-5320:~/Java/Statickeyword$ javac Staticclass.java
            //Staticclass.java:9: error: non-static variable name cannot be referenced from a static context
            // System.out.println("Accessing the value of non-static value for the outer class,"+name);
            //                                                                                              ^
            //1 error
        }
    }
}

class Staticclass {
    public static void main(String[] args) {

        m1.m2 obj = new m1.m2();

        obj.m4();
    }
}