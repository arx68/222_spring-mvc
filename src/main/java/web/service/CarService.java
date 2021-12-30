package web.service;

import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarService {
    public static List<Car> carsCount(List<Car> list, int number) {
        return CarDaoImpl.carsCount(list, number);
    }
}
