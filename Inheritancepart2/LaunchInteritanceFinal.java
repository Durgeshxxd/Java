```java
// FINAL KEYWORD IN JAVA
// final keyword is used to restrict modification.

// 1. FINAL CLASS
// final class Animal {
//     void makesound() {
//         System.out.println("Animal Can Make Sound");
//     }
// }
// Note: A final class cannot be inherited.
// Example: String is a final class in Java.

// --------------------------------------------------

class Animal {

    // 2. FINAL VARIABLE
    final int a = 10;

    // A final variable cannot be reassigned after initialization.
    // a = 20; // Compilation error

    // 3. FINAL METHOD
    final void makesound() {
        System.out.println("Animal Can Make Sound");
    }

    // Note: A final method can be inherited by a child class,
    // but it cannot be overridden.
    // Overloading a final method is allowed.
}

class Dog extends Animal {

    // 4. VARIABLE HIDING
    int a = 50;

    // Yahan Dog class ne apna alag a variable declare kiya hai.
    // Isse variable hiding kehte hain.
    // Parent ka final a = 10 change nahi hota.
    // Dog ka a aur Animal ka a do alag variables hain.

    // If we write:
    // final int b = 20;
    // b = 30; // Compilation error

    void bark() {
        a = 100; // Allowed: Dog ka a final nahi hai.
        System.out.println("Dog is barking");
    }

    // Agar yahan makesound() ko override karenge,
    // toh compilation error aayega because it is final.
    //
    // void makesound() {
    //     System.out.println("Dog makes sound");
    // }
}

// --------------------------------------------------

class LaunchInteritanceFinal {

    public static void main(String[] args) {

        System.out.println("This is for final keyword in java");

        Dog d1 = new Dog();

        // Parent class ka final method inherit hokar call hoga.
        d1.makesound();

        // Dog class ka variable a print hoga: 50
        System.out.println(d1.a);

        // bark() call karne par Dog ka a = 100 ho jayega.
        d1.bark();
        System.out.println(d1.a); // Output: 100

        // Parent class ke final variable ko access karna:
        System.out.println(((Animal) d1).a); // Output: 10

        // Final variable ko directly change nahi kar sakte.
        // ((Animal) d1).a = 200; // Compilation error

        // 5. FINAL CLASS
        // Agar Animal ko final class bana dein,
        // toh Dog extends Animal par compilation error aayega.
    }
}

// --------------------------------------------------
// QUICK REVISION:
//
// final variable -> Reassignment not allowed.
// final method   -> Overriding not allowed.
// final class    -> Inheritance not allowed.
// final method   -> Inheritance allowed.
// Same variable name in child -> Variable hiding.
// Final reference -> Reference reassign nahi kar sakte,
//                    but mutable object ka content change ho sakta hai.