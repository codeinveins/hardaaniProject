package com.sunaniya.hardaani.bean;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class User {

	String userId;
	String userName;
	String userEmail;
	String userAdress;
	List<LotteryList> loteryList;

	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
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
	public String getUserAdress() {
		return userAdress;
	}
	public void setUserAdress(String userAdress) {
		this.userAdress = userAdress;
	}
	public List<LotteryList> getLoteryList() {
		return loteryList;
	}
	public void setLoteryList(List<LotteryList> loteryList) {
		this.loteryList = loteryList;
	}
	
	
	
	
	
	
	
}
