package POJOforSeralizationAndDeseralization;

public class EmployDetailsWithArray
{
	String name;
	String eid;
	int [] phoneno;
	String [] emailid;
	String addr;
	
	//step 2 to create constructor to initialize value
	public EmployDetailsWithArray(String name, String eid, int[] phoneno, String[] emailid, String addr) {
		super();
		this.name = name;
		this.eid = eid;
		this.phoneno = phoneno;
		this.emailid = emailid;
		this.addr = addr;
	}
	
	public EmployDetailsWithArray()
	{
		
	}
	
	//use getter and setter to access

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

	public int[] getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int[] phoneno) {
		this.phoneno = phoneno;
	}

	public String[] getEmailid() {
		return emailid;
	}

	public void setEmailid(String[] emailid) {
		this.emailid = emailid;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
 
}
