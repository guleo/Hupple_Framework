package com.tcxy.hupple.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.tcxy.hupple.persist.domain.Activity;
import com.tcxy.hupple.service.ActivityService;

@Controller
@Namespace("/")
@ParentPackage("json-default")
public class ActivityAction extends ActionSupport {

	
	/**
	 *  ²âÊÔµÄACTION
	 */
	private static final long serialVersionUID = -5023484660929540773L;
	
	@Autowired
	private ActivityService activityService;
	
	private List<Activity> activities;

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}


	@Action(value="getActivites",results={@Result(name="success",type="json")})
	public String execute() throws Exception {
		
		this.activities = activityService.findAll();
		
		return SUCCESS;
	}

}
