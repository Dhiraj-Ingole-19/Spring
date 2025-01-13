
public class Employee {

	int eid;
	String ename;
	int esal;
	PerAddress paddr;
	TempAddress taddr;
	OfficeAddress oaddr;
	
	public Employee(int eid, String ename, int esal, PerAddress paddr, TempAddress taddr, OfficeAddress oaddr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.paddr = paddr;
		this.taddr = taddr;
		this.oaddr = oaddr;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public PerAddress getPaddr() {
		return paddr;
	}

	public void setPaddr(PerAddress paddr) {
		this.paddr = paddr;
	}

	public TempAddress getTaddr() {
		return taddr;
	}

	public void setTaddr(TempAddress taddr) {
		this.taddr = taddr;
	}

	public OfficeAddress getOaddr() {
		return oaddr;
	}

	public void setOaddr(OfficeAddress oaddr) {
		this.oaddr = oaddr;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", paddr=" + paddr + ", taddr=" + taddr
				+ ", oaddr=" + oaddr + "]";
	}

}
	
	