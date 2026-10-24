// ============================================================
// STEP 1: INTERFACE (Contract / Rule)
// ============================================================
// Interface ek "contract" hai: jo bhi class ise implement karegi,
// use sendNotification() method dena hi padega.
// Interface ke andar method by default "public abstract" hota hai,
// matlab sirf declaration hai, body (definition) nahi.
interface NotificationSender {
    String sendNotification();   // sirf naam + return type, koi body nahi
}

// ============================================================
// STEP 2: IMPLEMENTATIONS (Alag-alag tareeke se kaam)
// ============================================================
// "implements" ka matlab: ye class NotificationSender ka contract follow karti hai.
class WhatsAppNotification implements NotificationSender {

    // Interface ke method ko yahan apni body di (Method Overriding).
    // "public" likhna zaroori hai, kyunki interface ka method public hota hai
    // aur overriding mein access kam nahi kar sakte.
    public String sendNotification() {
        return "WhatsApp Notification Sent";   // WhatsApp wala behaviour
    }
}

class SmsNotification implements NotificationSender {

    // CALL 14: service2 ke registerUser se yahan aayega (SMS wala version)
    public String sendNotification() {
        return "SMS Notification Sent";        // CALL 15: string wapas registerUser ko jati hai
    }
}

class EmailNotification implements NotificationSender {

    // CALL 7: service1 ke registerUser se yahan aayega (Email wala version)
    public String sendNotification() {
        return "Email Notification Sent";      // CALL 8: string wapas registerUser ko jati hai
    }
}

// ============================================================
// STEP 3: DEPENDENT CLASS (Jo dusri class pe depend karti hai)
// ============================================================
// UserService ko notification bhejni hai, lekin ye nahi jaanti ki
// Email hoga, SMS hoga ya WhatsApp. Ye sirf interface ko jaanti hai.
class UserService {

    // Field ka type INTERFACE hai (class nahi). Isliye ye koi bhi
    // NotificationSender object pakad sakta hai.
    // "private" = bahar se access nahi, "final" = ek baar set hone ke baad badlega nahi.
    private final NotificationSender sender;

    // CONSTRUCTOR INJECTION:
    // CALL 3 (aur CALL 10): main se "new UserService(...)" likhte hi
    // ye constructor turant chalta hai.
    // Sender bahar se (main se) aata hai, UserService khud "new" nahi karti.
    // Isi ko Dependency Injection kehte hain.
    public UserService(NotificationSender sender) {
        // this.sender  = is object ka apna field
        // sender       = constructor ka parameter (bahar se aaya hua)
        // Parameter ki value ko field mein save kar liya.
        //   service1 ke liye -> sender = EmailNotification object
        //   service2 ke liye -> sender = SmsNotification object
        this.sender = sender;
        // constructor khatam -> object ka address main ko wapas mila
    }

    // CALL 4 (aur CALL 11): main se service1.registerUser(...) / service2.registerUser(...)
    // Ye method user register karta hai aur notification bhejta hai.
    public void registerUser(String name) {

        // CALL 5 (aur CALL 12): pehli print
        System.out.println("User registered: " + name);

        // CALL 6 (aur CALL 13): interface ke through call hota hai.
        // sender ke andar jo object hai, uska sendNotification() chalega.
        // Kaun sa version chalega? Ye RUNTIME pe decide hota hai
        // (Runtime Polymorphism). UserService ko iski parwah nahi.
        //   service1 -> EmailNotification.sendNotification()  (CALL 7)
        //   service2 -> SmsNotification.sendNotification()    (CALL 14)
        String result = sender.sendNotification();

        // CALL 9 (aur CALL 16): returned string yahan print hoti hai
        System.out.println(result);

        // method khatam -> control wapas main ko
    }
}

// ============================================================
// STEP 4: MAIN CLASS (Wiring: sab cheezein yahan jodte hain)
// ============================================================
public class LaunchLooseCoupling {

    // CALL 0: JVM sabse pehle yahin se program shuru karta hai.
    public static void main(String[] args) {

        // ---------------- PEHLA USER (Email) ----------------

        // CALL 1: EmailNotification ka object bana (heap mein, default constructor chala).
        // Left side type interface hai, right side object class ka hai
        // (Upcasting / Polymorphism).
        NotificationSender email = new EmailNotification();

        // CALL 2: UserService ka object bana, phir CALL 3 pe constructor chala
        // aur email wala sender INJECT ho gaya.
        UserService service1 = new UserService(email);

        // CALL 4: control main se registerUser mein gaya.
        // Andar: CALL 5 (print) -> CALL 6 (sender.sendNotification)
        //        -> CALL 7 (Email version) -> CALL 8 (return) -> CALL 9 (print)
        // Output:
        //   User registered: Durgesh
        //   Email Notification Sent
        service1.registerUser("Durgesh");

        // ---------------- DUSRA USER (SMS) ----------------

        // CALL 9.5: is baar SMS wala object banaya.
        NotificationSender sms = new SmsNotification();

        // CALL 10: dusra UserService object, ismein SMS sender inject hua.
        // UserService ka ek bhi line code nahi badla, sirf object badla.
        UserService service2 = new UserService(sms);

        // CALL 11: control phir registerUser mein gaya.
        // Andar: CALL 12 (print) -> CALL 13 (sender.sendNotification)
        //        -> CALL 14 (SMS version) -> CALL 15 (return) -> CALL 16 (print)
        // Output:
        //   User registered: Amit
        //   SMS Notification Sent
        service2.registerUser("Amit");

        // main khatam -> program end
    }
}