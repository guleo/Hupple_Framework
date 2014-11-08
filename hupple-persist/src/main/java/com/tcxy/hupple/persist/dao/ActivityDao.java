package com.tcxy.hupple.persist.dao;

import java.util.List;

import com.tcxy.hupple.persist.domain.Activity;

public interface ActivityDao 
{
	String SQL_FIND_ALL = "SELECT * FROM acitivty";
	
	List<Activity> findAll();
}
