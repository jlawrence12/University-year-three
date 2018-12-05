
public class Integers {

	public static void main(String[] args) {
		
		foo();
	}
	


public static boolean xyz() {
  System.out.println("A");
  return true;
}
public static void foo() {
  if (true || xyz()) {
    System.out.println("B");
  }
}


	}
