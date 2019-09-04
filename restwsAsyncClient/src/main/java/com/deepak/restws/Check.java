package com.deepak.restws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Check {
private String checkNo;
private int accNum;
private Double amount;


public Check(String checkNo, int accNum, Double amount) {
	super();
	this.checkNo = checkNo;
	this.accNum = accNum;
	this.amount = amount;
}
public Check() {
	// TODO Auto-generated constructor stub
}
public String getCheckNo() {
	return checkNo;
}
public void setCheckNo(String checkNo) {
	this.checkNo = checkNo;
}
public int getAccNum() {
	return accNum;
}
public void setAccNum(int accNum) {
	this.accNum = accNum;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}

}
