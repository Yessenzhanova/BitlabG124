package stream;

import java.util.ArrayList;
import java.util.Optional;

public class CarCity {

    private ArrayList<Car2> cars = new ArrayList<>();

    public CarCity() {
    }

    public CarCity(ArrayList<Car2> cars) {
        this.cars = cars;
    }

    public ArrayList<Car2> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car2> cars) {
        this.cars = cars;
    }

    public void addCar(Car2 car) {
        cars.add(car);
    }

    Car2 firstGreatVolumeCar() {
        Optional<Car2> firstGreatVolumeCar = cars.stream().filter(s -> s.getEngineVolume() > 3.0).findFirst();
        return firstGreatVolumeCar.orElseThrow();
    }
}
