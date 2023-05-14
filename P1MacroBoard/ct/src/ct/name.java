package ct;

import java.util.Scanner;

public class name {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int [][] map = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m;j++) {
				map[i][j] = kb.nextInt();
			}
		}
		int len = kb.nextInt();
		for(int i=0; i<len; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			int d = kb.nextInt();
			int sum=0;
			for(int j=a-1; j<=c-1;j++) {
				for(int k=b-1; k<=d-1;k++) {
					sum += map[j][k];
				}
			}
		
			System.out.println(sum);
		}
		
		
		
		

	}

}
