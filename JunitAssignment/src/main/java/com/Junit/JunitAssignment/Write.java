package com.Junit.JunitAssignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import com.opencsv.CSVWriter;

public class Write {
	
	public void writeToFile(TreeSet<Student> studentSet) throws IOException
	{
		//using custom delimiter and quote character
		CSVWriter writer = new CSVWriter(new FileWriter(new File("out.csv")));

		List<String[]> studentList = toStringArray(studentSet);

		writer.writeAll(studentList);

		writer.close();
		
	}

	public static List<String[]> toStringArray(TreeSet<Student> studentSet) 
	{
		
		List<String[]> records = new ArrayList<String[]>();

		// adding header record
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