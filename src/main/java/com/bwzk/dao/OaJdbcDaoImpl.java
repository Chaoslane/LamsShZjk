package com.bwzk.dao;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;
@Component("oaJdbcDao")
public class OaJdbcDaoImpl {
	public void excute(String sql) throws RuntimeException{
		jdbcTemplate_oa.execute(sql);	
	}
	
	public void update(String sql) throws RuntimeException{
		jdbcTemplate_oa.update(sql);
	}
	
	public void insert(String sql) throws RuntimeException{
		jdbcTemplate_oa.update(sql);
	}
	
	public Map<String, Object> queryForMap(String sql) {
		try {
			return jdbcTemplate_oa.queryForMap(sql);
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}
	
	public String query4String(String sql) {
		try {
			return jdbcTemplate_oa.queryForObject(sql, String.class);
		} catch (Exception e) {
			log.error(e.getMessage());
			return "";
		}
	}
	
	public Map<String, String> quert2Colum4Map(String sql , String col1 , String col2) {
		Map<String, String> resultMap = null;
		try {
			List<Map<String, Object>> resultListMap = jdbcTemplate_oa.queryForList(sql);
			if(resultListMap != null && resultListMap.size() > 0){
				resultMap = new HashMap<String, String>();
				for (Map<String, Object> map : resultListMap) {
					if(map.get(col1) != null && map.get(col2) != null){
						resultMap.put(map.get(col1).toString() , map.get(col2).toString());
					}else{
						continue;
					}
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
		return resultMap;
	}
	
	public List<Map<String, Object>> quertListMap(String sql) {
		try {
			return jdbcTemplate_oa.queryForList(sql);
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}
	
	public Connection getConn(){
		try {
			return jdbcTemplate_oa.getDataSource().getConnection();
		} catch (Exception e) {
			log.error("得到数据库连接错误" , e);
			return null;
		}
	}
	
	@Autowired
	private JdbcTemplate jdbcTemplate_oa;
	private Logger log =  (Logger) LoggerFactory.getLogger(this.getClass());
}
