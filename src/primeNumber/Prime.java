package primeNumber;

import java.util.Scanner;

public class Prime {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0, i = 2, x = 0;
		while(x!=n) {
			count = 0;
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 0) {
				x++;
				System.out.print(i+" ");
			}
			i++;
		}
		sc.close();
	}
}
