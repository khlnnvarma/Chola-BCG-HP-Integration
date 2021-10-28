package com.java.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LoginDetails {
	
	private String UserId;
	private String Password;
	private String RequestFrom;
	
	public LoginDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginDetails(String userId, String password, String requestFrom) {
		super();
		UserId = userId;
		Password = password;
		RequestFrom = requestFrom;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getRequestFrom() {
		return RequestFrom;
	}

	public void setRequestFrom(String requestFrom) {
		RequestFrom = requestFrom;
	}
	
	

}
