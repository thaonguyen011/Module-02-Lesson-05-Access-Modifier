package Access_Modifier;

public class Car {
    private String name;
    private String engine;
    static int numberOfCars;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

}
