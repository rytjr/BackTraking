package pibonach;

import java.util.*;

public class pibonach {
	
	static int n1, n2;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		fibonacci(Num);
		pibo(Num);
		
		System.out.print(n1 + " " + (Num - 2));
	}
	
	public static int pibo(int n) {
		
		if (n <= 0)
            return 0;
        else if (n == 1 || n == 2) {
        	n1++;
            return 1;
        }
        else
            return (pibo(n - 1) + pibo(n - 2));
	}
	public static int fibonacci(int n) {
		
        if (n <= 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        int[] f = new int[n + 1];
        f[1] = f[2] = 1;

        for (int i = 3; i <= n; i++) {
        	n2++;
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

}
