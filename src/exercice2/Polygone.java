/**
 * 
 */
package exercice2;

/**
 * @author 610151
 *
 */
public interface Polygone extends ClosedCurve{
	public default double computePerimeter() {
		Double[] sides =  getLenghts();
		Double perimeter = 0.0;
		for(int i=0;i<sides.length;i++) {
			perimeter+=sides[i];
		}
		return perimeter;
	}
	public Double[] getLenghts();
}
