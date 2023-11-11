package src;

import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();


    public void addCar (Car car)
    {
    fleet.add(car);
    }

    public void printAllCars()
    {
        for(Car car : fleet)
        {
            System.out.println(car.toString());
        }
    }

    public int getTotalRegistrationFeeForFleet()
    {
        int sum = 0;
        for (int i = 0; i < fleet.size(); i++)
        {
            sum += fleet.get(i).getRegistrationFee();
        }
        return sum;
    }

    @Override
    public String toString()
    {
        String name = "";
        for (int i = 0; i < fleet.size(); i++)
        {
            name = (fleet.get(i).getMake());
        }
        return name;
    }
}
