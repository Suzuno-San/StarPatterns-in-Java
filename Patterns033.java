package Patterns;

public class Patterns033 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(j==row || i==row) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int k=1+1;k<=row;k++) {
				if(i==row) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=1+1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(j==row) {
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
