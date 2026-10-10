class Parent{
    void xyz(){
        System.out.println("This is the method for class parent");
    }
}
class Child extends Parent{

}
class Basicinheritance{
    public static void main(String[] args) {
        System.out.println("This is the example of the inheritance");
        Child c1=new Child();
        c1.xyz();
    }
}

//Parent class ki properities agar children class access kr leti hai to usko inheritance bolte hao