package Patterns;

public class Patterns004 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=row;i>0;i--) {
			for(int j=row-i;j>0;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
