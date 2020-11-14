package ques2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//dinkartaneja 1911380
import ques2.SavingAccount;
import ques2.CheckingAccount;
import ques2.Deposit;
import ques2.Withdrawal;
import ques2.Transfer;
import ques2.Inquery;
public class Main {
	static List<SavingAccount> list1=new ArrayList<SavingAccount>();
	public static void Menu()
	{   
		Scanner input=new Scanner(System.in);
	    boolean flag=false;// do {try{}catch(Exception e) {input.nextLine();flag=true;}}while(flag);
	    do {try{
	    	System.out.println("##############WELCOME#############\n"
					+ "Press 1: To Create Account\n"
					+ "Press 2: To Deposit\n"
					+ "Press 3: to Withdraw\n"
					+ "Press 4: To Inquire\n");
	    	int choice=input.nextInt();
	    	switch(choice) 
	    	{
	    	case 1:
	    		createAccount();
	    		break;
	    	case 2:
	    		Deposit();
	    		break;
	    	case 3:
	    		Withdraw();
	    		break;
	    	case 4:
	    		Inquire();
	    		break;
	    	case 5:
	    		break;
	    	default:
	    		break;
	    	}
	    }catch(Exception e) {input.nextLine();flag=true;}}while(flag);
		
	  //dinkartaneja 1911380
	}
	public static void createAccount()
	{
		Scanner input=new Scanner(System.in);
	    boolean flag=false;
		do {
			try{
			SavingAccount account=new SavingAccount();
			System.out.println("Enter the Account ID\n");
			int id=input.nextInt();
			for(SavingAccount s:list1)
			{
				if(id==s.getAccount_id())
				{
					System.out.println("Id Already Exists\n");
					throw new Exception();
				}
			}
			account.setAccount_id(id);
			System.out.println("Enter The Account Holder First Name\n");
			account.setHolder(input.next());
			System.out.println("Enter the Account Balance you want initially\n");
			account.setBalance(input.nextInt());
			list1.add(account);
			System.out.println("Done\n");
			Menu();
			
		}catch(Exception e) {input.nextLine();flag=true;}}while(flag);
		
	}
	public static void Deposit()
	{
		Scanner input=new Scanner(System.in);
	    boolean flag=false; 
	    do {try{
	    	for(SavingAccount s : list1)
			{
				System.out.println("Press->"+s.getAccount_id()+" ,"+s.getHolder()+"\n");
			}
			System.out.println("Select the account in which you want to deposit\n");
			int choice=input.nextInt();
			for(SavingAccount s : list1)
			{
				if(choice==s.getAccount_id())
				{
					System.out.println("Matched\n");
					System.out.println("Enter the amount you want to deposit\n");
					int choice1=input.nextInt();
					int temp=s.getBalance();
					s.setBalance((temp+choice1));
					System.out.println("Done");
					Menu();
					//dinkartaneja 1911380
				}
			}
	    }catch(Exception e) {input.nextLine();flag=true;}}while(flag);
		
	}
	public static void Withdraw()
	{
		Scanner input=new Scanner(System.in);
	    boolean flag=false; 
	    do {try{
	    	for(SavingAccount s : list1)
			{
				System.out.println("Press->"+s.getAccount_id()+" ,"+s.getHolder()+"\n");
			}
			System.out.println("Select the account From which you want to Withdraw\n");
			int choice=input.nextInt();
			for(SavingAccount s : list1)
			{
				if(choice==s.getAccount_id())
				{
					System.out.println("Matched\n");
					System.out.println("Enter the amount you want to withdraw\n");
					int choice1=input.nextInt();
					int temp=s.getBalance();
					if(choice1 > temp)
					{
						System.out.println("Amout is less in you account\n");
						throw new Exception();
					}
					s.setBalance((temp-choice1));
					System.out.println("Done");
					Menu();
					//dinkartaneja 1911380
				}
			}
	    }catch(Exception e) {input.nextLine();flag=true;}}while(flag);
		
	}
	public static void Inquire()
	{
		Scanner input=new Scanner(System.in);
	    boolean flag=false; 
	    do {try{
	    	for(SavingAccount s : list1)
			{
				System.out.println("Press->"+s.getAccount_id()+" ,"+s.getHolder()+"\n");
			}
			System.out.println("Select the account From which you want to Get Info.\n");
			int choice=input.nextInt();
			for(SavingAccount s : list1)
			{
				if(choice==s.getAccount_id())
				{
					System.out.println("Matched\n");
					s.showData();
					System.out.println("Done");
					Menu();
					//dinkartaneja 1911380
				}
			}
	    }catch(Exception e) {input.nextLine();flag=true;}}while(flag);
		
	}

	//dinkartaneja 1911380
	
	
	public static void main(String[] args) {
		
               Menu();
	}

}




/*
 * ##############WELCOME############# Press 1: To Create Account Press 2: To
 * Deposit Press 3: to Withdraw Press 4: To Inquire
 * 
 * 1 Enter the Account ID
 * 
 * 12345 Enter The Account Holder First Name
 * 
 * dinkar Enter the Account Balance you want initially
 * 
 * 200 Done
 * 
 * ##############WELCOME############# Press 1: To Create Account Press 2: To
 * Deposit Press 3: to Withdraw Press 4: To Inquire
 * 
 * 2 Press->12345 ,dinkar
 * 
 * Select the account in which you want to deposit
 * 
 * 12345 Matched
 * 
 * Enter the amount you want to deposit
 * 
 * 200 Done ##############WELCOME############# Press 1: To Create Account Press
 * 2: To Deposit Press 3: to Withdraw Press 4: To Inquire
 * 
 * 4 Press->12345 ,dinkar
 * 
 * Select the account From which you want to Get Info.
 * 
 * 12345 Matched
 * 
 * Account Holder ->dinkar ,Holder Id ->12345 Balance ->400
 * 
 * Done ##############WELCOME############# Press 1: To Create Account Press 2:
 * To Deposit Press 3: to Withdraw Press 4: To Inquire
 */