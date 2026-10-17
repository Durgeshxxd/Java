interface calc {
    void sum(int a, int b);

    void sub(int a, int b);
    //all methods declared inside the interface is by default public and abstract
    //and it is the rule for abstract method if any abstract method present is class then it is mandatory to write abstract class if method implementation is not done
}

class Mycalc1 implements calc {

    public void sum(int a, int b) {
        int res = a + b;
        System.out.println("The value of sum is " + res);
    }

    public void sub(int a, int b) {
        int res = a - b;
        System.out.println("The value of sum is " + res);
    }
}

//Above code is for developer 1 implementation

class Mycalc2 implements calc {
    public void sum(int a, int b) {
        int res1 = a;
        int res2 = b;
        int res3 = res1 + res2;
        System.out.println("The value of sum is " + res3);
    }

    public void sub(int a, int b) {
        int res1 = a;
        int res2 = b;
        int res3 = res1 - res2;
        System.out.println("The value of sum is " + res3);
    }
}

//Above code is for developer 2 implementation

class Algebra {
    public void cal(calc c, int a, int b) {
        c.sum(a, b);
        c.sub(a, b);
    }
}

class LaunchInterface1 {
    public static void main(String[] args) {
        Mycalc1 mycal1 = new Mycalc1();
        Mycalc2 mycalc2 = new Mycalc2();
        mycal1.sum(12, 40);
        mycal1.sub(40, 10);
        mycalc2.sub(10, 30);
        mycalc2.sum(30, 50);

        Algebra alg = new Algebra();
        alg.cal(mycal1, 20, 10);   // interface reference ko Mycalc1 object mila
        alg.cal(mycalc2, 50, 25);  // same method, ab Mycalc2 ka implementation chalega
    }
}

//Note interface is only gives the requirements ,if any method present inside the interface by default access modifier is public so if we wheather write or not write by default public abstract added on the method internally
//For class to class linking we used extends keyword to acheived inheritance same as for interface and class linking we used implements