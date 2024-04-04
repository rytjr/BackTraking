package MandN4;

import java.util.*;

public class MandN4 {
	
	static int arr[];
	static boolean bool[];
	
	static int n1, n2;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		arr = new int[n2];
		bool = new boolean[n1];
		
		dfs(1, 0);
	}
	
	public static void dfs(int at, int depth) {
		if(n2 == depth) {
			for(int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < n1; i++) {
			if(!bool[i]) {
				arr[depth] = i + 1;
				dfs(at + 1, depth + 1);
				bool[i] = false;
			}
		}
		/*if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
 
		for (int i = at; i <= N; i++) {
			arr[depth] = i;
			dfs(i, depth + 1);
		}*/
	}

}
