/**
 * 
 */
package final_practise;
import java.lang.String;
import java.util.Scanner;
import final_practise.Employee;
import final_practise.Customer;
import final_practise.Job;
import final_practise.Company;
import final_practise.ReadFile;
import final_practise.WriteFile;
import java.io.IOException;
/**
 * @author Dinkar Taneja
 *
 */
public class ManagingObjects {
	public static void main(String[] args) throws IOException {
		//create Person, Employee, Customer, Jobs, and Company
		Employee objE = new Employee();
		Customer objC = new Customer();
		Job objJ = new Job();
		Company objComp = new Company();
		int [] arrEmp = new int [2];
		int [] arrCust = new int [2];
		Job [] arrJob = new Job [10];
		int i = 0, j = 0, h = 0;
		int choice = 0, option = 0;
		Scanner input = new Scanner(System.in);
		//create the files into the project folder
		String file_emp = "Employees.txt"; //create file where the project is
		String file_cust = "Customers.txt";
		String file_job = "Jobs.txt";
		String file_comp = "Company.txt";
		do {
		System.out.println("Enter 1 to create objects (employees, customers, jobs, company)");
		System.out.println("Enter 2 to display objects (employees, customers, jobs, company)");
		System.out.println("Enter 0 to quit");
		choice = Integer.parseUnsignedInt(input.next());
		switch(choice) {
		case 1:{
		do {
		try{
		System.out.println("Enter 1 to create object employee and write to file");
		System.out.println("Enter 2 to create object customer and write to file");
		System.out.println("Enter 3 to create object job and write to file");
		System.out.println("Enter 4 to create object company and write to file");
		System.out.println("Enter 0 to quit");
		option = Integer.parseUnsignedInt(input.next());
		if(option<0 || option>4) {throw new Exception();}
		}
		catch(Exception e){
		System.out.println("Enter 1,2,3,4 or 0 to quit, else is "+e.getMessage());
		}
		switch(option) {
		case 1:{
		boolean check = true;
		Scanner inp = new Scanner(System.in);
		int id = 0;
		String fn, ln, gen;
		double sal = 0;
		do{
		try{
		System.out.print("Enter employee ID : \n");
		id = inp.nextInt();
		if(id<1) {throw new Exception();}
		else {objE.setEmpID(id);}
		check = false;
		}
		catch(Exception e){
		System.out.println("Enter employee ID (positive numerical value), else is "+e.getMessage());
		check = true;
		}
		}while(check);
		check = true;
		do{
		try{
		System.out.print("Enter First Name : \n");
		fn = inp.next();
		if(fn.length()<=1) {throw new Exception();}
		else {objE.setFName(fn);}
		check = false;
		}
		catch(Exception e){
		System.out.println("Enter first name (2 characters or more), else is "+e.getMessage());
		check = true;
		}
		}while(check);
		check = true;
		do{
		try{
		System.out.print("Enter Last Name : \n");
		ln = inp.next();
		if(ln.length()<=1) {throw new Exception();}
		else {objE.setLName(ln);}
		check = false;
		}
		catch(Exception e){
		System.out.println("Enter last name (2 characters or more), else is "+e.getMessage());
		check = true;
		}
		}while(check);
		check = true;
		do{
		try{
		System.out.print("Enter the gender (f or m) : \n");
		gen = inp.next();
		if(gen.length()!=1) {throw new Exception();}
		else {objE.setGender(gen);}
		//if(gen!="f\n" || gen!="F\n" || gen!="m\n" || gen!="M\n") {throw new Exception();}
		check = false;
		}
		catch(Exception e){
		System.out.println("Enter the gender (f or m) ");
		check = true;
		}
		}while(check);
		check = true;
		do{
		try{
		System.out.print("Enter salary : \n");
		sal = Double.parseDouble(inp.next());
		if(sal<1) {throw new Exception();}
		else {objE.setSalary(sal);}
		check = false;
		}
		catch(Exception e){
		System.out.println("Enter salary (positive numerical value), else is "+e.getMessage());
		check = true;
		}
		}while(check);
		//inp.close();
		String tempo;
		if(i < 2) {
		tempo=objE.getEmpID()+", "+objE.getFName()+", "+objE.getLName()+", "+objE.getGender()+", "+objE.getSalary();
		try {
		WriteFile data_c = new WriteFile( file_emp , true ); //append value if is true
		data_c.writeToFile(tempo);
		}
		catch(IOException e) {
		System.out.println(e.getMessage());
		}
		arrEmp[i] = objE.getEmpID();
		i++;
		}
		else {System.out.println("Limite (2) atteinte.");}
		//inp.close();
		} break;
		case 2:{
		int id = 0;
		String fn = "", ln = "", gen = "";
		double bal = 0;
		boolean check = true;
		Scanner inp = new Scanner(System.in);
		do{
		try{
		System.out.print("Enter customer ID : \n");
		id = inp.nextInt();
		if(id<1) {throw new Exception();}
		else {objC.setCustID(id);}
		check = false;
		}
		catch(Exception e){
		System.out.println("Enter customer ID (positive numerical value), else is "+e.getMessage());
		check = true;
		}
		}while(check);
		check = true;
		do{
		try{
		System.out.print("Enter First Name : \n");
		fn = inp.next();
		if(fn.length()<=1) {throw new Exception();}
		else {objC.setFName(fn);}
		check = false;
		}
		catch(Exception e){
		System.out.println("Enter your first name (2 characters or more), else is "+e.getMessage());
		check = true;
		}
		}while(check);
		check = true;
		do{
		try{
		System.out.print("Enter Last Name : \n");
		ln = inp.next();
		if(ln.length()<=1) {throw new Exception();}
		else {objC.setLName(ln);}
		check = false;
		}
		catch(Exception e){
		System.out.println("Enter your last name (2 characters or more), else is "+e.getMessage());
		check = true;
		}
		}while(check);
		check = true;
		do{
		try{
		System.out.print("Enter the gender (f or m) : \n");
		gen = inp.next();
		if(gen.length()!=1) {throw new Exception();}
		else {objC.setGender(gen);}
		check = false;
		}
		catch(Exception e){
		System.out.println("Enter the gender (f or m) ");
		check = true;
		}
		}while(check);
		check = true;
		do{
		try{
		System.out.print("Enter balance-payement : \n");
		bal = inp.nextDouble();
		if(bal<0) {throw new Exception();}
		else {objC.setBalancePay(bal);}
		check = false;
		}
		catch(Exception e){
		System.out.println("Enter balance-payement (positive numerical value), else is "+e.getMessage());
		check = true;
		}
		}while(check);
		// inp.close(); //make infinite loop
		String tempo;
		if(j < 2) {
		tempo=objC.getCustID()+", "+objC.getFName()+", "+objC.getLName()+", "+objC.getGender()+", "+objC.getBalancePay();
		try {
		WriteFile data_c = new WriteFile( file_cust , true ); //append value if is true
		data_c.writeToFile(tempo);
		}
		catch(IOException e) {
		System.out.println(e.getMessage());
		}
		arrCust[j] = objC.getCustID();
		j++;
		}
		else {System.out.println("Limit of 2 customers.");}
		} break;
		case 3:{
		int id = 0;
		boolean check = true;
		Scanner inp = new Scanner(System.in);
		double price=0;
		if(arrEmp[0] != 0 && arrCust[0] != 0) {
		do{
		try{
		System.out.print("Enter job ID : \n");
		id = inp.nextInt();
		if(id<1) {throw new Exception();}
		else {objJ.setJobID(id, arrEmp[i-1], arrCust[j-1]);}
		check = false;
		}
		catch(Exception e){
		System.out.println("Enter job ID (positive numerical value), else is "+e.getMessage());
		check = true;
		}
		}while(check);
		check = true;
		do{
		try{
		System.out.print("Enter job price : \n");
		price = inp.nextDouble();
		if(price<1) {throw new Exception();}
		else {objJ.setPrice(price);}
		check = false;
		}
		catch(Exception e){
		System.out.println("Enter job price (positive numerical value), else is "+e.getMessage());
		inp.nextDouble();
		check = true;
		}
		}while(check);
		String tempo;
		if(h < 10) {
		tempo=objJ.getJobID()+", "+objJ.getEmpID()+", "+objJ.getCustID()+", "+objJ.getPrice();
		try {
		WriteFile data_c = new WriteFile( file_job , true ); //append value if is true
		data_c.writeToFile(tempo);
		}
		catch(IOException e) {
		System.out.println(e.getMessage());
		}
		arrJob[h] = objJ;
		h++;
		}
		else {System.out.println("Limit of 10 jobs.");}
		}
		else {System.out.println("Create first an employee and/or a customer");}
		} break;
		case 4:{
		boolean check = true;
		Scanner inp = new Scanner(System.in);
		String name, adr;
		do{
		try{
		System.out.print("Enter company name : \n");
		name = inp.nextLine();
		if(name.length()<=2) {throw new Exception();}
		else { objComp.setName(name, arrEmp, arrCust, arrJob);}
		check = false;
		}
		catch(Exception e){
		System.out.println("Enter company name (3 characters or more), else is "+e.getMessage());
		check = true;
		}
		}while(check);
		check = true;
		do{
		try{
		System.out.print("Enter company address : \n");
		adr = inp.nextLine();
		if(adr.length()<=2) {throw new Exception();}
		else {objComp.setAdr(adr);}
		check = false;
		}
		catch(Exception e){
		System.out.println("Enter company address (3 characters or more), else is "+e.getMessage());
		check = true;
		}
		}while(check);
		String tempo=objComp.getName()+", "+objComp.getAdr();
		try {
		WriteFile data_c = new WriteFile( file_comp , false ); //append value if is true
		data_c.writeToFile(tempo);
		}
		catch(IOException e) {
		System.out.println(e.getMessage());
		}
		} break;
		case 0:{
		System.out.println("You decide to quit.");} break;
		default : { }
		}//end switch
		}while(option != 0);
		} break;
		case 2:{
		do {
		System.out.println("Enter 1 to display objects employee (read file)");
		System.out.println("Enter 2 to display objects customer (read file)");
		System.out.println("Enter 3 to display objects job (read file)");
		System.out.println("Enter 4 to display objects company (read file)");
		System.out.println("Enter 0 to quit");
		option = input.nextInt();
		switch(option) {
		case 1:{
		String titre = "Employees";
		System.out.println(titre);
		try {
		ReadFile file = new ReadFile(file_emp);
		String[] arrLines = file.OpenFile();
		int m;
		for(m=0; m < arrLines.length; m++) {
		System.out.println(arrLines[m]);
		}
		}
		catch(IOException e)
		{
		System.out.println(e.getMessage());
		}
		} break;
		case 2:{
		String titre = "Customers";
		System.out.println(titre);
		try {
		ReadFile file = new ReadFile(file_cust);
		String[] arrLines = file.OpenFile();
		int m;
		for(m=0; m < arrLines.length; m++) {
		System.out.println(arrLines[m]);
		}
		}
		catch(IOException e)
		{
		System.out.println(e.getMessage());
		}
		} break;
		case 3:{
		String titre = "Jobs";
		System.out.println(titre);
		try {
		ReadFile file = new ReadFile(file_job);
		String[] arrLines = file.OpenFile();
		int m;
		for(m=0; m < arrLines.length; m++) {
		System.out.println(arrLines[m]);
		}
		}
		catch(IOException e)
		{
		System.out.println(e.getMessage());
		}
		} break;
		case 4:{
		String titre = "Company";
		System.out.println(titre);
		try {
		ReadFile file = new ReadFile(file_comp);
		String[] arrLines = file.OpenFile();
		int m;
		for(m=0; m < arrLines.length; m++) {
		System.out.println(arrLines[m]);
		}
		}
		catch(IOException e)
		{
		System.out.println(e.getMessage());
		}
		} break;
		case 0:{
		System.out.println("You decide to quit.");} break;
		default : { // System.out.println("Enter 1, 2, 3 or 4 to display objects or 0 to quit.");
		}
		}//end switch
		}while(option != 0);
		} break;
		case 0:{System.out.println("You decide to quit.");} break;
		default : {
		System.out.println("Enter 1 to enter objects, 2 display objects or 0 to quit.");
		}
		}//end switch
		}while(choice != 0);
		input.close();
		}
}//end main()

