package nikitha;

import java.util.Scanner;
import java.util.stream.IntStream;

public class AccountSetOperations {

	AccountSet[] accounts= new AccountSet[5];
	
	public AccountSetOperations(){
	accounts[0]= new AccountSet(10211,"Adarsh",50000);
	accounts[1]= new AccountSet(10212,"Sparsh",10050);
	accounts[2]= new AccountSet(10213,"Kinshuk",5000);
	accounts[3]= new AccountSet(10214,"Parvathy",70000);
	accounts[4]= new AccountSet(10215,"Sahitya",10760);
		
	
	}
    void deposit(int acno,double amount){
    	for(int i=0;i<5;i++){
    	if(acno==accounts[i].getAccno())
    		available=true;
    		System.out.println("Your account no is:"+accounts[i].getAccno());
    		break;
    	}
    	try{
    		if(available==true)
    			return;
    		throw new AccountNotFoundException();
    	}
    	catch(AccountNotFoundException e){
    		System.out.println("Wrong account number");
    	}
	}
	void withdraw(int acno,double amount){
		
	}
	void checkBalance(int acno){
		
	}	      
			
	
	
}
