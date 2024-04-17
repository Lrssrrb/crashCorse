package javaCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q5 {
	
	private String accountNumber;
    private double balance;

    public Q5(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        setBalance(balance); // Validate balance
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
    	Pattern p = Pattern.compile(
                "[^0-9 ]", Pattern.CASE_INSENSITIVE);
    	
    	Matcher m = p.matcher(accountNumber);
    	boolean res = m.find();
    	if (!res && accountNumber.length() == 10) {
    		this.accountNumber = accountNumber;
    	}
    	else {
    		System.out.println("Please provide a valid account number");
    	}
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. Balance cannot be negative.");
        }
    }
    
    @Override
	public String toString() {
		return "Q5 [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		Q5 q5 = new Q5("123", 500);
		System.out.println(q5);
	}
}
