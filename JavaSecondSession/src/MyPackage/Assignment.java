package MyPackage;
import java.util.*;
public class Assignment {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		
		int empCount=sc.nextInt();
		
		ArrayList<Employee> eList =new ArrayList<Employee>(); 
		
		for(int i=0;i<empCount;i++)
		{
			System.out.println("Enter name of employee");
			String inpName=sc.next();
			System.out.println("Enter ID of employee");
			int inpId=sc.nextInt();
			System.out.println("Enter age of employee");
			int inpAge=sc.nextInt();
			System.out.println("---------------------");
			
			eList.add(new Employee(inpName,inpId,inpAge));
		} 
		
		ArrayList<Employee> eListById=new ArrayList<Employee>(eList);
		ArrayList<Employee> eListByAge=new ArrayList<Employee>(eList);
		
		eListByAge.sort(new Comparator<Employee>()
		{
			@Override
			public int compare(Employee e1,Employee e2)
			{
				if(e1.age>e2.age)
				{
					return 1;
				}
				else if(e1.age==e2.age)
				{
					return 0;
				}
				else
					return -1;
			}
		});
		
		eListById.sort(new Comparator<Employee>()
		{
			@Override
			public int compare(Employee e1,Employee e2)
			{
				if(e1.id>e2.id)
				{
					return 1;
				}
				else if(e1.id==e2.id)
				{
					return 0;
				}
				else
					return -1;
			}
		});
		
		
		System.out.println("Sorted Employee List by age");
		System.out.println(eListByAge);
		System.out.println("Sorted Employee List By ID");
		System.out.println(eListById);
		
		
		Company c1=new Company(101,"Accolite","Bangalore");
		Company c2=new Company(102,"Cisco","Bangalore");
		Company c3=new Company(103,"Google","Hyderabad");
		
		ArrayList<Company> clist = new ArrayList<>();
		clist.add(c1);clist.add(c2);clist.add(c3);
		
		System.out.println("Showing companies in the same city:");
		
		System.out.println("Enter the name of a city");
		String mycity=sc.next();
		boolean cityfound=false;
		
		System.out.println();
		for(Company c : clist)
		{
			if(c.getAddress().equalsIgnoreCase(mycity))
			{
				System.out.println("ID "+c.getCompanyId()+" Name "+c.getName()+" City "+c.getAddress());
				cityfound=true;
			}
		}
		
		if(!cityfound)
		{
			System.out.println("City not Found! Please try again!");
		}
		
		
		System.out.println("Enter company ID to list employees below 30");
		
		int companyId=sc.nextInt();
		
		for(Company c : clist)
		{
			if(c.getCompanyId()==companyId) 
			{
				System.out.println("Employees Below 30:");
				c.showEmployeesBelow30();
			}
		}
		
	}

}


class Company
{
	
	Scanner sc=new Scanner(System.in);
	
	int companyId;
	String companyName,address;
	TreeSet<Employee> emplist=new TreeSet<Employee>();
	
	Company(int companyId,String companyName,String address)
	{
		this.companyId=companyId;
		this.companyName=companyName;
		this.address=address;
		System.out.println("Collecting " +companyName+" company employee details");
		System.out.println("Employee Count:");
		int count=sc.nextInt();
		for(int i=1;i<=count;i++)
		{
			System.out.println("Enter Employee "+ (i) +" details");
			System.out.println("Enter Employee ID");
			int id=sc.nextInt();
			System.out.println("Enter Employee name");
			String name=sc.next();
			System.out.println("Enter Employee age");
			int age=sc.nextInt();
			emplist.add(new Employee(name,id,age));
		}
		
		
	}
	
	public void showEmployeesBelow30() 
	{
		for(Employee e : this.emplist)
		{
			if(e.getAge()<30)
				System.out.println("ID:"+e.getId()+" Name:"+e.getName()+" Age"+e.getAge());
		}
	}
	
	
	public int getCompanyId()
	{
		return this.companyId;
	}
	
	public String getName()
	{
		return this.companyName;
	}
	
	public String getAddress()
	{
		return this.address;
	}
		
	
}

class Employee implements Comparable<Employee>
{
	String name;
	int id;
	int age;
	
	public Employee(String name,int id,int age)
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Employee that=(Employee)obj;
		return (this.name.equals(that.name));	
	}
	
	@Override
	public int hashCode()
	{
		return this.name.hashCode();
	}
	
	@Override
	public String toString()
	{
		return this.name+" "+this.id+" "+this.age;
	}
	
	@Override
	public int compareTo(Employee o)
	{
		if(o.age>this.age)
		{
			return 1;
		}
		else if(o.age==this.age)
		{
			return 0;
		}
		else
			return -1;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
}
