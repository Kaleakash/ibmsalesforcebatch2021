package com;

public class Customer {
private int custId;
private String custName;
private int age;


public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public Customer(int custId, String custName, int age) {
	super();
	this.custId = custId;
	this.custName = custName;
	this.age = age;
}

@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + ", age=" + age + "]";
}

public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
