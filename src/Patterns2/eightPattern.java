package Patterns2;

import java.util.Scanner;

public class eightPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int space = 0;
		int star = (n * 2) - 1;
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < space; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
			star = star - 2;
			space = space + 1;
		}

	}

}
