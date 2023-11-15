package src;

public class DieselCar extends AFuelCar{
    private final boolean particleFilter;

    public DieselCar(int kmPrLitre, boolean particleFilter, String registrationNumber, String brand, String model, int numberOfDoors) {
        super(kmPrLitre, registrationNumber, brand, model, numberOfDoors);
        this.particleFilter = particleFilter;
    }

    @Override
    String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int sum = 0;
        if (!particleFilter)
        {
            sum += 1000;
        }
        if (getKmPrLitre() < 5)
        {
            return sum += 10470 + 15260;
        } else if (getKmPrLitre() >= 5 && getKmPrLitre() < 10)
        {
            return sum += 5500 + 2770;
        } else if (getKmPrLitre() >= 10 && getKmPrLitre() < 15)
        {
            return sum += 2340 + 1850;
        } else if (getKmPrLitre() >= 15 && getKmPrLitre() < 20)
        {
            return sum += 1050 + 1390;
        } else {
            return sum += 330 + 130;
        }
    }

    public boolean hasParticleFilter()
    {
       return particleFilter;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
