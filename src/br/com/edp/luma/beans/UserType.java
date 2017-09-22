package br.com.edp.luma.beans;

public class UserType {
	private int userTypeId;
	private String userType;
	
	public UserType(int userTypeId, String userType) {
		super();
		this.userTypeId = userTypeId;
		this.userType = userType;
	}
	public UserType() {
		super();
	}
	
	public int getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
}
