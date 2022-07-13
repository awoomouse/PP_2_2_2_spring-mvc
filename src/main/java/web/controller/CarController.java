package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    List<Car> listCars;

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model,
                           @RequestParam(value = "count", required = false) Integer count) {
        listCars = new ArrayList<>();
        listCars.add(new Car("BMW", "Auto", 12345));
        listCars.add(new Car("Toyota", "Manual", 22145));
        listCars.add(new Car("Audi", "Auto", 55412));
        listCars.add(new Car("Tesla", "Auto", 221133));
        listCars.add(new Car("Lada", "Manual", 55412));
        CarService carService = new CarServiceImpl();
        if (count != null && count > 0) {
            listCars = carService.getCountCars(listCars, count);
            model.addAttribute("listCars", listCars);
        }
        if (count != null && count >= 5) {
            model.addAttribute("listCars", listCars);
            return "cars";
        }
        model.addAttribute("listCars", listCars);
        return "cars";
    }

}
