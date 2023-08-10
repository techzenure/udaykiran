package Day4;
import java.util.Arrays;

public class ArrayInitialization {
	public static void main(String[] args) {
		int[] marks = { 87, 65, 93, 82, 76, 51 };

		System.out.println(marks);
		System.out.println(Arrays.toString(marks));

		System.out.println("no of subjects = " + marks.length);
		System.out.println();

		// --- array iteration using for loop ----
		for (int i = 0; i < marks.length; i++) {
			System.out.println("mark for Subject-)" + (i + 1) + " = " + marks[i]);
		}
		System.out.println();

		// --- array iteration using enhanced for loop/ for..each loop
		System.out.print("marks obtained   ----> ");
		for (int mark : marks) {
			System.out.print(mark + "  |  ");
		}
		System.out.println();

		System.out.println(marks[5]);
		System.out.println(marks[6]); // java.lang.ArrayIndexOutOfBoundsException
	}
}
