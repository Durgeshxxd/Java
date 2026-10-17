interface Calculator {

    void sum(int a, int b);

    void mul(int a, int b);

    void sub(int a, int b);
}

class Calculate implements Calculator {

    @Override
    public void sum(int a, int b) {
        int res = a + b;
        System.out.println("The value for sum is " + res);
    }

    @Override
    public void mul(int a, int b) {
        int res = a * b;
        System.out.println("The value for mul is " + res);
    }

    @Override
    public void sub(int a, int b) {
        int res = a - b;
        System.out.println("The value for sub is " + res);
    }
}

class InterfacePractice2 {

    public static void main(String[] args) {

        System.out.println("This is the calculator interface program");

        Calculate c1 = new Calculate();

        c1.mul(20, 40);
        c1.sub(60, 90);
        c1.sum(90, 100);
    }
}
