class ATM{
    private String pin;
    private double balance;

    public ATM(String pin,double balance){
        this.pin=pin;
        this.balance=balance;
    }
    public void getbalance(String enteredPin) {
        if (!this.pin.equals(enteredPin)) {
            System.out.println("Pin is wrong unable to fetch balance");
        } else {
            System.out.println("Balance for your account is" + this.balance);
        }
    }
     public void getwithdrawamount(double amount){
         if (!(amount > this.balance)) {
             System.out.println("Withdraw amount success");
         } else {
             System.out.println("The amount cannot be withdraw due to the balance is less than the amount");
         }

     }
     public void setPin(String oldPin, String newPin){
        if(!this.pin.equals(oldPin)){
            System.out.println("Old pin is not code");
            return;

        }
        if(newPin==null || newPin.length()!=4){
            System.out.println("PIN must be atleast 4 digits");
            return;
        }
        this.pin=newPin;
         System.out.println("The value of new pin will be"+this.pin);
         System.out.println("PIN changed successfully");
     }

}
  class Main{
    public static void main(String[] args) {
      ATM obj3=new ATM("1234",10000);
//      obj3.getbalance("1234");
//      obj3.getwithdrawamount(20000);
//      obj3.setPin("1234","7235");
        obj3.setPin("1234", "7235");   // PIN change
        obj3.getbalance("1234");       // purana PIN: reject hona chahiye
        obj3.getbalance("7235");       // naya PIN: chalna chahiye

    }
}