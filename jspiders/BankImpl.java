package jspiders;

public class BankImpl implements Bank
{
	private int balance;
	
	public BankImpl(int balance) {
		this.balance=balance;
	}
	
	@Override
	public void deposit(int amount)
	{
		System.out.println("depositing rs :"+amount);
		balance=balance+amount;  //balance+=amount;
		System.out.println("amount deposite succesfully");
	}
	
	@Override
	public void withdraw(int amount)
	{
		if(amount<=balance) {
		System.out.println("withdraw rs :"+amount);
		balance=balance-amount;  //balance-=amount;
		System.out.println("amount Withdraw succesfully");
		}
		else
		{
			//invoke an exception and handle it using try and catch block
			//InsufficentBalanceException
			try {
				throw new InsufficentBalanceException("InsufficentBalance!");
			} 
			
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}

	
	@Override
	public String displayErrorMessage()
	{
		return "invalid choice ,kindly enter the valid choice!";
	}

	@Override
	public int getbalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public int getbalance1() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	
}
