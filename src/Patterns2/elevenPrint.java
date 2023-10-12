package Patterns2;

import java.util.Scanner;

public class elevenPrint {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int off = 0;
		int on = 1;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= i; j++) {
					if (j % 2 == 0) {
						System.out.print(on + " ");
					} else {
						System.out.print(off + " ");
					}
				}
				System.out.println();
			} else {
				for (int j = 1; j <= i; j++) {
					if (j % 2 != 0) {
						System.out.print(on + " ");
					} else {
						System.out.print(off + " ");
					}
				}
				System.out.println();
			}
		}
	}

}