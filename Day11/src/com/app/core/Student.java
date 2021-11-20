package com.app.core;

import java.util.Date;
import java.text.SimpleDateFormat;
import custom_exception.StudentHandlingException;


public class Student implements Comparable<Student>{
private String prn;
private String name;
private String email;
private String password;
private Course type;
private double gpa;
private Date dob;
public static SimpleDateFormat sdf;

static{
	sdf = new SimpleDateFormat("dd/MM/yyyy");
}

public Student(String prn) {
	super();
	this.prn = prn;
}
public Student(String prn, String name, String email, String password, Course type, double gpa, Date dob) {
	super();
	this.prn = prn;
	this.name = name;
	this.email = email;
	this.password = password;
	this.type = type;
	this.gpa = gpa;
	this.dob = dob;
}


public void setGPA(double gpa) {
	this.gpa = gpa;
}
@Override
public String toString() {
	return "Student [prn=" + prn + ", name=" + name + ", email=" + email + ", password=" + password + ", type=" + type
			+ ", gpa=" + gpa + ", dob=" + dob + "]";
}


@Override
public boolean equals (Object o) {
	System.out.println("in equals constr");
	if( o instanceof Student)
		return prn.equals(((Student)o).prn);
	return false;
}
public int compareTo(Student anotherStudent)
{
	System.out.println("in student’s compareTo");
	return this.prn.compareTo(anotherStudent.prn);
	
}




public String getPrn() {
	return prn;
}
public String getName() {
	return name;
}
public String getEmail() {
	return email;
}
public String getPassword() {
	return password;
}
public Course getType() {
	return type;
}
public double getGpa() {
	return gpa;
}
public Date getDob() {
	return dob;
}
public static SimpleDateFormat getSdf() {
	return sdf;
}








}
