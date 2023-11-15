package src;

abstract class ACar implements Car {

    private final String registrationNumber;
    private final String brand;
    private final String model;
    private final int numberOfDoors;

    public ACar(String registrationNumber, String brand, String model, int numberOfDoors){
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }
    public String getRegistrationNumber() //The number on the number plate
    {
        return registrationNumber;
    }

    public String getMake() //The make of the car e.g. Audi
    {
        return brand;
    }

    public String getModel() // The model of the car e.g. A6
    {
        return model;
    }

    public int getNumberOfDoors() // The number of doors
    {
        return numberOfDoors;
    }

    @Override
    public String toString()
    {
        return "This car is a " + brand + ", " + model + ". It has " + numberOfDoors +
            " doors. The numberplate is: " + registrationNumber;

    }

}
