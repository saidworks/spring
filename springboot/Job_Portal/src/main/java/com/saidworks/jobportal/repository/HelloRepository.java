package com.saidworks.jobportal.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Map<String,Object> findById(int id){
		String query = "SELECT * "
				+ " FROM user"
				+ " WHERE id=?;";
		
		Map<String, Object> user = jdbcTemplate.queryForMap(query,id);
		return user;		
				
	}

}

