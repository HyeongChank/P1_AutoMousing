package ct;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;


class Stack{
	private int [] stack;
	private int size=0;
	

	public Stack() {

	}
	public Stack(int size) {
		this.size = size;
		stack = new int[size];
	}
	
	
	public int[] getStack() {
		return stack;
	}
	public void setStack(int[] stack) {
		this.stack = stack;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
public class MaxMin {
	
	public void push(int num) {
		stack[size++] = num;

	}
	public void top() {
		if(size==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(stack[size]);
		}
	}
	public void size() {
		System.out.println(size);
	}
	public void empty() {
		if(size==0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
	public void pop() {
		System.out.println(stack[size--]);
	}
	
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		Stack st= new Stack();

		;
		for(int i=0; i<num; i++) {
			switch(kb.next()) {
			case "push" :
				st.push(kb.nextInt());
				break;
			case "top" :
				st.top();
				break;
			case "size" :
				st.size();
				break;
			case "empty" :
				st.empty();
				break;
			case "pop" :
				st.pop();
				break;
		}
			
		}
	}

}

public class MaxMin {
	 
	public static int[] stack;
	public static int size = 0;
 
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = in.nextInt();
 
		stack = new int[N];
		
		for(int i = 0; i < N; i++) {
        
			String str = in.next();
 
			switch (str) {
            
			case "push":
				push(in.nextInt());
				break;
                
			case "pop":
				sb.append(pop()).append('\n');
				break;
                
			case "size":
				sb.append(size()).append('\n');
				break;
                
			case "empty":
				sb.append(empty()).append('\n');
				break;
                
			case "top":
				sb.append(top()).append('\n');
				break;
			}
 
		}
		System.out.println(sb);
	}
 
	public static void push(int item) {
		stack[size] = item;
		size++;
	}
    
	public static int pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int res = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return res;
		}
	}
    
	public static int size() {
		return size;
	}
    
	public static int empty() {
		if(size == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
    
	public static int top() {
		if(size == 0) {
			return -1;
		}
		else {
			return stack[size - 1];
		}
	}
	
}
