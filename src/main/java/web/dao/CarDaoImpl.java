package web.dao;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl {
    public static List<Car> carsCount(List<Car> list, int number) {
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
