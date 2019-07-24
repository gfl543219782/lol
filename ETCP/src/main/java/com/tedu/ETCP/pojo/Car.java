package com.tedu.ETCP.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("Car")
public class Car {

	@TableId(type = IdType.AUTO)
	@TableField("Id")
	private Integer Id;
	@TableField("CarId")
	private String CarId;
	@TableField("CarName")
	private String CarName;
	@TableField("Phone")
	private String Phone;
	@TableField("Category")
	private Integer Category;
	@TableField("StopTime")
	private Date StopTime;
	@TableField("OutTime")
	private Date OutTime;
	@TableField("Money")
	private double Money;
	@TableField("Status")
	private Integer Status;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getCarId() {
		return CarId;
	}
	public void setCarId(String carId) {
		CarId = carId;
	}
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public Integer getCategory() {
		return Category;
	}
	public void setCategory(Integer category) {
		Category = category;
	}
	public Date getStopTime() {
		return StopTime;
	}
	public void setStopTime(Date stopTime) {
		StopTime = stopTime;
	}
	public Date getOutTime() {
		return OutTime;
	}
	public void setOutTime(Date outTime) {
		OutTime = outTime;
	}
	public double getMoney() {
		return Money;
	}
	public void setMoney(double money) {
		Money = money;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Car [Id=" + Id + ", CarId=" + CarId + ", CarName=" + CarName + ", Phone=" + Phone + ", Category=" + Category
				+ ", StopTime=" + StopTime + ", OutTime=" + OutTime + ", Money=" + Money + ", Status=" + Status + "]";
	}

}
