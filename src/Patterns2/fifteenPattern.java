package Patterns2;

import java.util.Scanner;

public class fifteenPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = n;
		for (int i = 0; i < n; i++) {
			char chara = 'A';
			for (int j = count; j > 0; j--) {
				System.out.print(chara);
				chara++;
			}
			count--;
			System.out.println();
		}
	}

}
