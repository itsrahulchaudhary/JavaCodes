package in.rahulit.logical.normal;

public class N16FibonacciSeriesByRecursion {
	static int a = 0, b = 1, c;

	public static void main(String[] args) {
		System.out.print(a + " " + b + " ");
		N16FibonacciSeriesByRecursion obj = new N16FibonacciSeriesByRecursion();
		obj.printFibo(10);

	}

	public void printFibo(int i) {
		if (i >= 1) {
			c = a + b;
			System.out.print(c + " ");
			a=b;
			b=c;
			printFibo(i-1);
		}
	}

}
