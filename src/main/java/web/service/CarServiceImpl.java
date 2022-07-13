package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCountCars(List<Car> listCars, Integer count) {
        return listCars.stream().limit(count).collect(Collectors.toList());
    }

    public static List<Car> getListCars() {
        List<Car> listCars = new ArrayList<>();
        listCars.add(new Car("BMW", "Auto", 12345));
        listCars.add(new Car("Toyota", "Manual", 22145));
        listCars.add(new Car("Audi", "Auto", 55412));
        listCars.add(new Car("Tesla", "Auto", 221133));
        listCars.add(new Car("Lada", "Manual", 55412));
        return listCars;
    }


}
