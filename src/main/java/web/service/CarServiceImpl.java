package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        this.cars.add(new Car("Ford Focus", 2010, "USA"));
        this.cars.add(new Car("VW Polo", 2015, "Germany"));
        this.cars.add(new Car("Lada Vesta", 2022, "Russia"));
        this.cars.add(new Car("Kia K5", 2021, "South Korea"));
        this.cars.add(new Car("Geely Emgrand", 2008, "China"));
    }

    @Override
    public List<Car> listCars(int count) {
        if(count < 0 || count >= this.cars.size()) {
            count = this.cars.size();
        }
        return this.cars.stream().limit(count).toList();
    }
}
