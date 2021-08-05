package in.rahulit.logical.number;

public class NumberPattern08 {

	public static void main(String[] args) {
		/*
	      ------------------------------
			     1 2 3 
                 6 5 4 
                 7 8 9 
                 12 11 10 
                 13 14 15 
                 18 17 16 
                 19 20 21 
                 24 23 22 
		  ------------------------------
	       */
		int n = 8;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= 3; j++) {
					count = count + 1;
					System.out.print(count + " ");
				}
			} else {
				int temp = count + 1;
				for (int j = count + 3; j >= temp; j--) {
					count = count + 1;
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}

}
