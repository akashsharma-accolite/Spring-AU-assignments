package com.Junit.JunitAssignment;

import java.util.*;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.time.LocalDate;

public class App 
{
//    public static void main( String[] args )
//    {
//    	Read r=new Read();
//    	//System.out.println("Hello");
//    	
//    	HashMap<Integer,Student> map1=new HashMap<Integer,Student>();
//    	TreeSet<Student> ts1=new TreeSet<Student>();
//    	try
//    	{
//    		map1=(HashMap<Integer, Student>) r.readFromFile1();
//    		ts1=r.readFromFile2(map1);
//    		
//    		for(Student t: ts1)
//    		{
//    			System.out.println(t);
//    		}
//    		//System.out.println(ts1.size());
//    		
//    		Write w = new Write();
//    		w.writeToFile(ts1);
//    	}
//    	catch(Exception e)
//    	{
//    		e.printStackTrace();
//    	}
    	
    	
//    }
		
	    public String readAndWrite(String fileName1, String fileName2, String fileName3)
		{
	    	CSVReader reader1;
	    	CSVReader reader2;
	    	CSVWriter writer1;
	    	try
	    	{
				reader1 = new CSVReader(new FileReader(fileName1), ',');
				reader2 = new CSVReader(new FileReader(fileName2), ',');
				writer1 = new CSVWriter(new FileWriter(new File(fileName3)));
			
				Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
				
				String[] record = null;

				while ((record = reader1.readNext()) != null) 
				{
					Student s = new Student();
					s.setStudentCode(Integer.parseInt(record[0]));
					s.setStudentName(record[1]);
					s.setStudentDob(LocalDate.parse(record[2]));
					studentMap.put(s.getStudentCode(), s);
				}
				
				TreeSet<Student> studentSet =new TreeSet<Student>();	
		
				while ((record = reader2.readNext()) != null) 
				{
					Student s = studentMap.get(Integer.parseInt(record[0]));
					s.setMathsMarks(Integer.parseInt(record[1]));
					s.setPhysicsMarks(Integer.parseInt(record[2]));
					s.setChemistryMarks(Integer.parseInt(record[3]));
					s.setMarksTotal(s.getChemistryMarks()+s.getMathsMarks()+s.getPhysicsMarks());
					studentSet.add(s);
				}
				
				List<String[]> studentList = toStringArray(studentSet);
		
				writer1.writeAll(studentList);
				
				reader1.close();
				reader2.close();
				writer1.close();
				
				return "SUCCESS!";
	    	}
			catch(IOException e)
			{
				return "IO Exception";
			}
	    	catch(NumberFormatException e)
	    	{
	    		return "Number Format Exception";
	    	}
		}

		public List<String[]> toStringArray(TreeSet<Student> studentSet) 
		{
			
			List<String[]> records = new ArrayList<String[]>();

			records.add(new String[] { "studentCode", "studentName", "studentDOB", "studentTotalMarks" });

			for(Student student : studentSet)
				records.add(new String[] { 
						Integer.toString(student.getStudentCode()), 
						student.getStudentName(), 
						student.getStudentDob().toString(), 
						Integer.toString(student.getMarksTotal()) 
						});
			return records;
		}
	
	
}
