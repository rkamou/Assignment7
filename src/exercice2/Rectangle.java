package exercice2;

public class Rectangle implements Polygone {
	private double length, width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override
	public Double[] getLenghts() {
		return new Double[] {2*length,2*width,};
	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
}
