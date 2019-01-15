package AssignmentPackage;

public class AssignmentClass 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee(1,"a",21,10000);
		e1.setSalary(100000);
		e1.printDetails();
		System.out.println("Salary is "+e1.salary);
		System.out.println(e1.emp_count);
		Employee e2=new Employee(2,"b",22,200000);
		Employee e3=new Employee(3,"c",23,300000);
		Manager m1=new Manager(4,"d",24,400000,500000,"Fedex");
		m1.printDetails();
		System.out.println(m1.emp_count);
		Developer d1=new Developer(5,"e",25,2500000,100000,"Morgan Stanley","Health insurance");
		d1.setPerks("House Rent Allowance");
		d1.printDetails();
	}
}


class Employee {

	int emp_no;
	String name;
	int age;
	int salary;
	static int emp_count;
	
	static
	{
		emp_count=0;
	}
	
	Employee(int e,String name,int a,int sal)
	{
		this.emp_no=e;
		this.name=name;
		this.age=a;
		this.salary=sal;
		emp_count++;
	}
	
	public int getEmpno()
	{
		return emp_no;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setEmpNo(int eno)
	{
		this.emp_no=eno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setSalary(int sal)
	{
		this.salary=sal;
	}
	void printDetails()
	{
		System.out.println("Employee details are: ");
		System.out.println("Employee number: "+emp_no+",Employee name: "+name+",Employee age: "+age+" ");
	}
	
	void displayCount()
	{
		System.out.println("The number of employees in the company are "+emp_count);
	}
	
}


class Manager extends Employee
{
	int bonus;
	String projectname;
	Manager(int e,String name,int a,int sal,int bon,String pname)
	{
	super(e,name,a,sal);
	this.bonus=bon;
	this.projectname=pname;
	}
	
	public void setProjectName(String mypname)
	{
		this.projectname=mypname;
	}
	
	public void setBonus(int myBonus)
	{
		this.bonus=myBonus;
	}
	
	public void setBonus(float myBonus)
	{
		this.bonus=(int)myBonus;
	}
	
	public String getProjectName()
	{
		return this.projectname;
	}
	
	public int getBonus()
	{
		return this.bonus;
	}
	
	public void increment()
	{
		this.salary=this.salary+bonus;
	}
	
	@Override
	void printDetails()
	{
		System.out.println("Manager details are: ");
		System.out.println("Employee number: "+emp_no+",Employee name: "+name+",Employee age: "+age+",Manager project:  "+projectname);
	}
	
}

interface developerInterface
{
	void setPerks(String perk);
	String getPerks();
}

class Developer extends Manager implements developerInterface
{
	String perks;
	
	public Developer(int e, String name, int a, int sal, int bon, String pname,String myperk) 
	{
		super(e, name, a, sal, bon, pname);
		this.perks=myperk;
	}
	
	public void setPerks(String myperk)
	{
		this.perks=myperk;
	}
	
	public String getPerks()
	{
		return this.perks;
	}
	
	@Override
	void printDetails()
	{
		System.out.println("Developer details are: ");
		System.out.println("Employee number: "+emp_no+",Employee name: "+name+",Employee age: "+age+",Developer project:  "+projectname+",Developer perks: "+perks);
	}
	
}

