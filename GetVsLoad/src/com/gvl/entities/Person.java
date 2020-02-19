package com.gvl.entities;

import java.io.Serializable;

public class Person implements Serializable{
	protected String person_id;
	protected String person_name;
	protected int age;
	protected String gender;
	protected String email_address;
	protected String contact_no;
	public String getPerson_id() {
		return person_id;
	}
	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", person_name=" + person_name + ", age=" + age + ", gender=" + gender
				+ ", email_address=" + email_address + ", contact_no=" + contact_no + "]";
	}
	
	

}
