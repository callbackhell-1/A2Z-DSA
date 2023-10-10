package Patterns2;

import java.util.Scanner;

public class sixPattern {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		 for(int i=n;i>0;i--){
             int counter =1;
        for(int j=0;j<i;j++){
           
            System.out.print(counter +  " " );
            counter++;
        }
        System.out.println();
  }

	}

}
