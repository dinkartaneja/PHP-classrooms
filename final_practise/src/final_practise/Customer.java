package final_practise;

public class Customer extends Person{

	private int custID;
	private double balancePay;
	void setCustID(int id) {
	custID = id;
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
