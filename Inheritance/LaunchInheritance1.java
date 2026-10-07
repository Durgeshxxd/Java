class Parent {
    void Parentmethod() {
        System.out.println("Parent Method is running");
    }
}

class Parent1 {
    void Parentmethod1() {
        System.out.println("Parent1 Method is running");
    }
}

class Child extends Parent {

    @Override
    void Parentmethod() {
        System.out.println("Child Method is running");
    }
}

class LaunchInheritance1 {
    public static void main(String[] args) {

        Child obj = new Child();

        obj.Parentmethod();
    }
}

//Notes===Inheritance children extends or inherites the property of the Parent is known as inheritance
//Parent class can have multiple child class but vice versa is not possible.
//Reusability → existing code reuse karna
//Method Overriding → child apne according parent method ka behavior change kar sakta hai
//Polymorphism → Parent reference = new Child() possible
//Maintainability → common code ek parent class mein rakhne se changes easier hote hain

//Above example inwhich we can see the method Parentmethod is already exists in parent ===because of inheritance the property of the parent===inherites in childclass now child class changes the property of the method present in the Parent Class
//Now if we create the Obj of the children class and Call it then the override methods will called

//Note==If we create the class and extends keyword is not defined in the class interally the class inherites the property of the object class
//Object is the root parent class, and every non-primitive Java class ultimately inherits its common methods from Object.
//Multiple inheritance and cyclic inhertiance is not allowed in java.
//=============================Important methods includes in object class==============================================================

//| Method        | Purpose                                  |
//        | ------------- | ---------------------------------------- |
//        | `toString()`  | Object ka string representation          |
//        | `equals()`    | Objects compare karna                    |
//        | `hashCode()`  | Hash value generate karna                |
//        | `getClass()`  | Runtime class ki information             |
//        | `clone()`     | Object ki copy banane ke liye            |
//        | `wait()`      | Thread ko wait karana                    |
//        | `notify()`    | Waiting thread ko notify karna           |
//        | `notifyAll()` | Multiple waiting threads ko notify karna |


//===============================Interview Questions====================================================================================
//
//Is @Override mandatory?
//No. Method overriding can be done without @Override. However, using @Override is strongly recommended because it allows the compiler to verify that the method actually overrides a superclass method and helps catch mistakes.
//Think of it like:
//@Override
//   ↓
//"Compiler, please verify that I am overriding a parent method."
//Also remember: @Override does not cause overriding. The extends relationship + same method signature are what make overriding possible.