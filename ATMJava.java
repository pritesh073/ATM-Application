import java.util.Scanner;

public class ATMJava {
	public static void main(String[] args)
	{
		int pin, amount,choice,balance,Withdraw_amount,deposit_amount,new_pin,confirm_pin,upin ;
		pin=2020;
		balance=5000;
		Scanner sc= new Scanner(System.in);
		do {
		System.out.println("      ********************************************WLCOME TO SBI ATM********************************************                  ");
		System.out.println("\n1.check balance\n2.Debit/Withdraw Cash\n3.Credit/Deposit\n4.Change Pin\n5.Exit");
		System.out.println("Enter your choice ");
       
        choice=sc.nextInt();
        
        switch(choice)
        {
        	case 1:
        		System.out.println("Enter your pin");
        		upin=sc.nextInt();
        		if(upin==pin)
        		{
        			System.out.println("Your balance is "+balance );
        			
        		}
        		else
        		{
        			System.out.println("Invalid pin");
        		}
        		
        		break;
        		
        	case 2:
        		System.out.println("Enter your pin");
        		upin=sc.nextInt();
        		if(upin==pin)
        		{
        			System.out.println("Enter the amount to Withdraw:");
        			Withdraw_amount=sc.nextInt() ;
        			if(Withdraw_amount<balance)
        			{
        				balance=balance-Withdraw_amount;
        				System.out.println(" Transaction Successfull..");
        				System.out.println("Your Available balance is:"+balance);
        				
        			}
        			else
        			{
        				System.out.println("Insufficienr balance");
        			}
        			
        			}
        		else
        		{
        			System.out.println("Invalid pin");
        		}
        		break;
        	case 3:
        		System.out.println("Enter your pin");
        		upin=sc.nextInt();
        		if(upin==pin)
        		{
        			System.out.println("Enter the amount to be deposited:");
        			deposit_amount=sc.nextInt();
        			if(deposit_amount>0)
        			{
        				balance=balance+deposit_amount;
        				System.out.println("Amount deposited Successfull..");
        				System.out.println("Your Available balance is:"+balance);
        				
        			}
        			else
        			{System.out.println("Enter amount is not valid");}
        		}
        		else
        		{
        			System.out.println("Invalid pin");
        		}
        		break;
        	case 4:
        		System.out.println("Enter your pin");
        		upin=sc.nextInt();
        		if(upin==pin)
        		{
        			System.out.println("Enter your new pin");
        			new_pin=sc.nextInt();
        			System.out.println("Enter your confirm pin");
        			confirm_pin=sc.nextInt();
        			if(new_pin==confirm_pin)
        			{
        				pin=new_pin;
        				System.out.println("New pin set Successfull");
        				
        			}
        			else
        			{
        				System.out.println("Invalid new pin");
        			}
        			
        			
        		}
        		else
        		{
        			System.out.println("Invaild pin");
        		}
        		break;
        	case 5:
        		System.out.println("Thank you");
        		
        		break;
        }
		}
		while(choice!=5);
	}

}