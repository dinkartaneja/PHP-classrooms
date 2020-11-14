/**
 * 
 */
package final_practise;

/**
 * @author Dinkar Taneja
 *
 */
public class Employee extends Person{
	private int empID;
	private double salary, bonus;
	void setEmpID( int eID) {
	empID = eID;
	}
	int getEmpID() {
	return empID;
	}
	void setSalary(double sal) {
	salary = sal;
	}
	double getSalary() {
	return salary;
	}
	void calculateBonus(int jobNbr) {
	if(jobNbr >0 && jobNbr <7) {
	if(jobNbr <= 3) { bonus = jobNbr * 10; }
	if(jobNbr <= 6) {
	for(int i = 1; i < 4; i++) {bonus += 10 ; }
	for(int i = 4; i < jobNbr; i++) {bonus += 20 ; }
	}
	}
	}
	double getBonus() {
	return bonus;
	}
	void printEmpData() {
	System.out.println("First name : "+super.getFName()+"; last name : "+super.getLName()+"; gender : "+super.getGender());
	System.out.println("Employee ID : "+empID+"; Salary : "+salary+"; Bonus : "+bonus);
	}
}
