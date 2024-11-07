package br.carselling.sell.service;


import java.util.List;

import br.carselling.sell.model.Car;

public interface CarService {

    Car findById(Long id);

    Car create(Car carToCreate);

    List<Car> findAll();
}
