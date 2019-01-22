package com.Hibernate.HibAssign;
import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.Hibernate.Pojo.Employee;
import com.Hibernate.Pojo.Company;;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        //Transaction tx=(Transaction)session.beginTransaction();
        session.beginTransaction();
       
// Inserting Companies into the database        
        
//        Company c1=new Company(101,"Accolite");
//        Company c2=new Company(102,"Morgan Stanley");
//        session.save(c1);
//        session.save(c2);
        
// Inserting Employees into the database        
        
//        Employee emp=new Employee();
//        emp.setEmpAge(21);
//        emp.setEmpId(1);
//        emp.setEmpName("Akash");
//        emp.setCompId(101);
//        Integer id=(Integer)session.save(emp);
//        System.out.println(id);
//        
//        Employee emp1=new Employee(2,22,"Emp2",101);
//        Employee emp2=new Employee(3,23,"Emp3",101);
//        Employee emp3=new Employee(4,24,"Emp4",101);
//        Employee emp4=new Employee(5,25,"Emp5",102);
//        Employee emp5=new Employee(6,26,"Emp6",102);
//        Employee emp6=new Employee(7,27,"Emp7",102);
//        Employee emp7=new Employee(8,28,"Emp8",102);
//        
//        session.save(emp1);
//        session.save(emp2);
//        session.save(emp3);
//        session.save(emp4);
//        session.save(emp5);
//        session.save(emp6);
//        session.save(emp7);
        
        

        session.getTransaction().commit();
        
        ArrayList<Employee> employeeList=new ArrayList<Employee>();
        Criteria cr=session.createCriteria(Employee.class);
    
        //Getting Employee with ID: 1
        
        System.out.println("Displaying details of Employee with ID 1");
        cr.add(Restrictions.eq("empId",1));
        employeeList=(ArrayList<Employee>) cr.list();
        
        for(Employee employee: employeeList)
        {
        	System.out.println("ID: "+ employee.getEmpId()+" NAME: "+employee.getEmpName()+" AGE: "+ employee.getEmpAge()+" COMP ID: "+ employee.getCompId());
        }
        
        //System.out.println(employeeList.toString());
//        for(Employee employee: employeeList) 
//          {
//   		  System.out.println( employee.getEmpId()+"|" +employee.getEmpName()+"|"
//    		  +student.getEmpAge()+"|"+(!((ArrayList<Student>) student.getCourses()).isEmpty()?((ArrayList<Student>) student.getCourses()).get(0).getCourses():"") ); 
//          }
        System.out.println("Printing whole list!");
        Criteria cr1=session.createCriteria(Employee.class);
        employeeList=(ArrayList<Employee>) cr1.list();
        
        for(Employee employee: employeeList)
        {
        	System.out.println("ID: "+ employee.getEmpId()+" NAME: "+employee.getEmpName()+" AGE: "+ employee.getEmpAge()+" COMP ID: "+ employee.getCompId());
        }
        
        Criteria cr2 = session.createCriteria(Company.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        //cr2.add(Restrictions.eq("compId", 102));
      
        //Criteria cr = session.createCriteria(Company.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);	

        
        ArrayList<Company> companyList=new ArrayList<Company>();
        
        companyList = (ArrayList<Company>) cr2.list();
        
        System.out.println("Demonstrating Table join");
        
        int i=0;
        for(Company company: companyList) 
        {
  		  System.out.println("COMP ID: "+company.getCompId()+" COMP NAME: " +company.getCompName()+" EMP ID:"+ (!company.getEmployees().isEmpty()?company.getEmployees():" ") );
  		  i++;
  		}
        
        
    }
}
       