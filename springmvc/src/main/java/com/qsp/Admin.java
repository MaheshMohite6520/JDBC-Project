package com.qsp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin 
{
	@Id
	private int id;
	private String name;
	private long phone;
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public long getPhone() 
	{
		return phone;
	}
	
	public void setPhone(long phone) 
	{
		this.phone = phone;
	}
	
	public Admin()
	{
		// TODO Auto-generated constructor stub
	}
}
