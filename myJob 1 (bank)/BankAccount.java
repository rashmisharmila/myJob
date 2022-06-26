import java.util.*;
class BankAccount{
		String customerName;
		String customerId;
		double balance;
		double previousTransacation;
		
		//Constructor.....
		BankAccount(String cname,String cid){
			customerName=cname;
			customerId=cid;
		}
		
		//Menu method
		void showManu(){
				char option='\0';
				Scanner input=new Scanner(System.in);
				//Bank name
				System.out.println("\t\t*************************************************");
				System.out.println("\t\t*\t\t\tBOC\t\t"+"	"+"*");
				
				
				//print coustomer Name
				System.out.println("\t\t*\t\tWelcome"+customerName+"\t\t"+"	"+"*");
				
				//Print Id number...
				System.out.println("\t\t*\t\tYour ID is"+customerId+"\t\t*");
				System.out.println("\t\t*************************************************");
				System.out.println("\n");
				
				//option....
				System.out.println("\t*************************************************");
				System.out.println("\t*\t\t\tMenu\t\t"+"	"+"*");
				System.out.println("\t*************************************************");
				System.out.println("\t*\tA. Check Balance\t\t\t*");
				System.out.println("\t*\tB. Deposite\t\t\t\t*");
				System.out.println("\t*\tC. Withdraw\t\t\t\t*");
				System.out.println("\t*\tD. Cprevious Transaction\t\t*");
				System.out.println("\t*\tE. Eixt\t\t\t\t\t*");
				System.out.println("\t*************************************************\n");
			
			
			do{
				//Select option....
				System.out.print("Enter An Option > ");
				option=input.next().charAt(0);
				System.out.println("\n");
				
				switch(option){
					//check balance....
						case 'A' :
						System.out.println("***************************************************");
						System.out.println("A. Check Balance ");
						System.out.println("***************************************************");
						System.out.println("\tBalance "+balance);
						System.out.println("\n");
						break;
					
					//Deposite....	
						case 'B' :
						System.out.println("***************************************************");
						System.out.println("B. Deposite ");
						System.out.println("***************************************************");
						
						//input amount....
						System.out.print("Enter an amount to deposite :");
						int amount=input.nextInt();
							
							//calling deposite method
							deposit(amount);
							System.out.println("\n");
							break;
					
					//withdraw....	
						case 'C' :
						System.out.println("***************************************************");
						System.out.println("C. Withdraw ");
						System.out.println("***************************************************");
						
						//input amount2....
						System.out.print("Enter an amount to withdraw :");
						int amount2=input.nextInt();
							
							//calling deposite method
							withdraw(amount2);
							System.out.println("\n");
							break;
					
					//Previous Transaction.....	
						case 'D' :
						
						//Previous Transction.....
						getPreviousTransaction();
						System.out.println("***************************************************");
						System.out.println("D. Previous Transaction ");
						System.out.println("***************************************************");
						System.out.println("\n");
						break;
					
					//Eixt....	
						case 'E' :
						System.out.println("***************************************************");
						System.out.println("E. Eixt ");
						System.out.println("***************************************************");
						break;
						
						default:
							System.out.println("Invalid Option!!.Please enter again");
							break;
				}
			}while(option !=0);
			System.out.println("Thank you for using our services");
		
	}
		
		//deposit method
		void deposit(double amount){
			if(amount !=0){
				balance+=amount;
				previousTransacation=amount;
			}
		}
		//withdraw method....
		void withdraw(int amount){
				if(amount!=0){
					balance=balance-amount;
					previousTransacation=-amount;
				}
		}
		//Previous Transaction....
		void getPreviousTransaction(){
				if(previousTransacation>0){
					System.out.println("Deposited : "+previousTransacation);	
				}
				else if(previousTransacation<0){
					System.out.println("No Transaction occured");
				}
		}
		
	
	
}
