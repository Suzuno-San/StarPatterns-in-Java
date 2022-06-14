package Patterns;

public class Patterns022 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if(i==j || j==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=row-1;i>0;i--) {
			for(int j=1;j<=i;j++) {
				if(i==j || j==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
