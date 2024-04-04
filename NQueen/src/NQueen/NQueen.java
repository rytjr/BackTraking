package NQueen;

import java.util.*;

public class NQueen {
	
	static int arr[];
	static int count = 0;
	static int n1;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		
		arr = new int[n1];
		
		dfs(0);
		System.out.print(count);
		
	}
	
	public static void dfs(int depth) {
		if(depth == n1) {
			count++;
			return;
		}
		
		for(int i = 0; i < n1; i++) {
			arr[depth] = i;
			if(chase(depth)) {
				dfs(depth + 1);
			}
		}
	}
	
	public static boolean chase(int depth) {
		
		for(int i = 0; i < depth; i++) {
			
			if(arr[depth] == arr[i]) {
				return false;
			}
			else if(Math.abs(depth - i) == Math.abs(arr[depth] - arr[i])) {
				return false;
			}
			
		}
		return true;
	}

}
