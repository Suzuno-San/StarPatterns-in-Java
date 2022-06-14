package Patterns;

public class Patterns017 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=row;i>0;i--) {
			for(int j=1;j<=i;j++) {
				if(i==j || i==row || j==1) {
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
