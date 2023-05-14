package ct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int a = Integer.parseInt(s.split(" ")[0]);
		int b = Integer.parseInt(s.split(" ")[1]);
		int [] arr = new int[a];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<a; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(search(arr, a, b));

	}

	private static int search(int[] arr, int a, int b) {
		int sum=0;
		int temp=0;
		for(int i=0; i<arr.length-2;i++) {
			for(int j=i+1; j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					temp = arr[i] + arr[j] + arr[k];
					if(temp==b) {
						return temp;

					}
					if(temp>sum&& temp<b) {
						sum = temp;
					}
				}
			}
		}
		return sum;
		
	}

}
