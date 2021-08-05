package in.rahulit.logical.star;

public class StarPattern08 {
	public static void main(String[] args) {
		/*
	      ------------------------------
			            * 
			           *** 
			          ***** 
			         *******
			        *********
		  ------------------------------
	       */
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			for(int l=2; l<=i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=2*i-1-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=2*i-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
