class Parent {
    int i = 10;

    void disp() {
        System.out.println("Disp of parent");
    }
}

class Child extends Parent {
    int i = 100;

    void alpha() {
        System.out.println("alpha");
        System.out.println(i);          // Child ka i  → 100
        System.out.println(super.i);    // Parent ka i → 10
        // disp();
        super.disp();                   // Parent ka disp()
    }

    void disp() {
        System.out.println("Disp of child");
    }
}

public class LaunchInheritance9 {
    public static void main(String[] args) {
        Child c = new Child();
        c.alpha();
    }
}

//==================================Note==================================
//================================Kya hai=================================
//Hidden super();	Sirf constructor me, compiler khud lagata hai
//super.variable, super.method()	Method me, aap khud likhte ho

//=============================Superkeyword part======================
//Kya inheritance ka part hai aur kya nahi?
//Concept	Inheritance se juda?
//        super(...)	Haan, parent constructor
//super.variable	Haan, parent ka variable
//super.method()	Haan, parent ka method
//Hidden super();	Haan, parent constructor chaining
//this, this.x, this(...)	Nahi, ye har class me chalta hai, inheritance ho ya na ho