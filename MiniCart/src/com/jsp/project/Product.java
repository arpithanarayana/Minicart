package com.jsp.project;
 import java.util.*;
abstract class Product {
	String brand;
	   String prod_name;
	   String color;
	   int amt;
	   int c;
	   abstract void select_specs();
	   abstract void show_details();
	   Scanner scan1=new Scanner(System.in);
	   
	   void brand(String e,String[] b1) {
	     c=0;
		   for(int i=0;i<b1.length;i++) {
	    if(brand.length()>=3 && (b1[i].substring(0,1).equalsIgnoreCase(brand.substring(0,1))||  b1[i].substring(0,1).equalsIgnoreCase(brand.substring(1,2)) || b1[i].substring(0,1).equalsIgnoreCase(brand.substring(2,3)))) {
	    	if(c==0) {System.out.println("\nwe are sorry,we do not have mentioned brand"+ "\nHere are some of the brands that are matching your search \nplease choose among these\n");}
	    	System.out.print(b1[i]+"   \t");
	    	if(c%4==0 && c!=0)
	    	{ System.out.println();
	    	System.out.println();}
	      c++;}}
//	     else
//	    	 continue;}
	     if(c==0)
	     {System.out.println("\nsorry,we don't have it\n"
		           + "you can choose one from these cool brands\n");
	    	 for(int j=1;j<9;j++) {
	          System.out.print(b1[j]+"   \t");
	          if(j%4==0 && j!=0) {
	        	  System.out.println();
	        	  System.out.println();}}
	     }   
	   }

}
