package com.tcxy.hupple.dao;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcxy.hupple.persist.dao.ActivityDao;
import com.tcxy.hupple.persist.domain.Activity;

public class ActivityTest 
{
	
	private ActivityDao activityDao;
	
	@Before
	public void prepare(){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("persist.xml");
		
		activityDao = ctx.getBean(ActivityDao.class);
	}
	
	@Test
	public void testFindAll(){
		
		List<Activity> activities =  activityDao.findAll();
		
		System.out.println(activities.size());
		
		for (Activity activity : activities) {
			
			System.err.println(activity.getTitle()+" "+activity.getContent());
		}
		
	}
	
}
