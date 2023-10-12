package Patterns2;

import java.util.Scanner;

public class tenPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int loopCount = (n*2)-1;
		
		for(int i=1;i<=loopCount;i++) {
			int stars = i;
			if (i > n) {
				stars = (2 * n) - i;
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
