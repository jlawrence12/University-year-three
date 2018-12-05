
public class BooleanExpressions {

	public static void main(String[] args) {
		get_false();
		booleans1();
		booleans2();

	}
	
	public static boolean get_false() {
		
		System.out.println("Returning false.");
		return false;
		}
	
		public static void booleans1() {
		int i = 1;
		int j = 2;
		if(i==j && get_false()) {
		System.out.println("Inside if-clause.");
		} else {
		System.out.println("Inside else-clause.");
		}
	}
		
		public static void booleans2() {
		int i = 1;
		int j = 2;
		if(i!=j || !get_false()) {
			System.out.println("Inside if-clause.");
		} else {
		System.out.println("Inside else-clause.");
		}
	}
}
	
	


