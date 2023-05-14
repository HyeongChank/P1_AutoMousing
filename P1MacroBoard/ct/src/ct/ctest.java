package ct;

import java.util.Arrays;
import java.util.Scanner;

public class ctest {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int n2 = kb.nextInt();
		int n3 = kb.nextInt();
		int [] arr = {n,n2,n3};
		Arrays.sort(arr);
		if(n==n2&& n==n3) {
			System.out.println(n*1000 + 10000);
		}
		else if(n != n2 && n != n3) {
			System.out.println(arr[2]*100);
		}
		else {
			System.out.println(arr[1]*100 + 1000);
		}
	}

}
