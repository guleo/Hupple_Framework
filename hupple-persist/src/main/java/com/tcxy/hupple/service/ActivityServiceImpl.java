package com.tcxy.hupple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcxy.hupple.persist.dao.ActivityDao;
import com.tcxy.hupple.persist.domain.Activity;

@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityDao activityDao;
	
	public List<Activity> findAll() {
		
		return activityDao.findAll();
	}
}
