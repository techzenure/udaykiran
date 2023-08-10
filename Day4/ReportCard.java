package Day4;
import java.util.Scanner;

public class ReportCard {
	static Scanner sc  = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter the name:");
		String name = sc.nextLine();
		System.out.print("Enter no.of subjects");
		
		
		int noOfSubjects = sc.nextInt();
		int[] marks = new int[noOfSubjects];
		marksEntry(marks);
		int totalMarks=printMarks(name, marks);
		
		//marksEntry(marks);
		//printMarks(name,marks);
		double average =	totalMarks/	noOfSubjects;
		System.out.print("TOTAL :"+ totalMarks+"\t");
		System.out.print("AVERAGE : "+average);
		sc.close();
		

	}

	

	private static void marksEntry(int[] marks) {
		for(int i = 0;i<marks.length;i++) {
			System.out.print("enter mark for subject-"+(i+1)+":");
			marks[i] = sc.nextInt();
		}
		
	}
	private static int printMarks(String name, int[] marks) {
		System.out.println();
		System.out.println("STUDENT NAME :"+" " +name.toUpperCase()+"\n");
		System.out.println("*****");
		System.out.println("SUBJECT\t\t\tMARKS");
		
		for(int i =0 ; i<marks.length;i++) {
			System.out.println("Subject-"+(i+1)+" \t\t\t "+marks[i]);
		}
		
		System.out.println("******");
		int totalMarks = 0;
		for(int total : marks) {
			totalMarks = totalMarks+total;
			
		}
		return totalMarks;
		
		
	}

}
