package modele;

public class Arc {
	
	private Sommet s1;
	private Sommet s2;
	private double cout;
	
	
	public Arc( Sommet s1, Sommet s2) {
		this.s1=s1;
		this.s2=s2;
		cout = Math.sqrt ( Math.pow((s2.getY()-s1.getY()),2) - Math.pow((s2.getX()-s1.getX()),2));
	}
	
	public double getCout() {
		return cout;
	}

}
