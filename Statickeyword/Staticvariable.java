class Students{
    String name;
    int age;
//    String school_name;
    static String school_name="IIMT";
    //Static variable is initalized at once at the time of the progrma exceuation
    Students(String name,int age){
         this.name=name;
         this.age=age;

    }
    void StudentDetails() {
        System.out.println("Name," + name);
        System.out.println("Name," + age);
        System.out.println("Name," + school_name);
        System.out.println("==========================================");
    }
}
class Main{
    public static void main(String[] args) {
        Students st1=new Students("Durgesh",12);
        st1.StudentDetails();

        Students st2=new Students("Devesh",14);
        st2.StudentDetails();

        //problem is here there is value for the school_name is same for all object ===it alloacates some memory=2 byte ===suppose ==10000 object ===then 10000*2=20000 byte memory allocates
        //jo hame need nhi hai to usko as a static variables bna skte hai jo across jitne bhi object honge unke sath shared hoga ye
        //Benefits of static variable one time memory alloacations hoti hainn...
    }
}