
public class TestClass {

	public static void main(String[] args) {
		int i;
	
		
		int[]n = {1, 2, 3, 4, 5};
		int[]result = new int[n.length];
		for (i = 0; i < n.length; i++) {
		    result[(i + (n.length - 2)) % n.length] = n[i];
		}

		for (int j : result) {
			
		    System.out.print(j+" ");
		    
		}

	}

}	

//big O (n) 