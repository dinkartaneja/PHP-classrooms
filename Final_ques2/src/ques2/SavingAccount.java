package ques2;

public class SavingAccount extends Account{
	private double interestRate;
	private String holder;
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public void showData()
	{
		System.out.println("Account Holder ->"+getHolder()+" ,Holder Id ->"+getAccount_id()+"\n"
				+ " Balance ->"+getBalance()+"\n");
		}
}
