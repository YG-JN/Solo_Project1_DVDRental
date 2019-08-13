package com.jin.vo;

public class RentPlaceVO 
{
	private int RentPlaceNum;
	private String RentPlaceName;
	private String RentPlaceAddr;
	
	public RentPlaceVO() {
		// TODO Auto-generated constructor stub
	}

	public RentPlaceVO(int rentPlaceNum, String rentPlaceName, String rentPlaceAddr) {
		super();
		RentPlaceNum = rentPlaceNum;
		RentPlaceName = rentPlaceName;
		RentPlaceAddr = rentPlaceAddr;
	}

	public int getRentPlaceNum() {
		return RentPlaceNum;
	}

	public void setRentPlaceNum(int rentPlaceNum) {
		RentPlaceNum = rentPlaceNum;
	}

	public String getRentPlaceName() {
		return RentPlaceName;
	}

	public void setRentPlaceName(String rentPlaceName) {
		RentPlaceName = rentPlaceName;
	}

	public String getRentPlaceAddr() {
		return RentPlaceAddr;
	}

	public void setRentPlaceAddr(String rentPlaceAddr) {
		RentPlaceAddr = rentPlaceAddr;
	}
	
	
}
