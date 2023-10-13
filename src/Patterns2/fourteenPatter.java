package Patterns2;

import java.util.Scanner;

public class fourteenPatter {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		String str = scn.nextLine();
//		char n = str.charAt(0);
		int n = scn.nextInt();
		
        for(int i=0;i<n;i++){
        	char chara = 'A';
          for(int j=0;j<=i;j++){
              System.out.print(chara);
              chara++;
          }
          System.out.println();
      }

	}

}
