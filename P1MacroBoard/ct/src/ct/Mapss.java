package ct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class Mapss {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int num = Integer.parseInt(s.split(" ")[0]);
		int result = Integer.parseInt(s.split(" ")[1]);
		Map<String,Integer> hs = new HashMap<>();
		Map<Integer,String> hs2 = new HashMap<>();
		for(int i=1 ;i<=num; i++) {
			String pok = br.readLine();
			hs.put(pok,i);
			hs2.put(i, pok);
		}
		for(int i=0; i<result; i++) {
			String str = br.readLine();
			if(str.charAt(0)>=65) {
				System.out.println(hs.get(str));
			}
			else {
				System.out.println(hs2.get(Integer.parseInt(str)));
			}
		}

		

	}

}
