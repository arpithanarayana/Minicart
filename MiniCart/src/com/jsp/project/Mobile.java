package com.jsp.project;

import java.util.HashMap;
import java.util.Map.Entry;

public class Mobile extends Product 
{
	private String[] b1= {"oppo","one+","samsung","apple","vivo","xiaomi","nokia","moto","realme","lenovo"};
    private String item;
      int d,b_index;
        @Override
        void select_specs() {
          prod_name="smart phones";
          System.out.println("which brand are you looking for!!");
          //System.out.println("enter the brand");
          System.out.println("you may consider these popular brands\noppo\tsamsung\tapple");
          do{
            brand=scan1.next();
            for(int i=0;i<b1.length;i++) {
            if(b1[i].equalsIgnoreCase(brand)) {d=1;b_index=i;
              break;}}
            if(d==0) 
              brand(brand,b1);
              else 
                break;
          }while(d==0);
         HashMap<String,String> h1=new HashMap<String,String>();
         h1.put("oppo","we have Models : A1,A1 PRO,A2");
        h1.put("one+","we have Models : C1,C2,C3");
        h1.put("apple","we have Models : D1,D1 pro,D1 pro max");
        h1.put("vivo","we have Models : A3,A2 mini,G7 max");
        h1.put("xiaomi","we have Models : x3,x2,G5 pro");
        h1.put("nokia","we have Models : n3 pro,n2 max,n4");
        h1.put("moto","we have Models : A3 air,A2 max,G7+");
        h1.put("realme","we have Models : r3 ,r1,r4");
        h1.put("lenovo","we have Models : A3+,A2,G7 pro");
        System.out.println("Choose the model");
        for(Entry<String,String> m : h1.entrySet()) {
          if(m.getKey().equalsIgnoreCase(brand))
          System.out.println(m.getValue());
        }    
          item=scan1.next();
          System.out.println("Which color you want\t" + "Black\t" + "Blue\t" + "White\t" + "blue\t");
          color = scan1.next();
        amt = color.charAt(0)*100 + item.charAt(1)*35+b_index*10000;
          
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
