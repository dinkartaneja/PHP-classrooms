package final_Ques1;

public class Student extends Person{
	private int stdID;
	private double balancePay;
	void setCustID(int id) {
	stdID = id;
	}
	int getCustID() {
	return custID;
	}
	void setBalancePay(double balance) {
	balancePay = balance;
	}
	double getBalancePay() {
	return balancePay;
	}
	void printCustData() {
	System.out.println("First name : "+super.getFName()+"; last name : "+super.getLName()+"; gender : "+super.getGender());
	System.out.println("Customer ID : "+custID+"; Balance : "+balancePay);
	}
	
}
