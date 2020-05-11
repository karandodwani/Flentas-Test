package com.flentas;

import java.util.Arrays;
import java.util.Scanner;

public class FlentasTest {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Test Cases :");
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			System.out.println("Enter Number of Persons : ");
			int N = sc.nextInt();
			int a[] = new int[N];
			System.out.println("Enter Cost :");
			for (int j = 0; j < N; j++) {
				a[j] = sc.nextInt();
			}
			
			Arrays.sort(a);
			
			long totalSum = 0;

			while (N > 3) {

				totalSum += Math.min(a[0] + 2 * a[1] + a[N - 1], 2 * a[0] + a[N - 1] + a[N - 2]);
				N-= 2;
			}
			if (N == 3)
				totalSum += a[0] + a[1] + a[2];
			else if (N == 2)
				totalSum += a[1];
			else
				totalSum += a[0];
			System.out.println("Minimum Cost is .:"+ totalSum);

		}
		sc.close();
	}
}
