package final_Ques1;
import java.lang.String;
import java.util.Scanner;
import final_Ques1.Student;
import final_Ques1.Teacher;
import final_Ques1.Course;
import final_Ques1.Grade;
import final_Ques1.ReadFile;
import final_Ques1.WriteFile;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		
		Student objE = new Student();
		Teacher objC = new Teacher();
		Course objJ = new Course();
		Grade objComp = new Grade();
		int [] arrStd = new int [2];
		int [] arrTeac = new int [2];
		Course [] arrCour = new Course [10];
		int i = 0, j = 0, h = 0;
		int choice = 0, option = 0;
		Scanner input = new Scanner(System.in);
		//create the files into the project folder
		String file_emp = "Student.txt"; //create file where the project is
		String file_cust = "Teacher.txt";
		String file_job = "Course.txt";
		String file_comp = "Grade.txt";
		do {
		System.out.println("Enter 1 to create objects (Student, Teacher, Course, Grade)");
		System.out.println("Enter 2 to display objects (Student, Teacher, Course, Grade)");
		System.out.println("Enter 0 to quit");
		choice = Integer.parseUnsignedInt(input.next());
		switch(choice) {
		case 1:{
		do {
		try{
		System.out.println("Enter 1 to create object Student and write to file");
		System.out.println("Enter 2 to create object Teacher and write to file");
		System.out.println("Enter 3 to create object Course and write to file");
		System.out.println("Enter 4 to create object Grade and write to file");
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
		else {objE.setTeacID(id);}
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
		tempo=objE.getTeacID()+", "+objE.getFName()+", "+objE.getLName()+", "+objE.getGender()+", "+objE.getSalary();
		try {
		WriteFile data_c = new WriteFile( file_emp , true ); //append value if is true
		data_c.writeToFile(tempo);
		}
		catch(IOException e) {
		System.out.println(e.getMessage());
		}
		arrStd[i] = objE.getStdID();
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
		System.out.print("Enter Teacher ID : \n");
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
		arrTeac[j] = objC.getTeacID();
		j++;
		}
		else {System.out.println("Limit of 2 customers.");}
		} break;
		case 3:{
		int id = 0;
		boolean check = true;
		Scanner inp = new Scanner(System.in);
		double price=0;
		if(arrStd[0] != 0 && arrTeac[0] != 0) {
		do{
		try{
		System.out.print("Enter job ID : \n");
		id = inp.nextInt();
		if(id<1) {throw new Exception();}
		else {objJ.setJobID(id, arrStd[i-1], arrTeac[j-1]);}
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
		arrCour[h] = objJ;
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
		else { objComp.setName(name, arrStd, arrTeac, arrCour);}
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
		System.out.println("Enter 1 to display objects Student (read file)");
		System.out.println("Enter 2 to display objects Teacher (read file)");
		System.out.println("Enter 3 to display objects Course (read file)");
		System.out.println("Enter 4 to display objects Grade (read file)");
		System.out.println("Enter 0 to quit");
		option = input.nextInt();
		switch(option) {
		case 1:{
		String title = "Students";
		System.out.println(title);
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
		String title = "Teachers";
		System.out.println(title);
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
		String title = "Course";
		System.out.println(title);
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
		String title = "Grade";
		System.out.println(title);
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
		}//end main()
		
}
