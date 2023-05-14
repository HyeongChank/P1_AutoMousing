package ct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class ConDiv {

	public static void main(String[] args) throws IOException{
		Scanner kb = new Scanner(System.in);
		BigInteger bi = new BigInteger(kb.next());
		BigInteger bi2 = new BigInteger(kb.next());
		bi = bi.add(bi2);
		System.out.println(bi);
		
		
	}

}
