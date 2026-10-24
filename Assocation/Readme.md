Inhertiance and Composition is the example of the tightcloupling if any error occur in otherclass than it will be
impacted.

1. Tight Coupling kya hoti hai?
   Jab ek class doosri class ki specific implementation par directly dependent hoti hai, toh use tight coupling kehte
   hain.

Simple example: Car class khud PetrolEngine ka object banati hai. Ab agar engine change karna hai, toh Car class mein
bhi changes karne pad sakte hain.

2. Complete Java example

class PetrolEngine {

    void start() {
        System.out.println("Petrol engine started");
    }

}

class Car {

    // Tight coupling:
    // Car directly PetrolEngine par dependent hai.
    private PetrolEngine engine = new PetrolEngine();
    void startCar() {
        engine.start();
        System.out.println("Car is running");
    }

}

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }

}

3. Code ko line by line samjho
   Step 1: Engine class banayi.
   class PetrolEngine {
   void start() {
   System.out.println("Petrol engine started");
   }
   }

  Ye class engine start karne ka kaam karti hai.

Step 2: Car class mein engine ka object banaya.
private PetrolEngine engine = new PetrolEngine();

Yahan Car khud PetrolEngine ka object create kar rahi hai. Isliye Car directly PetrolEngine par dependent hai.

Step 3: Engine ka method call kiya.
void startCar() {
engine.start();
}

Car ka startCar() method engine ke start() method ko call karta hai.

4. Tight coupling se problem kya hai?
   Maan lo ab company ko petrol engine ki jagah electric engine use karna hai.
   class ElectricEngine {

   void start() {
   System.out.println("Electric engine started");
   }
   }

Ab existing Car class mein ye line:
private PetrolEngine engine = new PetrolEngine();

change karke ye karna padega:
private ElectricEngine engine = new ElectricEngine();

Iska matlab engine implementation change karne ke liye Car class ka code bhi modify karna pad raha hai.

Important: Har tight coupling mein error aana zaroori nahi hai. Problem ye hai ki classes ke beech dependency strong
hoti hai, jis se changes aur maintenance difficult ho sakte hain.

5. Interview notes

- Definition: Tight coupling occurs when one class strongly depends on the specific implementation of another class.
- Example: Car directly creates a PetrolEngine object.
- Problem: Implementation change karne par dependent class mein modifications ki zaroorat pad sakti hai.
- Remember: new PetrolEngine() ko directly dependent class ke andar create karna tight coupling ka common example hai.
  Practice question
  Agar code mein ye line ho:
  private Database database = new Database();