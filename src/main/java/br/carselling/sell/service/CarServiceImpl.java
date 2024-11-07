package br.carselling.sell.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import br.carselling.sell.controller.CarRepository;
import br.carselling.sell.model.Car;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car findById(Long id) {
        return carRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Car create(Car carToCreate) {
        return carRepository.save(carToCreate);
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }
}
