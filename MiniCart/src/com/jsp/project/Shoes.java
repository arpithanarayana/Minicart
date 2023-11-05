package com.jsp.project;

import java.util.Scanner;


public class Shoes extends Product 
{
	private String[] b1= {"puma","reebok","Fila","bata","paragon","Spark","skechers","nike","Adidas","vkc",};
	private int size;
	private int d,b_index;
    Scanner scan1=new Scanner(System.in);
  @Override
  void select_specs() {
    prod_name="shoes";
    System.out.println("which brand are you looking for!!");
    System.out.println("you may consider these popular brands\npuma\tbata\tsketchers");
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
    System.out.println("enter the size in uk scale: ");
    size=scan1.nextInt();
    if(size<=2) 
      amt=573+b_index*95;
    else if(size>2 && size<=7)
      amt=677+b_index*168;
    else 
      amt=897+b_index*238;
  }

  @Override
  void show_details() {
    System.out.println("Item : "+prod_name);
    System.out.println("brand : "+brand);
    System.out.println("size : "+size);
    System.out.println("cost----->"+amt);
    System.out.println();
    System.out.println();
  }

}
