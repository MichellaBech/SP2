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
        for (Car car : fleet) {
            sum += car.getRegistrationFee();
        }
        return sum;
    }

    @Override
    public String toString()
    {
        String name = "";
        for (Car car : fleet) {
            name = (car.getMake());
        }
        return name;
    }
}
