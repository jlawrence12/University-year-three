

public class Main {

	  // Complete this function to return either
	  // "Hello, [name]!" or "Hello there!"
		// based on the input
		
		public static void main (String[]args){

			solution(10);

		}
		  public static int solution(int number) {
			    //TODO: Code stuff here
			    int sum = 0;
			    int three = 0;
			    int five = 0;
			    
			    for(int i=1; i<1000; i++){
			      if(i>three)
			          three+=3;
			      if(i>five)
			          three+=5;
			    if(i == three || i == five)
			      sum += i;
			    }
			      return sum;
			}
		}
	  
	