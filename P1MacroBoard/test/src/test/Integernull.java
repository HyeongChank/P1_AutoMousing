package test;

import java.util.ArrayList;
import java.util.List;

public class Integernull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer y = 10;
		int c = 190;
		
		List<Integer> lt = new ArrayList<>();
		if( y != null) {
			lt.add(y);
		}
		
		lt.add(c);
		System.out.println(lt.get(1));
		System.out.println(lt.get(0));
		System.out.println(lt);
		
		String delayxy = "123";
		Integer dxy1 = Integer.parseInt(delayxy);
		Integer dxy = dxy1;
		System.out.println(dxy);
//		int y = 10;
//		
//		List<Integer> lt = new ArrayList<>();
//		if(x != (Integer)null) {
//			lt.add(x);
//		}
//		lt.add(10);
//		System.out.println(lt);
	}

}
