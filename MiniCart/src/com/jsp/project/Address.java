package com.jsp.project;

import java.util.Scanner;
public class Address {
	private String hno;
	private String street;
	private String area;
	private String city;
	private String dist;
	private String state;
	private int pincode;
	 void add_adr() {
		Account.scan.nextLine();
		System.out.println("house number : ");
		hno=Account.scan.nextLine();
		System.out.println("street : ");
		street=Account.scan.nextLine();
		System.out.println("area : ");
		area=Account.scan.nextLine();
		System.out.println("city : ");
		city=Account.scan.nextLine();
		System.out.println("district : ");
		dist=Account.scan.nextLine();
		System.out.println("state : ");
		state=Account.scan.nextLine();
		System.out.println("pincode : ");
		pincode=Account.scan.nextInt();
	}
	void show_add() {
		System.out.println();
		System.out.println("# "+hno+","+street+",\n"+area+ city+","+
	 dist+","+state+","+pincode);
	}

}
