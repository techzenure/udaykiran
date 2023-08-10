package Day4;
import java.util.*;
public class Main
{
    
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter total no. of employees:");
	    int totalNoEmployees = sc.nextInt();
	    
	    if(totalNoEmployees < 2)
	    {
	        System.out.println("Please enter a valid employee count");
	        return;
	       
	    }
	    int empArray[] = new int[totalNoEmployees];
	    System.out.println("Enter the age for "+totalNoEmployees+" employees:");
	    for(int i=0; i<totalNoEmployees; i++)
	        empArray[i] = sc.nextInt();
	    if(calculateAverage(empArray) !=0)
	       System.out.printf("The average age is %.2f",calculateAverage(empArray));
	    sc.close();
	    
	}
	
	public static float calculateAverage(int[] age){
	    float sumAges=0, averageAge;
	    for(int i=0; i<age.length; i++)
	    {
	        if(age[i] < 28 || age[i] > 40)
	        {
	           System.out.println("Invalid Age Encountered!");
	           return 0;
	        }
	        sumAges = sumAges + age[i];
	    }
	   
	    averageAge = sumAges / age.length;
	    return averageAge;
	    
	}
	 
}

