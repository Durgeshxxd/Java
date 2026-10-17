interface bank {

    int INTEREST_RATE = 7; //this is the instance variable lekin ye galata hai jo bhi variable interface ke andar hote hai automatically public,static and final,public static final int INTEREST_RATE = 7;
}

class BankVariableAccess implements bank {

}

class InterfacePractice3 {

    public static void main(String[] args) {

        System.out.println("This is the practice question");
        // Note 1: Interface variable ko bina object banaye access kar sakte hain
        System.out.println(bank.INTEREST_RATE);
        // Note 2: Interface implement karne wali class ke naam se bhi access kar sakte hain
        System.out.println(BankVariableAccess.INTEREST_RATE);
        // Note 3: Object ke through bhi technically access possible hai,
        // lekin static variable ko aise access karna recommended nahi hai
        BankVariableAccess b1 = new BankVariableAccess();
        System.out.println(b1.INTEREST_RATE);
        // Note 4: Interface variable ki value reassign karne ki koshish
        // bank.INTEREST_RATE = 10; // Compile-time error because variable is final
    }
}
