package Day2;

import java.util.Scanner;

public class BillGenerator {

	public static void main(String[] args) {
		int pizzaPrize = 100; 
		int puffPrize = 20;
		int coolDrinkPrize = 15;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no. of pizzas Bought ");
		
		int numOfPizzas = sc.nextInt();
		
		System.out.print("Enter the no. of puffs Bought ");
		
		int numOfPuffs = sc.nextInt();
		
		System.out.print("Enter the no. of CoolDrinks Bought ");
		
		int numOfCoolDrinks = sc.nextInt();
		
		
		//calculating the total cost of items
		int totalPizzasCost = numOfPizzas*pizzaPrize;
		int totalPuffsCost = numOfPuffs*puffPrize;
		int totalCoolDrinksCost = numOfCoolDrinks*coolDrinkPrize;
		int totalPrizeOfAllItems = totalPizzasCost + totalPuffsCost + totalCoolDrinksCost;
		System.out.println("TotalCostOfItems  "+ totalPrizeOfAllItems);
		
		System.out.println("___");
		System.out.println();
		System.out.println("BillDetails");
		System.out.println("No of Pizzas: " +numOfPizzas + "  Cost: "+totalPizzasCost);
		System.out.println("No of Puffs: " +numOfPuffs + "  Cost: "+totalPuffsCost);
		System.out.println("No of Cool Drinks: " +numOfCoolDrinks +" Cost: "+totalCoolDrinksCost);
		System.out.println("--------------------------------------------------");
		System.out.println("TotalCostOfItems"+ totalPrizeOfAllItems);
		
		sc.close();
	}

}