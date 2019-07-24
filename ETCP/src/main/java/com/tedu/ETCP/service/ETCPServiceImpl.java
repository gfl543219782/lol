package com.tedu.ETCP.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.ETCP.mapper.ETCPMapper;
import com.tedu.ETCP.pojo.Car;
import com.tedu.ETCP.service.ETCPService;

@Service
public class ETCPServiceImpl implements ETCPService {
	
	@Autowired
	private ETCPMapper eTCPMapper;

	@Override
	public List<Car> findAllCar() {
		List<Car> list = eTCPMapper.findAllCar();
		return list;
	}

	@Override
	public void addCar(Car car) {
		car.setStopTime(new Date());
		car.setStatus(1);
		eTCPMapper.insert(car);
	}

}
