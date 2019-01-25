package com.Junit.JunitAssignment;


import java.util.*;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;

import org.junit.Test;
import org.mockito.Mockito;

import com.Junit.JunitAssignment.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
//    
//    @Test
//    public void testReadFromFile1()
//    {
//    	Read r=new Read();
//    	Map<Integer,Student> mymap=new HashMap<Integer,Student>();
//    	try
//    	{
//    	mymap=r.readFromFile1();
//    	}
//    	catch(Exception e)
//    	{
//    		
//    	}
//    }
//    
//    @Test (expected = Exception.class)
//    public void testReadFromFile1Exception()
//    {
//    	Read r = new Read();
//    	Map<Integer,Student> mymap=new HashMap<Integer,Student>();
//
//    	try
//    	{
//        	mymap=r.readFromFile1();
//    	}
//    	catch(Exception e)
//    	{
//    		e.printStackTrace();
//    	}
//    }
//    
//    @Test
//    public void testReadFromFile2()
//    {
//    	HashMap<Integer,Student> mymap=new HashMap<Integer,Student>();
//    	Read r=new Read();
//    	
//    	TreeSet<Student> tset=new TreeSet<Student>();
//    	try
//    	{
//    	tset=r.readFromFile2(mymap);
//    	}
//    	catch(Exception e)
//    	{
//    		
//    	}
//    	
//    }
//    
////    @Test (expected = Exception.class)
////    public void testReadFromFile2Exception()
////    {
////    	HashMap<Integer,Student> mymap=new HashMap<Integer,Student>();
////    	Read r=new Read();
////    	
////    	TreeSet<Student> tset=new TreeSet<Student>();
////    	try
////    	{
////    		tset=r.readFromFile2(mymap);
////    	}
////    	catch(Exception e)
////    	{
////    		e.printStackTrace();
////    	}
////    }
//    
//    	@Test
//    	public void testToStringArray()
//    	{
//    		TreeSet<Student> ts=new TreeSet<Student>();
//    		Write w=new Write();
//    		List<String[]> records = new ArrayList<String[]>();
//    		records=w.toStringArray(ts);
//    		
//    	}
//    	
//    	@Test
//    	public void testWriteFromFile()
//    	{
//    		Write w=new Write();
//    		TreeSet<Student> ts=new TreeSet<Student>();
//    		try
//    		{
//    			w.writeToFile(ts);
//    		}
//    		catch(IOException e)
//    		{
//    			
//    		}
//    		
//    	}
//    
    	@Test
    	public void TestApp()
    	{
    		App a=new App();
    		String s=a.readAndWrite("StudentPersonal.csv", "StudentMarks.csv", "out.csv");
    		
			TreeSet<Student> studentSet =new TreeSet<Student>();	
			
     		List<String[]> studentList = a.toStringArray(studentSet);


    	}
    	 @Test (expected = FileNotFoundException.class)
    	 public void TestAppFNFException()
    	 {
    		 App a=new App();
     		String s=a.readAndWrite("StudeasdasdntPersonal.csv", "StudentMsadsarks.csv", "osdut.csv");
			
     		
    		
    	 }
    	 @Test
    		public void testToStringArray()
    		{
    			Student s = new Student();
    			s.setStudentCode(101);
    			s.setStudentName("Akash");
    			s.setStudentDob(LocalDate.parse("1996-02-15"));
    			s.setMathsMarks(90);
    			s.setChemistryMarks(83);
    			s.setPhysicsMarks(78);
    			s.setMarksTotal(251);
    			
    			TreeSet<Student> studentSet = new TreeSet<Student>();
    			studentSet.add(s);
    			
    			App a1 = new App();
    			App a2 = Mockito.spy(a1);
    			
    			Mockito.when(a2.toStringArray(studentSet)).thenReturn(a1.toStringArray(studentSet));
    			List<String[]> stringList = a2.toStringArray(studentSet);
    			
    			assertEquals(4, stringList.get(1).length);
    			assertEquals("studentCode", stringList.get(0)[0]);
    		}
    	 
    	 @Test (expected = NumberFormatException.class)
    	 public void TestAppNFException()
    	 {
    		 App a=new App();
     		String s=a.readAndWrite("StudentPersonal.csv", "StudentMarks.csv", "out.csv");
    				 
    	 }
    	 
    
}
