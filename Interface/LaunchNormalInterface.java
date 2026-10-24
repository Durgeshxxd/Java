interface Payments{
    void pay();
    //if an interface consists of one or more abstract methods then it is called Normal Interface
    //Real-life use: Payment systems, notification services, database operations, etc.
    //Interface reference se implementing class ka object refer kar sakte hain.
}
class UpiPayments implements Payments{
    public void pay(){
        System.out.println("Payement Using UPI");
    }
}
class LaunchNormalInterface{
    public static void main(String[] args) {
        System.out.println("Discussion about normal interface in java");
        Payments pay;
        pay=new UpiPayments();
        pay.pay();
    }
}