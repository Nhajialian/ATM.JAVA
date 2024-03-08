package bank;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;




public class Account {
	//class variable
	int balance;
	int prevtranscation;
	String customerName;
	String customerID;
	//class constructor
	Account(String cname,String cid){
		customerName=cname;
		customerID=cid;
	
	}
	void deposit (int amount) {
		if(amount!=0 && amount>0) {
	   balance=balance+amount;
	  prevtranscation=amount;
	  
		}
	}
	void withdraw(int amount) {
		if(amount!=0) {
			balance=balance-amount;
			prevtranscation=-amount;
		}
	}
		void getPrevtransaction() {
			if(prevtranscation>0) {
				System.out.println("deposited" + prevtranscation);
			}
			else if(prevtranscation<0) {
				System.out.println("withdraw"  + Math.abs(prevtranscation));
			}
			else {
				System.out.println("no transaction occured");
			}
			
		}
		void showdata() {
			Date today = new Date();
			System.out.println(today.toString());
		
	}
	

void showMenu()	{
	char option='\0';
	Scanner scanner =new Scanner(System.in);
	System.out.println("welcome" + customerName);
	System.out.println("your ID is"  + customerID);
	System.out.println();
	System.out.println("what would you like to do ?");
	System.out.println();
	System.out.println("A.check your balance");
	System.out.println("B.make a deposit");
	System.out.println("c.make a withdraw");
	System.out.println("D.view previous transaction");
	System.out.println("E.show date");
	
	System.out.println("F.EXIT");

do {
	System.out.println("please enter an option");
	char option1=scanner.next().charAt(0);
	option=Character.toUpperCase(option1);
	System.out.println();
	switch(option) {
	case'A':
		System.out.println("===============");
		System.out.println("balance= $"+balance);
		System.out.println("=====================");
		break;
	case'B':
		System.out.println("enter an amount to deposit");
		int amount=scanner.nextInt();
		deposit(amount);
		break;
	case'c':
		System.out.println("enter an amount to withdraw");
		int amount2=scanner.nextInt();
		withdraw(amount2);
		break;
	case'D':
		System.out.println("=================");
		getPrevtransaction();
		System.out.println("==============");
		break;
		
	case 'E':
		System.out.println("=================");
		showdata();
		System.out.println("==============");
		break;
		
		
	case'F':
		System.out.println("================");
		break;
		
		default:
			System.out.println("error: invalid option please enter A,B,C,D,E");
			break;
		}
	
	

}
while(option!='F');
}
	

	



	
}
		
	


