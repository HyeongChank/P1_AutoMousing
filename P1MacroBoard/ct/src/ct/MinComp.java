package ct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinComp {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		long a = Integer.parseInt(s.split(" ")[0]);
		long a_r = a;
		long b = Integer.parseInt(s.split(" ")[1]);
		long b_r = b;
		long c =0;
		while(true) {
			
			if(b%a==0) {
				c = a;
				break;
			}
			else {
				long b1 = b;
				b=a;
				a=b1%a;
			}
		}
		System.out.println(a_r*b_r/c);

	}

}
