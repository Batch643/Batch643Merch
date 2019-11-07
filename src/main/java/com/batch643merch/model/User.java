package com.batch643merch.model;

public class User {
	private int userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private Boolean userIsAdmin;
	private Address userAddress;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String userEmail, String userPassword, Boolean userIsAdmin,
			Address userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userIsAdmin = userIsAdmin;
		this.userAddress = userAddress;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Boolean getUserIsAdmin() {
		return userIsAdmin;
	}

	public void setUserIsAdmin(Boolean userIsAdmin) {
		this.userIsAdmin = userIsAdmin;
	}

	public Address getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", userIsAdmin=" + userIsAdmin + ", userAddress=" + userAddress + "]";
	}
	
	
	
}
