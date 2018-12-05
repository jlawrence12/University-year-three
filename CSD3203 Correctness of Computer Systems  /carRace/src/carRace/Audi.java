package carRace;

public class Audi extends Car {
	int speed,distance;
	String driver;
	
	
	public Audi(int speed, int distance, String driverName) {
		super(speed, distance);
		driver = driverName;
		
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public void setSpeed(int num) {
		this.speed = num;
	}
	
	public int getDistance(){
		return this.distance;
		
	}
	
	public void setDistance(int dist) {
		this.distance = dist;
	}
	
	public void drive(int time) {
		distance += speed * time;
	}
	
	public void setDriver(String dvr) {
		driver = dvr;
	}

}
