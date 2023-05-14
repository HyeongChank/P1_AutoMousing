package ct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForthPoint {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		String s1 = br.readLine();
		String s2 = br.readLine();
		int [] a = {Integer.parseInt(s.split(" ")[0]), Integer.parseInt(s.split(" ")[1])};
		int [] b = {Integer.parseInt(s1.split(" ")[0]), Integer.parseInt(s1.split(" ")[1])};
		int [] c = {Integer.parseInt(s2.split(" ")[0]), Integer.parseInt(s2.split(" ")[1])};
		int x=0;
		int y=0;
		if(a[0]==b[0]) {
			x=c[0];
		}
		else if(a[0]==c[0]) {
			x=b[0];
		}
		else {
			x=a[0];
		}
		
		if(a[1]==b[1]) {
			y=c[1];
		}
		else if(a[1]==c[1]) {
			y=b[1];
		}
		else {
			y=a[1];
		}
		sb.append(x + " ").append(y);
		System.out.println(sb);
	}

}
