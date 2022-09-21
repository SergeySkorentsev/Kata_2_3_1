package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;


@Controller
public class CarController {

    private final CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false) String count) {
        if(count != null) {
            model.addAttribute("cars", carService.listCars(Integer.parseInt(count)));
        } else {
            model.addAttribute("cars", carService.listCars(-1));
        }
        return "cars";
    }
}
