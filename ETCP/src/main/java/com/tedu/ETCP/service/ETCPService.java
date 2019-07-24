package com.tedu.ETCP.service;

import java.util.List;

import com.tedu.ETCP.pojo.Car;

public interface ETCPService {

	public List<Car> findAllCar();

	public void addCar(Car car);
}
