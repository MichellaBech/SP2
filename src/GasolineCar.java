package src;

public class GasolineCar extends AFuelCar{
   private String registrationNumber;
    public GasolineCar(int kmPrLitre, String registrationNumber, String brand, String model, int numberOfDoors) {
        super(kmPrLitre, registrationNumber, brand, model, numberOfDoors);

    }

    @Override
    String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        if (getKmPrLitre() < 5)
        {
            return 10470;
        } else if (getKmPrLitre() >= 5 && getKmPrLitre() < 10)
        {
            return 5500;
        } else if (getKmPrLitre() >= 10 && getKmPrLitre() < 15)
        {
            return 2340;
        } else if (getKmPrLitre() >= 15 && getKmPrLitre() < 20)
        {
            return 1050;
        } else {
            return 330;
        }
    }
}
