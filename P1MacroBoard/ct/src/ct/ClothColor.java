package ct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClothColor {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int c1 = Integer.parseInt(s.split(" ")[0]);
		int c2 = Integer.parseInt(s.split(" ")[1]);
		
		System.out.println(c1*c2/gcd(c1, c2));

	}
	private static int gcd(int c1, int c2) {
		while(c1 != 0) {
			int ne = c2%c1;
			c2 = c1;
			c1 = ne;
		}
		return c2;
	}


}
