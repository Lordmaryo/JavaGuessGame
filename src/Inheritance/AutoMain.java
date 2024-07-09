package Inheritance;

public class AutoMain {
    public static void main(String[] args) {
        Okada okada = new Okada(
                "AV134G5", 8, 4, "Bajaj", false
        );

        Keke keke = new Keke("BVS82733", 3, 3, "BVS", true);

        Car car = new Car("BZ87787", 4, 5, 4,
                true, true, "Lexus", true);

        Truck truck = new Truck("H9283H9HF8", 8, 3,
                "Ford Truck", 2, false, true, true, false);

        okada.carryCargo(new Cargo("Sand", 50f));
        okada.haveRoof();
        okada.move();
        okada.stop();
        System.out.println();

        keke.carryCargo(new Cargo("Passenger", 250f));
        okada.haveRoof();
        keke.move();
        keke.reverse();
        keke.stop();
        System.out.println();

        car.carryCargo(new Cargo("Rice", 50f));
        car.haveRoof();
        car.move();
        car.haveAc();
        car.haveTrunk();
        car.reverse();
        car.stop();
        System.out.println();

        truck.carryCargo(new Cargo("Rams", 300f));
        truck.haveRoof();
        truck.move();
        truck.haveAc();
        truck.haveTrunk();
        truck.haveBucket();
        truck.reverse();
        truck.stop();
    }
}