import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Stud")
public class Student {
int sid;
String sname;
@Autowired
 ArrayList<String>Qualification;
public Student(int sid, String sname, ArrayList<String> qualification) {
	super();
	this.sid = sid;
	this.sname = sname;
	Qualification = qualification;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getSid() {
	return sid;
}
@Value(value="101")
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
@Value(value="Dhiraj")
public void setSname(String sname) {
	this.sname = sname;
}
public ArrayList<String> getQualification() {
	return Qualification;
}
public void setQualification(ArrayList<String> qualification) {
	Qualification = qualification;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", Qualification=" + Qualification + "]";
}


}
