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

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model,
                           @RequestParam(value = "count", required = false) Integer count) {

        model.addAttribute("listCars", CarServiceImpl.getAmountCars(count));

        return "cars";
    }

}
