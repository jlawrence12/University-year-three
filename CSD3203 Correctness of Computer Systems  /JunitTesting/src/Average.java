
public class Average {
	// Requirement:
		//   takes any array of positive integers and 
		//   returns the average of all numbers in the array 
		public static int calculate(int[] array) {
			int sum = 0;
			
			for(int i=0; i<array.length; i++) {
				sum += array[i];
			}
			
			return sum / array.length;
		}

}
