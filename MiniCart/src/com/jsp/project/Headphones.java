package com.jsp.project;

import java.util.HashMap;
import java.util.Map.Entry;

public class Headphones extends Product
{
	private String[] b1= {"Boat","Noise","titan","bose","scull candy","jbl","leaf","zebronics","portronics","iball","sony"};
	private String item;
	  int d,b_index;
	    @Override
	    void select_specs() {
	      prod_name="headphones";
	      System.out.println("which brand are you looking for!!");
	      System.out.println("enter the brand");
	      System.out.println("you may consider these popular brands\nboat\tscull candy\tjbl");
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
	      HashMap<String,String> h1 = new HashMap<String,String>();
			h1.put("Boat" , "We have models : A1,A2,A3,A4");
			h1.put("Noise" , "We have models : N1,N2,N3,N4");
			h1.put("titan", "We have models : t1,t2,t3,t4");
			h1.put("bose", "We have models : r1,r2,r3,r4");
			h1.put("scull candy", "We have models : b1,b2,b3,b4");
			h1.put("jbl", "We have models : z1,z2,z3,z4");
			h1.put("leaf", "We have models : y1,y2,y3,y4");
			h1.put("zebronics", "We have models : g1,g2,g3,g4");
			h1.put("portronics", "We have models : j1,j2,j3,j4");
			h1.put("iball", "We have models : h1,h2,h3,h4");
			h1.put("sony", "We have models : l1,l2,l3,l4");
			System.out.println("Choose the model");
	      for(Entry<String,String> m:h1.entrySet())
			{
				if(m.getKey().equalsIgnoreCase(brand))
				{
					System.out.println(m.getValue());
				}				
			}	
	      item=scan1.next();
	      System.out.println("Which color you want\t" + "Black\t" + "Blue\t" + "White\t" + "blue\t");
	      color = scan1.next();
	      amt=color.charAt(0)*1+color.charAt(1)*3+item.charAt(0)+b_index*2;
			amt = color.charAt(0)*1 + item.charAt(1)*3+b_index*10;
	      
	    }

	    @Override
	    void show_details() {
	      System.out.println("type : "+prod_name);
	      System.out.println("brand : "+brand);
	      System.out.println("model : "+item);
	      System.out.println("color of item: "+color);
	      System.out.println("cost----->"+amt);
	      System.out.println();
	      System.out.println();
	    }

}
