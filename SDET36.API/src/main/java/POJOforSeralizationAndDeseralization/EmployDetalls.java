package POJOforSeralizationAndDeseralization;

public class EmployDetalls 
{
	//step 1 Declare to global varable
	String name;
	String empid;
	int phone;
	String email;
	
	//step 2 to create constructor to initialize value
	public EmployDetalls(String name, String empid, int phone, String email) 
	{
		
		this.name = name;
		this.empid = empid;
		this.phone = phone;
		this.email = email;
	}
	public EmployDetalls()
	{
		
	}
	
	//use getter and setter to access

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getempid() 
	{
		return empid;
	}

	public void setEmpName(String empid) 
	{
		this.empid = empid;
	}

	public int getPhone() 
	{
		return phone;
	}

	public void setPhone(int phone)
	{
		this.phone = phone;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	
	

}
