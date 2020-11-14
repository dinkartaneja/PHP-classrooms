package final_Ques1;
import java.lang.String;
public abstract class Person {
	private String fname, lname, gender;
	void setFName(String fn) {
	fname = fn;
	}
	String getFName() {
	return fname;
	}
	void setLName(String ln) {
	lname = ln;
	}
	String getLName() { return lname;
	}
	void setGender(String gen) {
	gender = gen;
	}
	String getGender() {
	return gender;
	}
	void printData() {
	System.out.println("First name : "+fname+"; last name : "+lname+"; gender : "+gender);
	}
}
