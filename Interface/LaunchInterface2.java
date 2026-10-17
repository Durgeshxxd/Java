interface Animal {
    //public abstract
    void dog();

    void cat();
}
interface Human{
    void run();
    void eat();
}

class Cando implements Animal,Human {
    public void dog() {
        System.out.println("Dog is barking");
    }

    //note jab bhi existing method ka implementation/overriding hoti hai to ham uski visibilty and accessbilty kam nhi ker skte
    //this is the main rule
    //if we do below then it will shown an error
    //    void dog(){
    //        System.out.println("Dog is barking");
    //    }
    //a class can implements multiple interface
    public void cat() {
        System.out.println("Cat is mewwing");
    }
    public void run(){
        System.out.println("Human Can run with two legs");
    }
    public void eat(){
        System.out.println("Human can eat with both hands");
    }
}

class LaunchInterface2 {
    public static void main(String[] args) {
        System.out.println("This is the class for how a childclass can add implementation on multiple interface methods");
        Cando c1 = new Cando();
        c1.cat();
        c1.dog();
        c1.eat();
        c1.run();
    }
}