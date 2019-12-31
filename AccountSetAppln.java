package nikitha;

import java.util.Scanner;

public class AccountSetAppln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println("enter the value of the operation you want to perform: 1- Deposit, 2- Withdraw, 3-Check balance");
			Scanner sc=new Scanner(System.in);
			int x = sc.nextInt();
			
		AccountSet	accounts = new AccountSet();
			switch (x){
			case 1:
				accounts.deposit(int acno,double amount){
					
					
				System.out.println("enter the amount you want to deposit");
				int amt = sc.nextInt();
				
				int l=accounts.length;
				int b;
				Object[] account;
				for(int i=0;i<l;i++){
					
					b=(int) ((AccountSet)account[i]).getBalance();
					b=b+amt;
				}
				break;
				}
				
			case 2:
				
				void withdraw(int acno,double amount){
					
					System.out.println("enter the amount you want to withdraw");
					int amt=sc.nextInt();
					try{
					int l=accounts.length;
					int b;
					Object[] account;
					for(int i=0;i<l;i++){
						b=(int) ((AccountSet)account[i]).getBalance();
						if(b>=amt){
							System.out.println("You can withdraw your money");
							b=-amt;
							
						}
					}
					}
					catch(InsufficientBalanceException e){
						System.out.println("insufficient balance");
					}
					break;
					
				}
				
			case 3:
				 
				void checkBalance(int[]accounts){
					
					System.out.println("Enter Your account no: ");         
					int scacno = sc.nextInt();
					
						
						try{
						int l=accounts.length;
						for(int i=0;i<l;i++)
						if(scacno==accounts[i])
				  	        // Print the result 
				        System.out.println("Your account no: "+scacno+ "is a valid number");                          
						
						
						}
						catch(AccountNotFoundException e){
							System.out.println("enter correct account no");
						}
				}
				
				
				
			
				
			
			
		
			
		}
	
	

	}

}
