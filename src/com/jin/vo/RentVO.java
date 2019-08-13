package com.jin.vo;

import java.util.Date;

public class RentVO 
{

	private int RentNum;
	private String CustomerEmail;
	private int MovieNum;
	private Date RentDate;
	private Date ReturnDate;
	private int RentPlaceNum;
	
	public RentVO() {
		// TODO Auto-generated constructor stub
	}
	
	public RentVO(int rentNum, String customerEmail, int movieNum, Date rentDate, Date returnDate,
			int rentPlaceNum) {
		super();
		RentNum = rentNum;
		CustomerEmail = customerEmail;
		MovieNum = movieNum;
		RentDate = rentDate;
		ReturnDate = returnDate;
		RentPlaceNum = rentPlaceNum;
		
		
	}

	public int getRentNum() {
		return RentNum;
	}

	public void setRentNum(int rentNum) {
		RentNum = rentNum;
	}

	public String getCustomerEmail() {
		return CustomerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}

	public int getMovieNum() {
		return MovieNum;
	}

	public void setMovieNum(int movieNum) {
		MovieNum = movieNum;
	}

	public Date getRentDate() {
		return RentDate;
	}

	public void setRentDate(Date rentDate) {
		RentDate = rentDate;
	}

	public Date getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(Date returnDate) {
		ReturnDate = returnDate;
	}

	public int getRentPlaceNum() {
		return RentPlaceNum;
	}

	public void setRentPlaceNum(int rentPlaceNum) {
		RentPlaceNum = rentPlaceNum;
	}
	
	
	
}
