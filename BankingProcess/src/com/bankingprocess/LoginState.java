package com.bankingprocess;

public class LoginState {
 private static LoginState instance;

 public int amount;
 public int minimum = 2000;
 public int bal;
 public int withdrawAmount;
 private LoginState() {
	  
	  amount = 0;
 }
 
 public static LoginState getUser()
 {
	  if(instance == null)
	  {
		  instance = new LoginState();
	  }
	  return instance;
 }
 
 public void Withdraw(int withdrawAmount)
 {
	  if(withdrawAmount >= 0)
	  {
		  amount -= withdrawAmount;
		  System.out.println("your withdraw amount : " +withdrawAmount );
		  
		  
	  }
	  else 
	  {
		  System.out.println("Please try again");
	  }
	  }
	  
	  public void Balance()
      {
    	  if(amount >= 0)
    	  { 
    		  System.out.println("you can check your balance amount");
    		   bal = (minimum+amount);
    		   System.out.println("balance amount: "+bal);
    		  
    		  //amount = null;
    	  }
    	  else
    	  {
    		  System.out.println("try again");
    	  }
 }
	  public void Deposite(int depositeAmount)
	  {
		  if(depositeAmount > 0)
		  {
			  amount += depositeAmount;
			  System.out.println("your deposited amount : "+depositeAmount);

		  }
		  else {
			  System.out.println("please try again");
		  }
	  }
}
