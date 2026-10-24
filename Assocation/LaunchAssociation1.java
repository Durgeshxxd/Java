
/*
 * ============================================================
 * TOPIC: TIGHT COUPLING, LOOSE COUPLING AND ASSOCIATION IN JAVA
 * ============================================================
 *
 * 1. TIGHT COUPLING:
 *    When one class directly depends on the specific
 *    implementation of another class, it is called tight coupling.
 *
 * 2. LOOSE COUPLING:
 *    When one class depends on an abstraction (interface)
 *    instead of a specific implementation, it helps achieve
 *    loose coupling.
 *
 * 3. ASSOCIATION:
 *    Association represents a relationship between two
 *    independent objects or classes.
 *
 * IMPORTANT:
 * Association alone does not guarantee loose coupling.
 * Inheritance and composition are not always tightly coupled.
 * Coupling depends on how classes depend on each other.
 */


// ============================================================
// EXAMPLE 1: TIGHT COUPLING
// ============================================================

// This class represents a petrol engine.
class PetrolEngine {

    void start() {
        System.out.println("Petrol engine started");
    }
}


// Car directly creates an object of PetrolEngine.
// Therefore, Car depends on a specific implementation.
class TightCouplingCar {

    // Tight coupling: direct dependency on PetrolEngine.
    private PetrolEngine engine = new PetrolEngine();

    void startCar() {
        engine.start();
        System.out.println("Car is running");
    }
}


// ============================================================
// EXAMPLE 2: LOOSE COUPLING
// ============================================================

// Interface provides an abstraction.
// Car does not need to know how a particular engine works.
interface Engine {

    void start();
}


// PetrolEngine implements the Engine interface.
class PetrolEngineImpl implements Engine {

    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}


// ElectricEngine also implements the Engine interface.
class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine started");
    }
}


// Car depends on the Engine interface, not a specific engine.
// The engine object is provided from outside using
// constructor dependency injection.
class LooseCouplingCar {

    private final Engine engine;

    LooseCouplingCar(Engine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.start();
        System.out.println("Car is running");
    }
}


// ============================================================
// EXAMPLE 3: ASSOCIATION
// ============================================================

// Teacher and Student are independent classes.
// A Teacher can teach a Student without owning that Student.
class Teacher {

    private String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach(Student student) {
        System.out.println(name + " is teaching " + student.getName());
    }
}


class Student {

    private String name;

    Student(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}


// ============================================================
// MAIN CLASS
// ============================================================

public class LaunchAssociation1 {

    public static void main(String[] args) {

        // Original statement provided in the question.
        System.out.println("This is for Association in Java");


        // ----------------------------------------------------
        // 1. TESTING TIGHT COUPLING
        // ----------------------------------------------------

        System.out.println("\n--- Tight Coupling ---");

        // Car creates and uses its own PetrolEngine.
        TightCouplingCar car1 = new TightCouplingCar();

        car1.startCar();


        // ----------------------------------------------------
        // 2. TESTING LOOSE COUPLING
        // ----------------------------------------------------

        System.out.println("\n--- Loose Coupling ---");

        // Inject PetrolEngine through the Engine interface.
        Engine petrol = new PetrolEngineImpl();

        LooseCouplingCar car2 = new LooseCouplingCar(petrol);

        car2.startCar();


        // We can replace the petrol engine with an electric
        // engine without modifying the LooseCouplingCar class.
        Engine electric = new ElectricEngine();

        LooseCouplingCar car3 = new LooseCouplingCar(electric);

        car3.startCar();


        // ----------------------------------------------------
        // 3. TESTING ASSOCIATION
        // ----------------------------------------------------

        System.out.println("\n--- Association ---");

        Teacher teacher = new Teacher("Rahul");
        Student student = new Student("Amit");

        // Teacher uses the Student object through a method.
        teacher.teach(student);
    }
}
