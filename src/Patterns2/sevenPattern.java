package Patterns2;

import java.util.Scanner;

public class sevenPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int star = 1;
		int space = n - 1;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(" ");

			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");

			}
			System.out.println();
			space = space - 1;
			star = star + 2;
		}
	}

}
