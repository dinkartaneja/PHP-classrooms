/**
 * 
 */
package final_practise;

/**
 * @author Dinkar Taneja
 *
 */
public class Company {
	private String name, address;
	private int [] arrEmp;
	private int [] arrCust;
	private Job [] arrJob;
	void setName(String n, int [] arrE, int [] arrC, Job [] arrJ) {
	name = n;
	arrEmp = arrE;
	arrCust = arrC;
	arrJob = arrJ;
	}
	String getName() {
	return name;
	}
	int [] getArrEmp() {
	return arrEmp;
	}
	int [] getArrCust() {
	return arrCust;
	}
	Job [] getArrJob() {
	return arrJob;
	}
	void setAdr(String adr) {
	address = adr;
	}
	String getAdr() {
	return address;
	}
	void printCompData() {
	System.out.println("Company name : "+name+"; address : "+address);
	}
	}
