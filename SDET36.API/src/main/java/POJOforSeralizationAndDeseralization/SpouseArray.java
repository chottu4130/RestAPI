package POJOforSeralizationAndDeseralization;

public class SpouseArray 
{
	String name;
	int age;
	int phone;
	
	
	public SpouseArray(String name, int age, int phone) 
	{
		
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public SpouseArray()
	{
		
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	

}
