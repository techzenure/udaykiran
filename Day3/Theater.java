package Day3;
import java.util.Scanner;

public class Theater {

	public static void main(String[] args) {
		
		System.out.print("Enter the no.of tickets:");
		Scanner sc  =  new Scanner(System.in); // using a scanner scanner class to take the i/p from the user
		int numTickets = sc.nextInt(); // using integer scanner object
		if(numTickets < 5 || numTickets > 40) {   //check the tickets number to buy ifthe tickets are 5 and less than 40 then the offer apply 
			System.out.print("minimum of five and maximum of 40 tickets");
		}
		else {
			System.out.print("Do You  want refreshent:(Y/N):");   
			char refreshmentChoice = sc.next().charAt(0);
			System.out.print("Do You  want couponcode:(Y/N):");
			char couponCode = sc.next().charAt(0);
			System.out.print("Enter the Circle (K/Q):");
			char circle = sc.next().charAt(0);
			double ticketCost = 0;
			
			if(circle == 'K') {
				ticketCost = numTickets * 75;
				
			}
			else if(circle == 'Q') {
				ticketCost = numTickets * 150;
			}
			else {
				System.out.println("Circle is invalid");
			}
			int refreshmentCost=0;
			if(refreshmentChoice == 'Y') {
				 refreshmentCost = numTickets*50;
			}
			double discAmnt1=0;
			if(numTickets>20) {
			 discAmnt1=ticketCost*0.1;
			}
			double discAmnt2=0;
			if(couponCode == 'Y') {
			 discAmnt2 =ticketCost*0.02;
				
			}
			System.out.print((ticketCost-(discAmnt1+discAmnt2))+refreshmentCost);
			sc.close();
		}
		

	}

}
