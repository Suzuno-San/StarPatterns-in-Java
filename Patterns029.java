package Patterns;

public class Patterns029 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=row;i>0;i--) {
			for(int j=row-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if(i==k || k==1 || i==row) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=1+1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if(i==k || k==1 || i==row) {
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
