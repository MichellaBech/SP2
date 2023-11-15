package src;

public class ElectricCar extends ACar{

   private final int batteryCapacity;
   private final int maxRangeKm;
   private final int whPrKm;

    public ElectricCar(int whPrKm, int batteryCapacity, int maxRangeKm, String registrationNumber, String brand, String model, int numberOfDoors) {
        super(registrationNumber, brand, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRangeKm = maxRangeKm;
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
        return maxRangeKm;
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
        int  kmL = (int)(getWhPrKm() /91.25)*1000;
        int sum = 0;
        if (kmL < 5)
        {
            sum += 10470;
            return sum;
        } else if (kmL >= 5 && kmL < 10)
        {
            sum += 5500;
            return sum;
        } else if (kmL >= 10 && kmL < 15)
        {
            sum += 2340;
            return sum;
        } else if (kmL >= 15 && kmL < 20)
        {
            sum += 1050;
            return sum;
        } else {
            sum += 330;
            return sum;
        }
    }
    @Override
    public String toString()
    {
        return super.toString() + ". Battery Capacity: " + batteryCapacity + ". Max range: " + maxRangeKm
                + ". Wh/km: " + whPrKm;

    }
}
