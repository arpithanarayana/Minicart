package com.jsp.project;

public class Clothes extends Product
{
	private String[] b1= {"dnmx","lee cooper","Raymonds","levis","Allen solly","peter england","buffalo","Duke","siaram","max","tortoise"};
	private String size;
	private String gender;
	private String type;
	  int d,b_index;
	    @Override
	    void select_specs() {
	      prod_name="clothes";
	      System.out.println("which brand are you looking for!!");
	      System.out.println("enter the brand");
	      System.out.println("you may consider these popular brands\ndnmx\tlevis\tduke");
	      do{
	        brand=scan1.nextLine();
	        for(int i=0;i<b1.length;i++) {
	        if(b1[i].equalsIgnoreCase(brand)) {d=1;b_index=i;
	          break;}}
	        try{if(d==0) 
	          brand(brand,b1);
	          else 
	            break;}
	        catch(Exception ie) {
	          System.out.println("please enter atleast 3 characters for brand");
	          ie.printStackTrace();
	          select_specs();
	        }
	          
	      }while(d==0);
	      System.out.println("you need clothes of men/women/child");
	      gender=scan1.next();
	      System.out.println("enter the type of cloth you need ex:shirt/pant etc");
	      type=scan1.next();
	      System.out.println("enter the size: small or large or medium");
	      size=scan1.next();
	      if(size.equals("small")) 
	        amt=645+b_index*95;
	      else if(size.equals("medium"))
	          amt=709+b_index*124;
	      else 
	        amt=907+b_index*156;
	    }

	    @Override
	    void show_details() {
	      System.out.println("Item : "+prod_name);
	      System.out.println("brand : "+brand);
	      System.out.println("gender : "+gender);
	      System.out.println("type of clothes: "+type);
	      System.out.println("size : "+size);
	      System.out.println("cost----->"+amt);
	      System.out.println();
	      System.out.println();
	    }

}
