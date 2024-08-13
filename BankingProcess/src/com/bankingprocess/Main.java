package com.bankingprocess;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("minimum balance : 2000");
		LoginState user = LoginState.getUser();
	    user.Deposite(500000);
	    user.Balance();
	    user.Withdraw(275350);
	    user.Balance();
	    

	    
	}

}
