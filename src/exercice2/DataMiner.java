package exercice2;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {
	List<ClosedCurve> objects = new ArrayList<>();
	public static void main(String[] args) {
		DataMiner dm = new DataMiner();
		
		dm.objects.add(new Rectangle(2,9));
		dm.objects.add(new EquilateralTriangle(9.0));
		dm.objects.add(new Circle(6));
		dm.objects.add(new Ellipse(2.0,6.0));
		System.out.println(dm.computeAveragePerimeter());
	}
	
	//OO (good) way of performing computation
	public double computeAveragePerimeter() {
		if(objects == null || objects.isEmpty()) return 0.0;
		double sum = 0.0;
		for(int i = 0; i < objects.size(); ++i) {
			System.out.println(objects.get(i).getClass().getSimpleName()
					+": "+objects.get(i).computePerimeter());
			sum += objects.get(i).computePerimeter();
		}
		return sum/objects.size();
	}

}
