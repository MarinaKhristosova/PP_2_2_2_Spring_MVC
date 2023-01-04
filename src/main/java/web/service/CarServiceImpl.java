package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl extends CarService {

    public List<Car> getCarList(int count) {
        List<Car> cars = new ArrayList();
        cars.add(new Car("Volvo", "x90", 2020));
        cars.add(new Car("Toyota", "Corolla", 2018));
        cars.add(new Car("Toyota", "Camry", 2022));
        cars.add(new Car("Mercedes", "Gelendvagen", 2011));
        cars.add(new Car("Fiat", "Bravo", 2004));
        if (count >= 5 || count <= 0) {
            return cars;
        }

        return cars.stream().limit(count).toList();
    }
}
