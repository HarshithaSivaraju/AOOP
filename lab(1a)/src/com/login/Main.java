package com.login;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loginpage Loginuser = loginpage.getInstance();

        
        Loginuser.log("Application started :");
        
        
    loginpage anotherLogger = loginpage.getInstance();

       	        anotherLogger.log("This is logged using another reference to the same Loginuser instance.");

        
        if (Loginuser == anotherLogger) {
            System.out.println("loginusers are the same for both.");
        } else {
            System.out.println("Loginuser are different.");
        }

	}

}
