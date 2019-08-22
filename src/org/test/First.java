package org.test;

import java.util.Scanner;

public class First {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("start");
	int empId=sc.nextInt();
	System.out.println("enter employee Id:"+empId);
	String name=sc.next();
	System.out.println("employee name" +name);
	String mail=sc.next();
	System.out.println("email id:"+mail);
    long phno=sc.nextLong();
    System.out.println("phone no:" +phno);
    float sal=sc.nextFloat();
    System.out.println("emp salary is:"+sal);
    String gender=sc.next();
    System.out.println("gender is female:"+gender);
    String city=sc.next();
    System.out.println("emp city is :"+city);
}
}
