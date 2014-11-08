package com.tcxy.hupple.persist.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.tcxy.hupple.persist.dao.ActivityDao;
import com.tcxy.hupple.persist.domain.Activity;

@Service
public class ActivityDaoImpl implements ActivityDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Activity> findAll() {
		
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "njfb","njfb");
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(SQL_FIND_ALL);
			List<Activity> activities = new ArrayList<Activity>();
			while(rs.next()){
				String title = rs.getString("title");
				String content = rs.getString("content");
				System.err.println(title+" "+content);
				activities.add(new Activity(title, content));
			}
			rs.close();
			statement.close();
			conn.close();
			return  activities;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;*/
		
		return jdbcTemplate.query(SQL_FIND_ALL, new MyRowMapper());
	}	
	
	
	private class MyRowMapper implements RowMapper<Activity>{
		public Activity mapRow(ResultSet rs, int rowNum) throws SQLException {
			String title = rs.getString("title");
			String content = rs.getString("content");
			return new Activity(title, content);
		}
	}
}
