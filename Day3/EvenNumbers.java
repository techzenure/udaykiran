package Day3;
import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.print("Enter an integer: ");
        x = sc.nextInt();
        System.out.println();
        System.out.print("Enter another integer: ");
        y = sc.nextInt();

        
        if (x > y){
            int temp = x;
            x = y;
            y = temp;
        }

        System.out.println("\nEVEN numbers between 2 inputs:");
       
        for (int i = x ; i <= y ; i++) {
            
           
            if (i % 2 == 0){
                System.out.print(i + " ");
                
                sc.close();
            }
        }

	}

}
