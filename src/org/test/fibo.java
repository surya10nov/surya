package org.test;

public class fibo {
	public static void main(String[] args) {
		int n=10,a=0,b=1;
		int sum;
		for (int i = 1; i <=n; i++) {
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
			
		}
	}

}
