package carRace;

public class volkswagen extends Car {
	
	String driver;
	int speed,distance;
	
	public volkswagen(int speed, int distance, String driverName){
		super(speed, distance);
		driver = driverName;
		
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public void setSpeed(int num) {
		speed = num;
	}
	
	
	public void setDistance(int dist) {
		distance = dist;
	}
	
	public void setDriver(String dvr) {
		driver = dvr;
	}
	
	public void drive(int time) {
		distance += speed * time;
	}
	

}
