package ct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class InCompany {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		HashSet<String> hs = new HashSet<>();
		for(int i=0; i<n ; i++) {
			String s = br.readLine();
			String name = s.split(" ")[0];
			String beha = s.split(" ")[1];
			if(beha.equals("enter")) {
				hs.add(name);
			}
			else {
				hs.remove(name);
			}
		}
		List<String> ls = new ArrayList<>(hs);
		Collections.sort(ls, Collections.reverseOrder());
		for(String s : ls) {
			System.out.println(s);
		}

	}

}
