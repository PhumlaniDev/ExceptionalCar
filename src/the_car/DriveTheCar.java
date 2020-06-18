package the_car;

public class DriveTheCar {

    public static void main(String[] args) throws CarNotStartedException {

        Car theCar = new Car();

        System.out.println("Trying the to  drive the Car without fuel");
        theCar.start();
        System.out.println(theCar.drive());

        System.out.println("Put fuel in the Car");
        theCar.enterFuel();

        System.out.println("Trying the to  drive the Car without starting");
        theCar.stop();
        boolean result = theCar.drive();
        System.out.println(result);

        System.out.println("Trying the to  drive the Car with fuel");
        theCar.start();
        System.out.println(theCar.drive());
        System.out.println(theCar.drive());
        System.out.println(theCar.drive());
        System.out.println(theCar.drive());
        System.out.println("Drive until all the fuel is up...");
        System.out.println(theCar.drive());

        System.out.println("If we refuel");
        theCar.enterFuel();

        System.out.println("We can start and drive the car again...");
        theCar.start();
        System.out.println(theCar.drive());







    }


}
