package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCountCars(List<Car> listCars, Integer count);
}
