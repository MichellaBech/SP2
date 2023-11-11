package src;

abstract class AFuelCar extends ACar {
    private int kmPrLitre;
    public AFuelCar (int kmPrLitre, String registrationNumber, String brand, String model, int numberOfDoors)
    {
        super(registrationNumber, brand, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

abstract String getFuelType(); //should return "Gasolin" or "Dielsel"

    public int getKmPrLitre() //should return how many kilometres the car can drive on 1 litre of fuel
    {
        return kmPrLitre;
    }


    @Override
    public String toString()
    {
        return super.toString() + ". Km/L is " + kmPrLitre + ". Type of fuel: " + getFuelType();
    }
}
