package src;

public class Main {

    public static void main(String[] args) {

        // Instantier et FleetOfCars-objekt og et antal bil-objekter af de 3 konkrete typer. Tilføj bilerne til flåden. Skriv alle bilerne ud, og kald også getTotalRegistrationFeeForFleet() -metoden og skriv resultatet ud.

    FleetOfCars fleetOfCars = new FleetOfCars();

    GasolineCar audi = new GasolineCar(22, "AR76343", "Audi", "A3", 5);
    DieselCar reanult = new DieselCar(34, true, "UE45289", "Reanult", "Clio IV",5);
    ElectricCar tesla = new ElectricCar(170, 65, 325, "AU79342", "Tesla", "X", 3);

    fleetOfCars.addCar(audi);
    fleetOfCars.addCar(reanult);
    fleetOfCars.addCar(tesla);

        System.out.println(reanult.getRegistrationFee());
        System.out.println(audi.getRegistrationFee());
        System.out.println(tesla.getRegistrationFee());
        System.out.println("Total registration fee is: " + fleetOfCars.getTotalRegistrationFeeForFleet());
        System.out.println(audi.getModel());
        fleetOfCars.printAllCars();
        System.out.println(reanult.hasParticleFilter());
        System.out.println(tesla.getBatteryCapacityKWh());
    }
}
