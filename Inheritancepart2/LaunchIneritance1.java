class Parent {
    int a;
    int b;

    public void buy() {
        System.out.println("Parent is buy cycle for their children");
    }

    void newbuy() {
        System.out.println("Parent is buy new brand cycle");
    }

    public int sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }
}

class Child extends Parent {

    //    private void buy(){
    //        System.out.println("I want to buy car");
    //    }  ==since during method override in a parentchild relationship we can can the visibilty and accessbilty of the Parent class methods

    //    void buy(){
    //        System.out.println("I want to buy a verna car");
    //    } ===agin here if we cannot assign some access modifiers by default it will be default ==now as we can see it we are chaging the visibilty and accessbilty of the parent class methods

    //    public int buy(){
    //        System.out.println("I want to buy the mercides car");
    //        return 10;
    //    } ==so we cannot change the return type in the override methods if there is an parent-child relationship.

    //    public newbuy(){
    //        System.out.println("I am agree");
    //    }===from default to public we can increase the visibilty and accessbilty of the overridemethods

    /*
     */

    // Method Overriding
    @Override
    public void buy() {
        System.out.println("I want to buy a Verna car");
    }

    // Method Overloading
    public int sum() {
        int result = 100 + 200;
        System.out.println("Child sum without parameters: " + result);
        return result;
    }

    // Method Overloading
    public int sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Child sum of three numbers: " + result);
        return result;
    }
}

class LaunchInheritance1 {
    public static void main(String[] args) {

        //       System.out.println("This is the lecture for final keyword==");

        Child c1 = new Child();

        // Method Overriding
        c1.buy();

        // Parent class inherited method
        c1.newbuy();

        // Parent's sum(int, int) method
        c1.sum(20, 40);

        // Child's overloaded sum() method
        c1.sum();

        // Child's overloaded sum(int, int, int) method
        c1.sum(10, 20, 30);
    }
}

//=====================================This class is for overridding methods in parent-child relationships============================
