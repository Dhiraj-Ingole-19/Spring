import java.util.Arrays;

public class Student {
	
	String sname[];
	
	public Student(String[] sname) {
		super();
		this.sname = sname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String[] getSname() {
		return sname;
	}

	public void setSname(String[] sname) {
		this.sname = sname;
	}


	public void display() {
		
		System.out.println("student Names are:");
		for(int i=0;i<sname.length;i++ ) {
			System.out.println(""+sname[i]);
			
		}
		
		
		
	}
	@Override
	public String toString() {
		return "Student [sname=" + Arrays.toString(sname) + ", getSname()=" + Arrays.toString(getSname()) + "]";
	}

}
