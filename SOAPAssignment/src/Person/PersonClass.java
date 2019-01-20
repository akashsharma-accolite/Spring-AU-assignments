package Person;
import java.util.*;
public class PersonClass 
{
	public int id,age;
	public String name;
	
	public PersonClass(int id,int age,String name)
	{
		this.id=id;
		this.age=age;
		this.name=name;
	}
	
	public PersonClass()
	{
		
	}
	
	/*public String toString() 
	{ 
		return "ID "+this.id+" Age: "+this.age+" Name:"+this.name;
    } */
	
	
	@Override
	public String toString() 
	{
		return "id=" + id + ", age=" + age + ", name=" + name + "\n";
	}

	public int getId() 
	{
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}	
}
