package ct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class StringCollect {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for(int i=0; i<n; i++) {
			int m = Integer.parseInt(br.readLine());			
			sb = new StringBuilder();
			if(m/25>0) {
				sb.append(m/25 + " ");
				m = m%25;
			}
			else {
				sb.append(0 + " ");
			}
			if(m/10>0) {
				sb.append(m/10 + " ");
				m = m%10;
			}
			else {
				sb.append(0 + " ");
			}
			if(m/5>0) {
				sb.append(m/5 + " ");
				m = m%5;
			}
			else {
				sb.append(0 + " ");
			}
			if(m>0) {
				sb.append(m);
			}
			else {
				sb.append(0 + " ");
			}
			System.out.println(sb);
		}
	}

}
