package com.Junit.JunitAssignment;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.io.*;


public class Student implements Comparable<Student>
{

	private int studentCode;
	private String studentName;
	private LocalDate studentDob;
	private int mathsMarks;
	private int physicsMarks;
	private int chemistryMarks;
	private int marksTotal;
	
	
//	private Date date = new Date();  
//    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
//    private String dob= formatter.format(date); 
	
	public Student()
	{
		
	}
    
    public int getStudentCode() 
	{
		return studentCode;
	}
	
	public void setStudentCode(int studentCode) 
	{
		this.studentCode = studentCode;
	}
	
	public String getStudentName() 
	{
		return studentName;
	}
	
	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}
	
	public LocalDate getStudentDob() 
	{
		return studentDob;
	}
	
	public void setStudentDob(LocalDate dob) 
	{
		this.studentDob = dob;
	}
	
	public int getMathsMarks() 
	{
		return mathsMarks;
	}
	
	public void setMathsMarks(int mathsMarks) 
	{
		this.mathsMarks = mathsMarks;
	}
	
	public int getPhysicsMarks() 
	{
		return physicsMarks;
	}
	
	public void setPhysicsMarks(int physicsMarks) 
	{
		this.physicsMarks = physicsMarks;
	}
	
	public int getChemistryMarks() 
	{
		return chemistryMarks;
	}
	
	public void setChemistryMarks(int chemistryMarks) 
	{
		this.chemistryMarks = chemistryMarks;
	}
	
	public int getMarksTotal() 
	{
		return marksTotal;
	}
	
	public void setMarksTotal(int marksTotal) 
	{
		this.marksTotal = marksTotal;
	}

	
	public int compareTo(Student o) 
	{
		if(this.marksTotal == o.marksTotal)
		{
			return this.studentDob.compareTo(o.studentDob);
		}
		else
			return o.marksTotal-this.marksTotal;
	}

//	@Override
//	public String toString() {
//		return "Student [studentCode=" + studentCode + ", studentName=" + studentName + ", studentDob=" + studentDob
//				+ ", mathsMarks=" + mathsMarks + ", physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks
//				+ ", marksTotal=" + marksTotal + "]";
//	}
//	
	
		
}
