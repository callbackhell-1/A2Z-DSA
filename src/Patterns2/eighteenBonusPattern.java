package Patterns2;

import java.util.Scanner;

public class eighteenBonusPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) {
			char alphabet = 'C';
			for (int j = 1; j <= i; j++) {
				System.out.print(alphabet + " ");
				alphabet--;
			}
			System.out.println();
		}

	}

}
