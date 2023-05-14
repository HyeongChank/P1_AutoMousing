package ct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongInt {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int aup = Integer.parseInt(s.split(" ")[0]);
		int adown = Integer.parseInt(s.split(" ")[1]);
		String s1 = br.readLine();
		int bup = Integer.parseInt(s1.split(" ")[0]);
		int bdown = Integer.parseInt(s1.split(" ")[1]);
		
		int up = aup*bdown + adown*bup;
		int up_r = up;
		int down = adown*bdown;
		int down_r = down;
		int c =1;
		if(up<down) {
			while(true) {
				if(down%up==0) {
					c = up;
					break;
				}
				else {
					int down1 = down;
					down = up;
					up = down1%up;
				}
			}
		}
		if(up>down) {
			while(true) {
				if(up%down==0) {
					c = down;
					break;
				}
				else {
					int up1 = up;
					up = down;
					down = up1%down;
				}
			}
		}		
		int upof = up_r/c;
		int downof = down_r/c;
		sb.append(upof).append(" ");
		sb.append(downof);
		System.out.println(sb);

	}

}
