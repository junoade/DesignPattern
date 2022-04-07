package lecture.week5.problem03;

public class Rocket {

	private String name;
	private double price;
	private double apogee;
	
	public Rocket(String name,double price, double apogee) {
		this.name=name;
		this.price=price;
		this.apogee=apogee;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public double getApogee() {
		return apogee;
	}

}
