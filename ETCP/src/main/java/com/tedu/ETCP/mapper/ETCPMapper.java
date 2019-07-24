package com.tedu.ETCP.mapper;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tedu.ETCP.pojo.Car;

public interface ETCPMapper extends BaseMapper<Car> {

	List<Car> findAllCar();
}
