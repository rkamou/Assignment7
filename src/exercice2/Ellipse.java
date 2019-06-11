package exercice2;

public class Ellipse implements ClosedCurve{
	Double semiMajorAxis=0.0;
	Double ellipIntegralAtEccentricity = 0.0;
	
	public Ellipse(Double semiMajorAxis, Double ellipIntegralAtEccentricity) {
		super();
		this.semiMajorAxis = semiMajorAxis;
		this.ellipIntegralAtEccentricity = ellipIntegralAtEccentricity;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 4*ellipIntegralAtEccentricity*semiMajorAxis;
	}

	/**
	 * @return the semiMajorAxis
	 */
	public Double getSemiMajorAxis() {
		return semiMajorAxis;
	}

	/**
	 * @param semiMajorAxis the semiMajorAxis to set
	 */
	public void setSemiMajorAxis(Double semiMajorAxis) {
		this.semiMajorAxis = semiMajorAxis;
	}

	/**
	 * @return the ellipIntegralAtEccentricity
	 */
	public Double getEllipIntegralAtEccentricity() {
		return ellipIntegralAtEccentricity;
	}

	/**
	 * @param ellipIntegralAtEccentricity the ellipIntegralAtEccentricity to set
	 */
	public void setEllipIntegralAtEccentricity(Double ellipIntegralAtEccentricity) {
		this.ellipIntegralAtEccentricity = ellipIntegralAtEccentricity;
	}
	
}
