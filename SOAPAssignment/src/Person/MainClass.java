package Person;
import java.util.*;

public class MainClass 
{
	static ArrayList<PersonClass> plist=new ArrayList<PersonClass>();
	
	public MainClass()
	{
		
	}
	
	public String createPerson(int id,int age,String name)
	{
		PersonClass p=new PersonClass(id,age,name);
		plist.add(p);
		return "Insertion Successful!";
	}
	
	
	public String updatePerson(int id,int age,String name)
	{
		if(plist.isEmpty())
		{
			return "List is empty";
		}
		else
		{
			Iterator<PersonClass> itr=plist.iterator();
			while(itr.hasNext())
			{
				PersonClass p=(PersonClass)itr.next();
				if(p.id==id)
				{
					p.setAge(age);
					p.setName(name);
					return "Updated Successfully!";
				}
			}
			return "Person not found!";
		}
	}
	
	public String deletePerson(int id)
	{
		if(plist.isEmpty())
		{
			return "List is not empty!";
		}
		else
		{
			Iterator<PersonClass> itr=plist.iterator();
			while(itr.hasNext())
			{
				PersonClass p=(PersonClass)itr.next();
				if(p.id==id)
				{
					plist.remove(p);
					return "Deletion Successful!";
				}
			}
			return "Person not found!";
		}
	}
	
	public String getAllPersons()
	{
		if(plist.isEmpty())
		{
			return "List is empty";
		}
		else
		{
			return plist.toString();
		}
	}

}
