package com.jin.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.jin.db.iba.MySqlMapClient;
import com.jin.vo.MovieVO;

public class DvdDAO 
{
	SqlMapClient sqlMap;
	
	public DvdDAO() {
		sqlMap = MySqlMapClient.getSqlMapInstance();
	}
	
	public List<String> AllMovie() throws SQLException
	{
		return sqlMap.queryForList("dvd.AllMovie");
	}
}
