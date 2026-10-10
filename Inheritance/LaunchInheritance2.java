class Company{
    void Login(){
        System.out.println("Employee is logged in");
    }
    void work(){
        System.out.println("Employee have some task ");
    }
}
class Employee extends Company{
    @Override
    void Login(){
        System.out.println("I will not present today");
    }
    //OverrideMethod===Childclass parent method ko apne according implementation change ker diya
    void Leave(){
        System.out.println("At saturday I will on leave");
        //This is the Sepicalised Method becuase child class make according to its requirement
    }
}
class LaunchInheritance2{
    public static void main(String[] args) {
        Employee obj1=new Employee();
        obj1.Login();
    }
}

//
//====================================Topic=Inherited Method,Overridden Methods and Specialized Method======================================
//
//=========================Inherited Method==========================================================================================
//If there is two class parent and Child ====if child class inherties the methods of the parent class without changing or redefining it is known as Inherited Method.
//
//=============================OverriddenMethod=========================================================================================
//If there is two class parent and child and if child inherited the property of the parent and after it done its own  implementation in method (OverriddenMethod)
//
//
//==============================Specilised Method=====================================================================================
//The method is only present in the child class rather than parent class during inheritance is known as specilised Method
