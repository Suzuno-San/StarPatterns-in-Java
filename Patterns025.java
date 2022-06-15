package Patterns;

public class Patterns025 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=row;i>0;i--) {
			for(int j=row-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=row;k++) {
				if(i==row || k==row || i==1 || k==1) {
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
