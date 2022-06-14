package Patterns;

public class Patterns020 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=row;i>0;i--) {
			for(int j=row-i;j>0;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i*2-1;k++) {
				if(k==i*2-1 || i==row || k==1) {
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
