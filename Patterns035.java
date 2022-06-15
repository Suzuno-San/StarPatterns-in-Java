package Patterns;

public class Patterns035 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			if(i%2!=0) {
				for(int j=1;j<=row;j++) {
					if(j%2!=0) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			else {
				for(int k=1;k<=row;k++) {
					if(k%2!=0) {
						System.out.print("  ");
					}
					else {
						System.out.print("* ");
					}
				}
			}
			System.out.println();
		}
	}
}
