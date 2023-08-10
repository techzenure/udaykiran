package Day2;
public class LogicalOperators {

	public static void main(String[] args) {
		int a = 100;
		int b = 12;
		int c = 5;
		
		//boolean result = (a > b) && (a > c++);
		boolean result = (a > b) || (a > c++);
		System.out.println(result);
		System.out.println(c);
	}

}
