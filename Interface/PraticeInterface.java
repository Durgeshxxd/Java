interface Animal{
    void makesound();
}
class Dog implements Animal {
    public void makesound(){
        System.out.println("Dog can bark");
    }
}
class Cat implements  Animal{
    public void makesound(){
        System.out.println("Cat can meww");
    }
}
class PraticeInterface {
    public static void main(String[] args) {
        System.out.println("This is the pratice questions for interface");
        Dog d1=new Dog();
        Cat c1=new Cat();
        d1.makesound();
        c1.makesound();
    }
}

