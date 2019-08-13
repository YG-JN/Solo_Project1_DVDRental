package com.jin.vo;

public class CustomerVO 
{
	private String customerEmail;
	private String customerName;
	private String customerPass;
	private String customerAddr;
	private String customerTel;
	private String customerService;
	
	public CustomerVO() {
		// TODO Auto-generated constructor stub
	}

	
	
	public CustomerVO(String customerEmail, String customerName, String customerPass, String customerAddr,
			String customerTel, String customerService) {
		super();
		this.customerEmail = customerEmail;
		this.customerName = customerName;
		this.customerPass = customerPass;
		this.customerAddr = customerAddr;
		this.customerTel = customerTel;
		this.customerService = customerService;
	}



	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPass() {
		return customerPass;
	}

	public void setCustomerPass(String customerPass) {
		this.customerPass = customerPass;
	}

	public String getCustomerAddr() {
		return customerAddr;
	}

	public void setCustomerAddr(String customerAddr) {
		this.customerAddr = customerAddr;
	}

	public String getCustomerTel() {
		return customerTel;
	}

	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}

	public String getCustomerService() {
		return customerService;
	}

	public void setCustomerService(String customerService) {
		this.customerService = customerService;
	}



	@Override
	public String toString() {
		return "CustomerVO [customerEmail=" + customerEmail + ", customerName=" + customerName + ", customerPass="
				+ customerPass + ", customerAddr=" + customerAddr + ", customerTel=" + customerTel
				+ ", customerService=" + customerService + "]";
	}

    
}