package com.jsp.project;

public class Cosmetics extends Product
{
	private String[] b1= {"mamaearth","lakme","loreal","himalaya","lotus","vlcc","nykaa","soultree","patanjali","mac","color bar"};
	private String item;
	  int d,b_index;
	    @Override
	    void select_specs() {
	      prod_name="cosmetics";
	      System.out.println("which brand are you looking for!!");
	      System.out.println();
	      System.out.println("you may consider these popular brands\nmamaearth\tlakme\tloreal");
	      System.out.println();
	      System.out.println("enter the brand");
	      do{
	        brand=scan1.next();
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
	      System.out.println("we have eysshade,nailpolish,lipstick,foundation\n"
	      		+ "what are you looking for");
	      item=scan1.next();
	      System.out.println("which color you want"+"red\t,pink\t,light\t,pink\t,\nbrown\t,cream\t,maroon\t,Nude\t,peach\t");
	      color=scan1.next();
	      amt=color.charAt(0)*1+color.charAt(1)*3+item.charAt(0)+b_index*2;
	      
	    }
	    @Override
	    void show_details() {
	      System.out.println("type : "+prod_name);
	      System.out.println("brand : "+brand);
	      System.out.println("item : "+item);
	      System.out.println("color of item: "+color);
	      System.out.println("cost----->"+amt);
	      System.out.println();
	      System.out.println();
	    }

}
