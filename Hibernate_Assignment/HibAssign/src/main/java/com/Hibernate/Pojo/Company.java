package com.Hibernate.Pojo;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company 
{
	@Id
	@Column(name="compId")
	public Integer compId;

	@Column(name="compName")
	public String compName;

	
	@OneToMany(mappedBy="compId", fetch=FetchType.EAGER) 
	public List<Employee> employees;

	public Company()
	{
		
	}
	
	public Company(int compid,String compname)
	{
		this.compId=compid;
		this.compName=compname;
	}
	
	public Integer getCompId() {
		return compId;
	}

	public void setCompId(Integer compId) {
		this.compId = compId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}
	
	public List<Employee> getEmployees() 
	{
		return employees;
	}

	public void setCourses(List<Employee> employees) 
	{
		this.employees = employees;
	}
	
	
}
