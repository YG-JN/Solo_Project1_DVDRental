package com.jin.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.jin.db.iba.MySqlMapClient;
import com.jin.vo.CustomerVO;
import com.jin.vo.MovieVO;

public class DvdDAO 
{
	SqlMapClient sqlMap;
	
	public DvdDAO() {
		sqlMap = MySqlMapClient.getSqlMapInstance();
	}
	
	public boolean insert(CustomerVO customer)
	{
		try {
			System.out.println("고객>>>"+ customer);
			sqlMap.insert("dvd.insert", customer);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public List<String> AllMovie() throws SQLException
	{
		return sqlMap.queryForList("dvd.AllMovie");
	}
}
