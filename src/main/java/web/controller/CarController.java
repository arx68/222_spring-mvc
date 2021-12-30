package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String cars(@RequestParam(defaultValue = "5") int count, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Audi", "white", 10));
        list.add(new Car("Fiat", "grey", 20));
        list.add(new Car("Ford", "red", 30));
        list.add(new Car("Honda", "black", 40));
        list.add(new Car("Lada", "blue", 50));
        model.addAttribute("count", CarService.carsCount(list, count));
        return "cars";
    }
}
