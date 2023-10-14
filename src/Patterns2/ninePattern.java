package Patterns2;

import java.util.Scanner;

public class ninePattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int space1 = n-1;
		int star1 = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star1; j++) {
				System.out.print("*");
			}
			space1--;
			star1 = star1 + 2;
			System.out.println();
		}
	
		int space =0;
		int star=(n*2)-1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			space++;
			star = star - 2;
			System.out.println();
		}

	}

}
