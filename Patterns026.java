package Patterns;

public class Patterns026 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int k=1;k<=row-i;k++) {
				System.out.print("    ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=row-1;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int k=row-i;k>0;k--) {
				System.out.print("    ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
