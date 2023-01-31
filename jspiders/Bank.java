package jspiders;

public interface Bank 
{
	 void deposit(int amount);
	 void withdraw(int amount);
	 int getbalance();
	 String displayErrorMessage();
	int getbalance1();
	 
	 //all the methods in interface are automatically public and abstract
	
}
