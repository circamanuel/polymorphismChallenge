public class Car {

    public String title;

    public Car(String title) {
        this.title = title;
    }

    public void startEngine() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println("Starting " + instanceType );

    }

    public static Car getCar(String type, String title) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'E' -> new ElectricCar(title);
            case 'H' -> new HybridCar(title);
            case 'G' -> new GasPoweredCar(title);
            default ->  new Car(title);

        };
    }

    public void drive() {

    }

    protected void runEngine() {}


}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        avgKmPerCharge = 1000.0;
        batterySize = 400;
        super.startEngine();
        System.out.printf(" ..%s%n".repeat(3),
                "Engine starting silently.....",
                "The " + title + " can drive an average of " + avgKmPerCharge + " per charge.",
                "This Car has a Battery size of " + batterySize + ".");

    }

    public void drive() {
        super.drive();
        System.out.println("Smooth and silent drive at max speed!");
    }

    public void runEngine() {
        super.runEngine();
        System.out.println("Electric motor is running ... Battery level is stable.");
    }
}

class GasPoweredCar extends Car {


    private double avgKmPerLiter;
    private int Cylinder;


    public GasPoweredCar (String description) {
        super(description);

    }
    @Override
    public void startEngine() {
        avgKmPerLiter = 22.0;
        Cylinder = 8;
        super.startEngine();
        System.out.printf("...%s%n".repeat(3),
                "Igniting fuel... Vroom!",
                "This Car has  " + Cylinder + " Cylinders.",
                "The " + title + " can drive an average of " + avgKmPerLiter
                );
    }

    public void drive() {
        super.drive();
        System.out.println("Cruising on fuel at max speed. Feel the power!");
    }

    public void runEngine() {
        super.runEngine();
        System.out.println("Combustion engine is running... Fuel consumption in progress.");
    }

}

class HybridCar  extends Car{

    private double avgKmPerLiter;
    private int Cylinder;
    private int batterySize;

    public HybridCar (String description) {
        super(description);

    }
    @Override
    public void startEngine() {
        avgKmPerLiter = 2.0;
        Cylinder = 4;
        batterySize = 1;
        super.startEngine();
        System.out.printf("%s%n".repeat(3),
                "Starting in electric mode... Switching if needed.",
                "This Car has a Battery size of " + batterySize + " and " + Cylinder + " Cylinders.",
                "The " + title + " can drive an average of " + avgKmPerLiter);
    }
    @Override
    public void drive() {
        super.drive();
        System.out.println("Switching between electric mode and gas mode at max speeed!");
    }
    @Override
    public void runEngine() {
        super.runEngine();
        System.out.println("Hybrid engine is running... Automaticaly switching between electric mode and gas mode!");
    }
}

