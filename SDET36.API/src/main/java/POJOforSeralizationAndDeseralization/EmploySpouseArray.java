package POJOforSeralizationAndDeseralization;

public class EmploySpouseArray 
{
	String name;
	String eid;
	int[] ephone;
	String [] email;
	SpouseArray s;
	
	
	public EmploySpouseArray(String name, String eid, int[] ephone, String[] email, SpouseArray s) {
		super();
		this.name = name;
		this.eid = eid;
		this.ephone = ephone;
		this.email = email;
		this.s = s;
	}
	
	public EmploySpouseArray()
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

	public int[] getEphone() {
		return ephone;
	}

	public void setEphone(int[] ephone) {
		this.ephone = ephone;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}

	public SpouseArray getS() {
		return s;
	}

	public void setS(SpouseArray s) {
		this.s = s;
	}
	
	

}
