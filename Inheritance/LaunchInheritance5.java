class Alpha2 {
    int a, b;

    public Alpha2() {
        a = 10;
        b = 20;
        System.out.println("Alpha zero Param Constructor");
    }

    public Alpha2(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Param Constructor of Alpha");
    }
}

class Beta2 extends Alpha2 {
    int x, y;

    public Beta2() {
        this(2, 2);

        x = 1;
        y = 2;
        System.out.println("Beta Zero Param Constructor");
    }

    public Beta2(int x, int y) {
        super(4, 44);
//        super.a; Note if i want to refer the parent class member then we have to write super.instancevariable name.Another thing we can access only the value of the corresponding parent not grandparent
        this.x = x;
        this.y = y;
        System.out.println("Beta Param Constructor");
    }

    public void disp() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

public class LaunchInheritance5 {
    public static void main(String[] args) {
        Beta2 b = new Beta2(1, 2);
        b.disp();

        Beta2 b2 = new Beta2();
        b2.disp();
    }
}

//Note if i want to refer the parent class member then we have to write super.instancevariable name