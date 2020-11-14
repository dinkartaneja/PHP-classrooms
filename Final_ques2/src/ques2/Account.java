package ques2;
import java.lang.String;
public abstract class Account {
	private int account_id;
	private int balance;
	private int withdrawFees;
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getWithdrawFees() {
		return withdrawFees;
	}
	public void setWithdrawFees(int withdrawFees) {
		this.withdrawFees = withdrawFees;
	}
	public void updateBalance(int value)
	{
		int temp=getBalance();
		setBalance(temp+value);
	}

}
