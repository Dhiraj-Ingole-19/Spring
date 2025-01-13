
public class Student {


	int sid;
	String sname;
	static int cnt=0;
	
	
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public static int getCnt() {
		return cnt;
	}


	public static void setCnt(int cnt) {
		Student.cnt = cnt;
	}


	public Student() {
		sid=++cnt;
	}


	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", getSid()=" + getSid() + ", getSname()=" + getSname()
				+ "]";
	}

	public void display() {

     System.out.println("StudentId:"+sid);
     System.out.println("Student Name:"+sname);
	}

}
