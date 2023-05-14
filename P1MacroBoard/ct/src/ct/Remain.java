package ct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remain {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		List<Integer> ls = new ArrayList<>(); 
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==-1) {
				break;
			}
			else {
				sb = new StringBuilder();

				int sum=0;
				for(int i=1; i<n; i++) {
					if(n%i==0) {
						sum +=i;
					}
				}
				if(n==sum) {
					sb.append(n + " = 1");					
					for(int i=2; i<n; i++) {
						if(n%i==0) {
							sb.append(" + " + i);
						}
					}
					System.out.println(sb);
				}
				else {
					System.out.println(n + " is NOT perfect.");
				}


			}
		}
	}

}
