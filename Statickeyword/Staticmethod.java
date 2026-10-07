class Collegestudens {
    int age = 20;
    static String name = "Durgesh";

    //if we create two method
    void m1() {
        System.out.println(name);
        System.out.println("This is the value of m1");
    }

    static void m2() {
//       System.out.println(age);   ===Note===We can not access not static variable in static method======
        System.out.println("This is the value for m2");
    }
}

class Staticmethod {
    public static void main(String[] args) {
        Collegestudens c1 = new Collegestudens();
        c1.m1();
//  c1.m2();
        Collegestudens.m2();
    }
}


//static method ko call krne ke liye object bnane ki zaurat nhi hoti hai directly ham classname ke through call ker skte hai
// static methods belongs to class not object