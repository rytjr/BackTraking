package MandN2;

import java.util.*;
import java.io.*;

public class MandN2 {
	
	static int arr[];
	static boolean bool[];
	
	static int n1, n2;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		arr = new int[n2];
		bool = new boolean[n1];
		
		dfs(1, n2, 0); 
	}
	
	public static void dfs(int at, int n2, int deep) {
		
		if(n2 == deep) {
			for(int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = at; i < n1; i++) {
			arr[deep] = i;
			dfs(at + 1, n2, deep + 1);
			
		}
	}

}
