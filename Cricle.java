
public class Cricle {
	private double radius;
	public Cricle(double r){
		r=1;
	}
	public double area(){
		return Math.PI*radius*radius;
	}
	public double circumference(){
		return Math.PI*2*radius;
	}
	public String toString(){
		return"Cricle°ë¾¶ÊÇ"+radius;
	}
	public void setRadius(double r){
		
	}
	public double getRadius(){
		return radius;
	}
}
