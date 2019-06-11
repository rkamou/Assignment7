package exercice2;

public class EquilateralTriangle  implements Polygone {
	Double side;
	public EquilateralTriangle(Double side){
		this.side = side;
	}
	@Override
	public Double[] getLenghts() {
		return new Double[] {side,side,side};
	}
	/**
	 * @return the side
	 */
	public Double getSide() {
		return side;
	}
	/**
	 * @param side the side to set
	 */
	public void setSide(Double side) {
		this.side = side;
	}
	
}
