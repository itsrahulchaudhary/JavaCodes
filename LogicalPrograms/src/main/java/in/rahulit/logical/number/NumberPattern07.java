package in.rahulit.logical.number;

public class NumberPattern07 {

	public static void main(String[] args) {
		/*
	      ------------------------------
			        1 
                    2 6 
                    3 7 10 
                    4 8 11 13 
                    5 9 12 14 15 
		  ------------------------------
	       */
		
		int n = 5;
		for(int i=1; i<=n; i++) {
			int no=i;
			for(int j=1; j<=i; j++) {
				System.out.print(no+" ");
				no=no+n-j;
			}
			System.out.println();
		}
	}
}
