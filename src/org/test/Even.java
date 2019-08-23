package org.test;

import java.util.Scanner;

public class Even {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int count=0;
	for (int i = 0; i <=n; i++) {
		if(i%2==0)
		{
			count=count=i;
		}
		
	}
	System.out.println(count);
}
}
