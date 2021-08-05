package in.rahulit.logical.number;

public class NumberPattern03 {

	public static void main(String[] args) {
		/*
	      ------------------------------
			    1
                2 3
                4 5 6
                7 8 9 10
                11 12 13 14 15
		  ------------------------------
	       */
		int n=5;
		int count=0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				count=count+1;
				System.out.print(count+" ");
			}
			System.out.println();
		}

	}

}
