
public class Computer {

	String company;
	HardDisk hdd;//ref
	
	
	public Computer(String company, HardDisk hdd) {
		super();
		this.company = company;
		this.hdd = hdd;
	}


	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public HardDisk getHdd() {
		return hdd;
	}


	public void setHdd(HardDisk hdd) {
		this.hdd = hdd;
	}


	@Override
	public String toString() {
		return "Computer [company=" + company + ", hdd=" + hdd + "]";
	}


	public void printData() {
		System.out.println( "company= " + company );
		System.out.println( "hdd="+hdd);
	}

}
