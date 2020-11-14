package ques2;
import java.util.Date;
public abstract class Transaction {
	private int id;
	 private Date date;
	 public abstract boolean completeTransaction();
	 public abstract void cancelTransaction();
}
