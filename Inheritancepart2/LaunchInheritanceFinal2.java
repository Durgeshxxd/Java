class Plane1 {
    final Plane1(){
     System.out.println("Plane is flying");
 }
 //Note when i going to make constructor as a final then error will shown===Illegel Modifier for the Constructor in Type Plane 1 =Only private,protected ,default  and public is allowed
}
class FighterPlane extends  Plane1{

}
class LaunchInheritanceFinal2 {
    public static void main(String[] args) {
        System.out.println("This is the class why final keyword is not used with constructor");
        FighterPlane f1=new FighterPlane();
    }
}

///===================================================Uses of Final Keyword========================================================================
//Java development mein final keyword ka use code ko safe, predictable aur maintainable banane ke liye hota hai. Real projects mein iska use variables, methods aur classes par restrictions lagane ke liye kiya jata hai.
//        1. final variable — Configuration aur fixed values
//Suppose tum Spring Boot ya kisi Java backend mein maximum login attempts define kar rahe ho.
//class LoginService {
//
//    private final int MAX_LOGIN_ATTEMPTS = 5;
//
//    public void login() {
//        System.out.println(MAX_LOGIN_ATTEMPTS);
//    }
//}
//
//
//Development mein use:
//        - Fixed values ko accidentally change hone se bachana.
//        - Business rules aur configuration constants define karna.
//- Code ko readable aur maintainable banana.
//Note: Constants ke liye generally static final use hota hai.
//private static final int MAX_LOGIN_ATTEMPTS = 5;
//
//
//static ka matlab class-level variable aur final ka matlab reassignment allowed nahi.
//2. final method — Important logic ko override hone se bachana
//Suppose payment system mein transaction validation ka method hai.
//class PaymentService {
//
//    public final boolean validatePayment(double amount) {
//        return amount > 0;
//    }
//}
//
//
//Ab koi child class validatePayment() ko override karke uska behavior change nahi kar sakti.
//Development mein use:
//        - Critical business logic ko accidental overriding se protect karna.
//- Inheritance ke through behavior change hone par restrictions lagana.
//Dhyan rahe, final method ko inherit aur call kar sakte ho; sirf override nahi kar sakte.
//3. final class — Inheritance ko restrict karna
//public final class PaymentConstants {
//
//    public static final String CURRENCY = "INR";
//}
//
//
//Koi doosri class PaymentConstants ko extend nahi kar sakti.
//Development mein use:
//        - Jab class ko extend karne dena intended na ho.
//        - Utility ya immutable classes design karte waqt, requirements ke according.
//        Example: Java ki String class final hai.
//4. Method parameters aur local variables
//public void recharge(final double amount) {
//    // amount = 500; // Compilation error
//    System.out.println(amount);
//}
//
//
//Development mein use:
//        - Method ke andar parameter ko accidentally reassign hone se bachana.
//        - Code ko samajhna aur debug karna easier banana.
//Note: Java mein method parameters ko final banana generally optional hai.
//        5. final reference — Object reference ko protect karna
//final StringBuilder message = new StringBuilder("Hello");
//
//message.append(" Java");  // Allowed
//// message = new StringBuilder("Hi"); // Error
//
//
//Yahan reference ko doosre object par point nahi kara sakte, lekin original object ka content change kar sakte ho.
//Important: final reference ka matlab object immutable hai, aisa nahi hota.
//
//Real development mein kab use karein?
//Requirement	Recommended approach
//Fixed configuration constant	static final
//Method parameter reassign nahi karna	final parameter, when useful
//Method override nahi hone dena	final method
//Class extend nahi hone dena	final class
//Immutable data object banana	final fields + appropriate immutable design
//Practical example: Recharge service
//class RechargeService {
//
//    private static final double MIN_RECHARGE = 50.0;
//
//    public boolean validateRecharge(final double amount) {
//
//        if (amount < MIN_RECHARGE) {
//            return false;
//        }
//
//        return true;
//    }
//}