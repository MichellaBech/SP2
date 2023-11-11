package src;

public class ElectricCar extends ACar{

   final int batteryCapacity;
   final int maxRange;
   final int whPrKm;

    public ElectricCar(int whPrKm, int batteryCapacity, int maxRange, String registrationNumber, String brand, String model, int numberOfDoors) {
        super(registrationNumber, brand, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.whPrKm = whPrKm;
    }


    // returns the battery capacity in kilowatt hours
    public int getBatteryCapacityKWh()
    {
        return batteryCapacity;
    }
    // returns the maximum range in kilometres.
    public int getMaxRangeKm()
    {
        return maxRange;
    }

   // returns the power consumption in watt hours per driven kilometre.
   public int getWhPrKm()
   {
       return whPrKm;
   }
    @Override
    public int getRegistrationFee() {
        //Det gøres ved at dividere Wh/km med 91,25 og dernæst dividere 100 med dette tal
        //Jeg kan ikke få formlen til at gå op, så beregninger bliver korrekte.
        int  sum = (int)(getWhPrKm() /91.25)/100;
        if (sum < 5)
        {
            return 10470;
        } else if (sum >= 5 && sum < 10)
        {
            return 5500;
        } else if (sum >= 10 && sum < 15)
        {
            return 2340;
        } else if (sum >= 15 && sum < 20)
        {
            return 1050;
        } else {
            return 330;
        }
    }
    @Override
    public String toString()
    {
        return super.toString() + ". Battery Capacity: " + batteryCapacity + ". Max range: " + maxRange
                + ". Wh/km: " + whPrKm;

    }
}
