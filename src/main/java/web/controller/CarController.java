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

    CarService carService = new CarServiceImpl();
    List<Car> listCars = CarServiceImpl.getListCars();

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model,
                           @RequestParam(value = "count", required = false) Integer count) {
        if (count != null && 0 < count && count < 5) {
            listCars = carService.getCountCars(listCars, count);
            model.addAttribute("listCars", listCars);
            return "cars";
        }
        if (count != null && count >= 5) {
            listCars = CarServiceImpl.getListCars();
            model.addAttribute("listCars", listCars);
            return "cars";
        }
        listCars = CarServiceImpl.getListCars();
        model.addAttribute("listCars", listCars);
        return "cars";
    }

}
