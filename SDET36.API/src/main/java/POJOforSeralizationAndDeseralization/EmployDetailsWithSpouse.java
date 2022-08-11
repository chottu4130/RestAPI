package POJOforSeralizationAndDeseralization;

public class EmployDetailsWithSpouse 
{
	String name;
	String eid;
	String email;
	int phone;
	Spouse s;
	
	
	public EmployDetailsWithSpouse(String name, String eid, String email, int phone, Spouse s) 
	{
		super();
		this.name = name;
		this.eid = eid;
		this.email = email;
		this.phone = phone;
		this.s = s;
	}
	
	public EmployDetailsWithSpouse()
	{
		
	}
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEid() {
		return eid;
	}


	public void setEid(String eid) {
		this.eid = eid;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public Spouse getS() {
		return s;
	}


	public void setS(Spouse s) {
		this.s = s;
	}
	
	
	
	
	
	
	

}
