class Alpha {
    int a, b; //this is the instance variable for the AlphaClass

    Alpha() {
        a = 10;
        b = 40;
        System.out.println("This is the example for non parameter constructor for AlphaClass");
    }

    Alpha(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("a"+a);
        System.out.println("b"+b);
        System.out.println("This is the example for parameter constructor for AlphaClass");
    }
}

class Beta extends Alpha {
    int x, y;  //after inheritance it have 4 instance variable

    Beta() {
        super();
        x = 40;
        y = 50;
        System.out.println("This is the example for non parameter constructor for BetaClass");
    }

    Beta(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("This is the example for  parameter constructor for BetaClass");
    }
    void display(){
        System.out.println("a"+a);
        System.out.println("b"+b);
        System.out.println("x"+x);
        System.out.println("y"+y);
    }
}

class LaunchInheritance3 {
    public static void main(String[] args) {
        System.out.println("Implemtation of the consttrcutoer in inhertiance");
        Beta obj=new Beta();
        obj.display();
    }
}