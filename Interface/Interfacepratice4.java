interface Payment{
    public abstract void pay(double amount);
}
class UPIPayemnt implements Payment{
    public void pay(double amount){
        if (amount>0){
            System.out.println("Payment is Sucessfully Done by UPI");
        }else {
            System.out.println("Payment Failed");
        }
    }
}
class  CardPayment implements  Payment{
    public void pay(double amount){
        if(amount>0){
            System.out.println("Payment is Sucessfully Done by Card");
        }else {
            System.out.println("Payment Failed");
        }
    }
}
class CashPayment implements  Payment{
    public void pay(double amount){
        if (amount>0){
            System.out.println("Payment is Sucessfully Done by Cash");
        }else {
            System.out.println("Payment Failed");
        }
    }
}
class Interfacepratice4{
    public static void main(String[] args) {
//        UPIPayemnt up1=new UPIPayemnt();
//        CardPayment cp1=new CardPayment();
//        CashPayment cap1=new CashPayment();
//        cp1.pay(100);
//        cap1.pay(0);
//        up1.pay(100);

        //ab yisme object ka reference variables alag alag bn rhe hai dikkat nhi hai lekin agar ham chahte hai ki same reference variable se access krna to hame kuch cheez krni hogi
        //agar hmko same reference variable bna ke acess krna hai to
        // Payment interface ka naam hai.
        // payment ek reference variable hai.
        // Reference variable ka type interface bhi ho sakta hai
        // aur class bhi. Interface ka naam likhna compulsory nahi hai.
        Payment payment;
        // CardPayment ka object create hua.
        // payment reference ab CardPayment object ko refer kar raha hai.
        payment = new CardPayment();
        payment.pay(100);
        // Same reference variable ko reuse kar rahe hain.
        // Ab payment CashPayment object ko refer kar raha hai.
        payment = new CashPayment();
        payment.pay(0);
        // Wahi reference variable ab UPIPayment object ko refer kar raha hai.
        payment = new UPIPayment();
        payment.pay(100);
        // IMPORTANT NOTES:
        // 1. Payment interface hai, Java ka keyword nahi.
        // 2. Interface ka naam reference variable ka type ban sakta hai.
        // 3. Ek interface reference us interface ko implement
        //    karne wali different classes ke objects ko refer kar sakta hai.
        // 4. Is concept ko upcasting kehte hain.
        // 5. Actual object ke according method execute hona
        //    runtime polymorphism kehlata hai.
        // 6. Interface reference use karna compulsory nahi hai.
        //    Hum CardPayment payment = new CardPayment();
        //    jaise class reference bhi bana sakte hain.
        // 7. Lekin CardPayment type ka reference directly
        //    CashPayment ya UPIPayment object ko assign nahi kar sakta.
    }
}