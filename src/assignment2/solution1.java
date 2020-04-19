package assignment2;

public class solution1
{
	static final double [][] data = {{-100, 9901}, {-10, 91}, {-3, 7}, {0, 1}, {1, 3},
					 {2, 7}, {3, 13}, {4, 21}, {10, 111}, {100, 10101}};
	
	public static void main(String[] args) {
		final int epochs = 5000;
		
		double w0 = 0;
		double w1 = 0;
		double w2 = 0;
		
		double alpha = 0.00000001;
		
		for(int i = 0; i < epochs; i++) {
			double cost = 0;
			
			for(int j = 0; j < data.length; j++) {
				double x = data[j][0];
				double y = data[j][1];
				
				double hypo = w0 + (w1 * x) + (w2 * x * x);
			
				cost += (y - hypo) * (y - hypo);
				
				w0 += alpha * (y - hypo);
				w1 += alpha * (y - hypo) * x;
				w2 += alpha * (y - hypo) * x * x;
			}
			

			System.out.print(cost + " ");
			System.out.print(w0 + " ");
			System.out.print(w1 + " ");
			System.out.println(w2 + " ");
		}
		System.out.println("Final equation is h(x): " + w0 + " + " + w1 + "x + " + w2 + "x^2");
	}
}
