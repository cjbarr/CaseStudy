package com.arrive.dao;

import java.util.List;

import com.arrive.entities.CheckIn;


public interface CheckInI {

	public int addCheckIn(CheckIn checkIn);
	public List<CheckIn> getAllCheckIns();
			
		


}