package Patterns;

public class Patterns019 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i*2-1;k++) {
				if(k==(i*2)-1 || i==row || k==1) {
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
