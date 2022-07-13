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

}
