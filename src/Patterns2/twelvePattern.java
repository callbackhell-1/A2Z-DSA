package Patterns2;

import java.util.Scanner;

public class twelvePattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int space = 2 * (n - 1);
		for (int i = 1; i <= n; i++) {
			// number
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			// Space
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}

			// number
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
			space = space - 2;
		}

	}

}
