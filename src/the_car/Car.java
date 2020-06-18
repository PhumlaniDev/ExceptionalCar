package the_car;

public class Car extends CarNotStartedException {

    private boolean started =  false;
    private int fuelLevel = 0;

    public Car(String errorMessage) {
        super(errorMessage);
    }

    public Car() {
        super("error");
    }

    public void start() {
        started = true;
    }

    public void stop() {
        started = false;
    }

    public void enterFuel() {
        fuelLevel += 20;
    }

    public boolean drive() throws CarNotStartedException {
        if (!started) {

                throw new CarNotStartedException("Driven without being started");

            }

            if (fuelLevel <= 0) {
                started = false;
                fuelLevel = 0;
                return false;
            }

            fuelLevel -= 5;
            return true;





    }

}
