/**
 * 
 */
package final_practise;

/**
 * @author Dinkar Taneja
 *
 */
public class Job {
	private int jobID, empID, custID;
	private double price;
	void setJobID(int jID, int eID, int cID) {
	jobID = jID;
	empID = eID;
	custID = cID;
	}
	int getJobID() {
	return jobID;
	}
	int getEmpID() {
	return empID;
	}
	int getCustID() {
	return custID;
	}
	void setPrice(double pr) {
	price = pr;
	}
	double getPrice() {
	return price;
	}
	void printJobData() {
	System.out.println("Job ID : "+jobID+"; price : "+price+";n Employee ID : "+empID+";n Customer ID : "+custID);
	}
	}

