public class Car {

    public String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println("Starting " + instanceType + description);
    }

    public static Car getCar(String description, String type) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'E' -> new Electric(type);
            case 'H' -> new Hybrid(type);
            case 'G' -> new Gas(type);

        };
    }

    public void drive() {

    }

    protected void runEngine() {}


}

