package carRace;

public class Car {
	
	public int speed, distance;
	public Person driver;
	
	public Car(int speed, int distance) {
		
		this.speed = speed;
		this.distance = distance;
	}
	
	public void drive(int time) {
		distance += speed * time;
	}
	
	
	
	public String toString() {
		return ("  )
	}

}