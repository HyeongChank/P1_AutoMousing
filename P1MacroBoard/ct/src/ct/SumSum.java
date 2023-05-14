package ct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumSum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		for(int i=0; i<a; i++) {
			String s = br.readLine();
			long start = Integer.parseInt(s.split(" ")[0]);
			long end = Integer.parseInt(s.split(" ")[1]);
			long dis = end-start;
			long temp =0;
			long result =1;
			while(true) {
				temp = result*result;
				if(temp >= dis) {
					if(result * (result-1) >=dis) {
						System.out.println(2*result -2);
					}
					else {
						System.out.println(2*result -1);
					}
					break;
				}
				else {
					result++;
				}
			}
		}
	}

}
