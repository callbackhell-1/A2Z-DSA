package Patterns2;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in); 
		int n = scn.nextInt();
		for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

	}

}
