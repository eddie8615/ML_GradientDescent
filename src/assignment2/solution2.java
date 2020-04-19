package assignment2;

import java.lang.Math;

public class solution2
{
	static final double[][] data = {{1, 1, 0}, {2, 2, 0}, {0.3, 1.2, 0}, {0.6, 0.8, 0},
									{1.2, 1, 0}, {1.3, 1, 0}, {1.8, 2, 0}, {1.5, 1.4, 0},
									{3, 3, 1}, {4, 4, 1}, {3.1, 3.3, 1}, {3.8, 2.1, 1}, {3.6, 3.8, 1},
									{3.5, 2.2, 1}, {3.25, 2.8, 1}};
	public static void main(String[] args) {
		final int epochs = 10000;
		
		double w0 = 0;
		double w1 = 0;
		double w2 = 0;
		
		double alpha = 0.1;
		
		for(int i = 0; i < epochs; i++) {
			double cost = 0;
			
			for(int j = 0; j < data.length; j++) {
				double x1 = data[j][0];
				double x2 = data[j][1];
				double y = data[j][2];
				
				//sigmoid function
				
				double z = w0 + w1 * x1 + w2 * x2;
				double hypo = 1 / (1 + Math.exp(-z));
				
				cost += y * Math.log(hypo) + (1 - y) * Math.log(1 - hypo);
				
				w0 += alpha * (y - hypo);
				w1 += alpha * (y - hypo) * x1;
				w2 += alpha * (y - hypo) * x2;
			}
			
			System.out.println("Cost is " + (-cost / data.length));
		}
		System.out.print(w0 + " ");
		System.out.print(w1 + " ");
		System.out.println(w2);
		System.out.println("Final equation is x2 = " + (-w1 / w2) + "x1 " + "+ " + (-w0 / w2));
	}
}

