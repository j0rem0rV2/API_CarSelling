package br.carselling.sell.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.carselling.sell.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    // Métodos personalizados podem ser adicionados aqui, se necessário
}
