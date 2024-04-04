package MandN3;

import java.util.Scanner;

public class MandN3 {
	
	static int arr[];
	static boolean bool[];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		arr = new int[n2];
		bool = new boolean[n1];
		
		dfs(n1, n2, 0);
		System.out.print(sb);
	}
	
	public static void dfs(int n1, int n2, int depth) {
		
		if(n2 == depth) {
			for(int i : arr) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < n1; i++) {
			if(!bool[i]) {
				arr[depth] = i + 1;
				dfs(n1, n2, depth + 1);
				bool[i] = false;
			}
		}
	}

}
