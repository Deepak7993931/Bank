package jspiders;

import java.util.Scanner;

public class Solution
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		BankImpl bank=new BankImpl(5000);//upcasting-->abstraction
		
		while(true) {
			
		System.out.println("1:deposite amount\n2:withdraw amount\n3:get balance\n4:EXIT");
		System.out.println("enter the choice");
		int key=s.nextInt();
		
		switch(key){
		
		case 1:System.out.println("Enter the amount to Deposite");
				int amountToDeposite=s.nextInt();
				bank.deposit(amountToDeposite);//bank.amountTODeposit(s.nextInt());
		break;
				
		case 2:System.out.println("Enter the amount to Withdrawn");
				int amountToWithdraw=s.nextInt();
				bank.withdraw(amountToWithdraw);//bank.amountTOWithdraw(s.nextInt());
		break;

		case 3:
				System.out.println(bank.getbalance());
		break;
		case 4:
				System.out.println("thank you");
				System.exit(0);
		default:
				System.out.println(bank.displayErrorMessage());
		}
		System.err.println("------------------------------"); //after switch
		
	} //end of while loop
		
	}
		
	}

