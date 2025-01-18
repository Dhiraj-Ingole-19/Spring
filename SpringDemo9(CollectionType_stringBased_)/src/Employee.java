import java.util.*;

public class Employee {

	
	int eid;

	String ename;
	List<String>qualifiaction;
	Set<String>skillset;
	Map<String,String>idproof;
	public Employee(int eid, String ename, List<String> qualifiaction, Set<String> skillset,
			Map<String, String> idproof) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.qualifiaction = qualifiaction;
		this.skillset = skillset;
		this.idproof = idproof;
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
	public List<String> getQualifiaction() {
		return qualifiaction;
	}
	public void setQualifiaction(List<String> qualifiaction) {
		this.qualifiaction = qualifiaction;
	}
	public Set<String> getSkillset() {
		return skillset;
	}
	public void setSkillset(Set<String> skillset) {
		this.skillset = skillset;
	}
	public Map<String, String> getIdproof() {
		return idproof;
	}
	public void setIdproof(Map<String, String> idproof) {
		this.idproof = idproof;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", qualifiaction=" + qualifiaction + ", skillset="
				+ skillset + ", idproof=" + idproof + "]";
	}
	
	
}
