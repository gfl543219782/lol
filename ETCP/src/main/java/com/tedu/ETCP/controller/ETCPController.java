package com.tedu.ETCP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.ETCP.pojo.Car;
import com.tedu.ETCP.service.ETCPService;

@Controller
public class ETCPController {

	@Autowired
	private ETCPService eTCPService;
	
	@RequestMapping("doIndex")
	public String doIndex() {
		return "index";
	}
	
	@RequestMapping("findAllCar")
	@ResponseBody
	public List<Car> findAllCar() {
		List<Car> list = eTCPService.findAllCar();
		return list;
	}
	
	@RequestMapping("addCar")
	@ResponseBody
	public String addCar(Car car) {
		try {
			eTCPService.addCar(car);
			return "添加成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "添加失败";
		}
	}
}
