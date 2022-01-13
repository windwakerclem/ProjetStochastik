package modele;

public class Sommet {
	
	private String name;
	private double x;
	private double y;
	
	
	public Sommet(String name, double x, double y) {
		this.name=name;
		this.x=x;
		this.y=y;
	}
	
	
	public String getName() {
		return name;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	
	public void setX(double x) {
		this.x=x;
	}
	
	public void setY(double y) {
		this.y=y;
	}

}
