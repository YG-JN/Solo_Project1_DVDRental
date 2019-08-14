package com.jin.dao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.text.DefaultEditorKit.CutAction;

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
	
	public boolean login(CustomerVO vo)
	{
		Integer cnt;
		try {
			
			cnt = (Integer)sqlMap.queryForObject("dvd.login", vo );
			
			if(cnt==1)return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public String selectName(String customerEmail) throws SQLException
	{
		return (String) sqlMap.queryForObject("dvd.selectName", customerEmail);
	}
	
	public List<MovieVO> AllMovieInfo() throws SQLException
	{
		return sqlMap.queryForList("dvd.AllMovieInfo");
	}
	
	public List<String> AllMovieTitle() throws SQLException
	{
		return sqlMap.queryForList("dvd.AllMovieTitle");
	}
}
