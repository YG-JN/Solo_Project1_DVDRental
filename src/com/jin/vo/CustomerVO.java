package com.jin.vo;

public class CustomerVO 
{
	private String CustomerEmail;
	private String CustomerName;
	private String CustomerPass;
	private String CustomerAddr;
	private String CustomerTel;
	private String CustomerService;
	
	public CustomerVO() {
		// TODO Auto-generated constructor stub
	}

	public CustomerVO(String customerEmail, String customerName, String customerPass, String customerAddr,
			String customerTel, String customerService) {
		super();
		CustomerEmail = customerEmail;
		CustomerName = customerName;
		CustomerPass = customerPass;
		CustomerAddr = customerAddr;
		CustomerTel = customerTel;
		CustomerService = customerService;
	}

	public String getCustomerEmail() {
		return CustomerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerPass() {
		return CustomerPass;
	}

	public void setCustomerPass(String customerPass) {
		CustomerPass = customerPass;
	}

	public String getCustomerAddr() {
		return CustomerAddr;
	}

	public void setCustomerAddr(String customerAddr) {
		CustomerAddr = customerAddr;
	}

	public String getCustomerTel() {
		return CustomerTel;
	}

	public void setCustomerTel(String customerTel) {
		CustomerTel = customerTel;
	}

	public String getCustomerService() {
		return CustomerService;
	}

	public void setCustomerService(String customerService) {
		CustomerService = customerService;
	}
	
	

}
