package com.jsp.project;


import java.util.ArrayList;
import java.util.Scanner;

public class Account {
	private String email;
	private String phno;
	private String pwd;
	private String gender;
	private String name;
	private int addr_count;
	private Address address;
	private ArrayList<Address> a1=new ArrayList<Address>();
	private static ArrayList<Account> user=new ArrayList<Account>();
	private Product[] cart=new Product[10];
	private Product[] wishlist=new Product[10];
	private int item_count;
	private int wish_count;
	private static int user_count;
	private int v=0;
	private int r;
	static Scanner scan=new Scanner(System.in);
	public static void thread(){
		try{System.out.println("payment under process \n\nyou are in a secure gateway\n\n"
				+ "verifying your payment\n");
		for(int i=0;i<=15;i++) {
			System.out.print("."+" ");
			Thread.sleep(300);}

			System.out.println();
			System.out.println();
				Thread.sleep(1000);}
			catch (InterruptedException e) {
				e.printStackTrace();
			}	
	}
	public static void start() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("welcome to app");
		System.out.println("--------------------------------------------------------------------------------");
		Thread.sleep(500);
		System.out.println("If you are new enter 1 to create account\n2 to login");
		if(scan.nextInt()==1)
		createacc();
		else
			{System.out.println("enter phone number");
			String phno1=scan.next();
			while(!(checklen(phno1) && checkchar(phno1)))
			{
				System.out.println("please enter proper phone number");
				phno1=scan.next();
			}
		boolean j=false;
		for(int i=0;i<user.size() && user.get(i)!=null;i++)
		{if(user.get(i).phno.equals(phno1) && user.get(i).pwd!=null)
			{j=true;
			user.get(i).login();}}
		if(j==false)
			{System.out.println();
			System.out.println("user does not exist");
			System.out.println();
			createacc();
			}
		}
	}
	static private  boolean checklen(String x) {
		if(x.length()==10)
		return true;
		return false;
	}
	static private  boolean checkchar(String y) {
		for(int i=0;i<y.length();i++)
		{
			if(y.charAt(i)>=48 && y.charAt(i)<=57)
				continue;
			else
			{
				return false;
			}
		}
		return true;
	}

	private  static void createacc() throws InterruptedException{
	Thread.sleep(700);
	System.out.println();
	System.out.println("enter the following details to create account");
	System.out.println();
	System.out.println("enter phone number");
	String phno1=scan.next();
	while(!(checklen(phno1) && checkchar(phno1)))
	{
		System.out.println("please enter proper phone number");
		phno1=scan.next();
	}
		for(int i=0;i<user.size() && user.get(i)!=null;i++) {
			if(user.get(i).phno.equals(phno1) && user.get(i)!=null ) {
				System.out.println("user already exists please login");
				user.get(i).login();
			}
			else {
				break;
			}
		}
	user.add(user_count,new Account());
	user.get(user_count).phno=phno1;
	System.out.println("enter your name");
	user.get(user_count).name=scan.next();

	System.out.println("enter your email id name");
	user.get(user_count).email=scan.next();
	while(!(((user.get(user_count).email.contains(".com")||user.get(user_count).email.contains(".COM")) && user.get(user_count).email.contains("@")) && ((user.get(user_count).email.contains("gmail")||user.get(user_count).email.contains("GMAIL")) || (user.get(user_count).email.contains("yahoo")||user.get(user_count).email.contains("YAHOO"))))) {
		System.out.println("please enter a proper email id");
		user.get(user_count).email=scan.next();
	}
	System.out.println("enter the gender : male/female/other");
	user.get(user_count).gender=scan.next();
	System.out.println("enter address");
	System.out.println();
	user.get(user_count).a1.add(user.get(user_count).addr_count,new Address());
	user.get(user_count).a1.get(user.get(user_count).addr_count).add_adr();
	user.get(user_count).addr_count++;
	System.out.println("enter new password");
	user.get(user_count).pwd=scan.next();
	System.out.println("Confirm passward");
	while(true) {
		if(scan.next().equals(user.get(user_count).pwd))
			break;
		System.out.println("enter the pre entered password");
	}
	System.out.println();
	System.out.println("account creation succesful\n--------------------------------------------------------------------------------"
			+ "\nlogin to start shopping");
	user_count++;
	System.out.println();
	System.out.println("enter phone number");
	System.out.println("****");
	user.get(user_count-1).login();

	}
	private  void login() throws InterruptedException {
		Thread.sleep(700);
		System.out.println("\nenter password");
		String pwd1=scan.next();
		for(int i=0;i<user.size() && user.get(i)!=null;i++)
		{if(pwd.equals(pwd1)) {
			System.out.println();
			System.out.println("hai "+"\""+name+"\""+" you have logged in successfully");
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println();
			prod_selection();
			}
			else
			{System.out.println();
			Thread.sleep(700);
				System.out.println("you have entered wrong passward");
			System.out.println("enter 1 to reenter the passward\n "
					+ "enter 2 if you have forgot the passward");
			if(scan.nextInt()==1)
				login();
			else
			forgotpwd();}
			}
		}
	private  void forgotpwd() throws InterruptedException {
		Thread.sleep(700);
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("welcome to passward reset page\n\n");
		Thread.sleep(700);
		System.out.println("phone no : ****\n\n");
		Thread.sleep(700);
		int o;
		while(true) {
		o=otp();
		if(o==0) {
			Thread.sleep(700);
			System.out.println("user verified\n");
			Thread.sleep(500);
			break;}
		}
		System.out.println("enter the new password");
		pwd=scan.next();
		System.out.println("password reset successfully\n");
		Thread.sleep(700);
		System.out.println("please login with the new password to start shopping");
		login();
	}
	private  void prod_selection() throws InterruptedException{
		Thread.sleep(900);
		int w;
		do{	Thread.sleep(700);
			System.out.println("What are you searching for?");
			String a=scan.next();
		switch(a) {
		case "shoes":
			Shoes s1=new Shoes();
			cart[item_count]=s1;
			s1.select_specs();
			item_count++;
			break;
		case "clothes":
			Clothes s2=new Clothes();
			cart[item_count]=s2;
			s2.select_specs();
			item_count++;
			break;
		case "cosmetics":
			Cosmetics s3=new Cosmetics();
			cart[item_count]=s3;
			s3.select_specs();
			item_count++;
			break;
		case "electronics":
			System.out.println("presently we have smart phones and headphones\n what are you looking for\n");
		    String ele=scan.next();
		    if(ele.equalsIgnoreCase("Headphones"))
		    {
		    Headphones s4=new Headphones();
		    cart[item_count]=s4;
		    s4.select_specs();
		    item_count++;}
		    else {
		      Mobile s5=new Mobile();
		      cart[item_count]=s5;
		      s5.select_specs();
		      item_count++;
		    }
		    break;	
		default:
			System.out.println("sorry,item not found!!!\nwe are trying our best\npresently we have shoes,clothes,cosmetics,electronics");
		}
		System.out.println();
		scan.nextLine();
		System.out.println();
		System.out.println("to add another item press 1 else\n"
				+ " to move to cart press 2 ");
		w=scan.nextInt();
		
		}while(w==1);
		System.out.println();
		System.out.println();
		cart();}
		
	private  void cart() throws InterruptedException {
		Thread.sleep(900);	
		System.out.println("The items in the cart are :");
			System.out.println("--------------------------");
			if(cart[0]==null) {
				System.out.println("your cart is empty!!!!!");
				System.out.println();
				System.out.println();
				Thread.sleep(500);
				System.out.println("take a glance at your wishlist");
				System.out.println("--------------------------------");
				System.out.println();
				for (int i=0,count=1;i<wishlist.length && wishlist[i]!=null;i++) 
				{
				System.out.println("item number : "+count);
				wishlist[i].show_details();
				count++;
				}
				System.out.println("enter 1 to add items\n"
						+ "press 2 to add from wishlist"
						+ "\npress 3 to logout");
				switch(scan.nextInt()) {
				case 1:prod_selection();
				case 2:System.out.println("enter which one to add to cart");
					   wishto_cart(scan.nextInt()-1);
					   cart();
				case 3:logout();
				}
				
			}
			
			for (int i=0,count=1;i<cart.length && cart[i]!=null;i++) 
				{
				System.out.println("item number : "+count);
				cart[i].show_details();
				count++;
				}
			Thread.sleep(800);
			System.out.println();
			System.out.println("take a glance at your wishlist");
			System.out.println("--------------------------------");
			System.out.println();
			for (int i=0,count=1;i<wishlist.length && wishlist[i]!=null;i++) 
			{
			System.out.println("item number : "+count);
			wishlist[i].show_details();
			count++;
			}
			Thread.sleep(500);
			int sum=0;
			for (int j=0;j<cart.length && cart[j]!=null;j++) 
				sum=sum+cart[j].amt;
			r=sum;
			System.out.println("----------------------------------------");
			System.out.println("grand total(free delivery) = "+(int)sum+" rs");
			System.out.println("----------------------------------------");
			System.out.println();
			while(true) {
			System.out.println("enter 'new30' to use the summer coupon of 30% discount(only for new users)\n"
					+ "enter 'off10' to use special discount\n"
					+ "if coupon not required enter 'none' ");
			String q=scan.next();
			if(q.equalsIgnoreCase("new30")) {
				if(v==0)
				{System.out.println();
				System.out.println("--------------------------------------------------");
				System.out.println("amount to be paid after discount : "+(int)(0.7*sum)+" rs");
				r=(int)(0.7*sum);
				System.out.println("--------------------------------------------------");
				System.out.println();
				break;
				}
				else
					{System.out.println("coupon not applicable \n please try another coupon");
					System.out.println();
					}
					}
			else if(q.equalsIgnoreCase("off10")) {
				System.out.println();
				System.out.println("--------------------------------------------------");
				System.out.println("amount to be paid after discount : "+(int)(0.9*sum)+" rs");
				System.out.println("--------------------------------------------------");
				System.out.println();
				r=(int)(0.9*sum);
				break;
			}
			else {
				System.out.println();
				System.out.println("--------------------------------------------------------");
				System.out.println("amount to be paid(delivery charge 50) : "+(int)(sum+50)+" rs");
				System.out.println("--------------------------------------------------------");
				System.out.println();
				r=sum+50;
				break;
			}}
			System.out.println(
			   "press 1 to add more items to cart\n"+"press 2 if you want to remove some items from your cart\n"
							+ "press 3 to move items to wishlist"
							+ "\npress 4 to edit your wishlist"
							+ "\npress 5 to logout"+"\npress 6 to select address and place order");
			int b=scan.nextInt();
			if(b==1)
				prod_selection();
			else if(b==2)
			{
				do{Thread.sleep(500);
				if(cart[0]==null)
				{System.out.println("your cart is empty!!!!");
				System.out.println();
				System.out.println();
				break;}
				System.out.println();
					System.out.println("enter the count of the item you want to remove");
					
				System.out.println("The items in the cart are :");
				System.out.println("--------------------------");
			  for (int i=0,count=1;i<cart.length && cart[i]!=null;i++) 
				{
				System.out.println("item number : "+count);
				cart[i].show_details();
				count++;
				}
				int x=scan.nextInt();
				deletecart(x-1);
				System.out.println("If you want to edit furthur press 1 else press 2");	
				}while(scan.nextInt()==1);
				cart();
			}
			else if(b==3) {
				
				do{Thread.sleep(500);
					if(cart[0]==null)
					{System.out.println("your cart is empty!!!!");
					System.out.println();
					System.out.println();
					break;}
					System.out.println();
				   System.out.println("The items in the cart are :");
					System.out.println("--------------------------");
				  for (int i=0,count=1;i<cart.length && cart[i]!=null;i++) 
					{
					System.out.println("item number : "+count);
					cart[i].show_details();
					count++;
					}
				  System.out.println();
				  System.out.println("enter count of item which you want to add to wishlist");
				   addwishlist(scan.nextInt()-1);
				   System.out.println("press 1 if you want to add another item wishlist\n"
			   	       		+ "press 2 to go to cart");}while(scan.nextInt()==1);
				cart();
			}
			else if(b==4){
				System.out.println();
				do{Thread.sleep(500);
					System.out.println("To add an item from wishlist to cart press 1\n"
						+ "to delete an item from wishlist press 2");
				switch(scan.nextInt()) {
				case 1:System.out.println();
						if(wishlist[0]==null)
							{System.out.println("wishlist is empty");
							System.out.println();
							System.out.println();
							cart();
							}
						else {
				   	  
				   	System.out.println();
					System.out.println("take a glance at your wishlist");
					System.out.println("--------------------------------");
					System.out.println();
					for (int i=0,count=1;i<wishlist.length && wishlist[i]!=null;i++) 
					{
					System.out.println("item number : "+count);
					wishlist[i].show_details();
					count++;
					}
					System.out.println();
					 System.out.println("enter count of item which you want to move to cart");
				   	   wishto_cart(scan.nextInt()-1);
				   	   System.out.println("press 1 if you want to edit continue to edit wishlist\n"
			   	       		+ "press 2 to go to cart");}
				   	   break;
				case 2:System.out.println();
						if(wishlist[0]==null) 
							{System.out.println("wishlist is empty");
							System.out.println();
							System.out.println();
							cart();}
						else {
			   	    System.out.println();
			   		System.out.println("take a glance at your wishlist");
			   		System.out.println("--------------------------------");
			   		System.out.println();
			   		for (int i=0,count=1;i<wishlist.length && wishlist[i]!=null;i++) 
			   		{
			   		System.out.println("item number : "+count);
			   		wishlist[i].show_details();
			   		count++;
			   		}
			   		System.out.println();
			   	 System.out.println("enter count of item which you want to remove");
			   	       delwishlist(scan.nextInt()-1);
			   	       System.out.println();
			   	       System.out.println("press 1 if you want to continue editing wishlist\n"
			   	       		+ "press 2 to go to cart");}
			   	       break;
			   	       
				}
				}while(scan.nextInt()==1);
				cart();	
			}
			else if(b==5) {
				logout();
			}
			else
			
			{Thread.sleep(500);
			System.out.println();
			System.out.println("delivery address");
			for(int i=0,count=1;i<a1.size() && a1.get(i)!=null;i++) {
				System.out.println(count);
				a1.get(i).show_add();	
				System.out.println();
				count++;
			}
			System.out.println();
			System.out.println("enter 1 to select from availeble addressses and proceed to payment\n"
					+ "enter 2 to get your order in new address"
					+ "\nenter 3 to logout");
			switch(scan.nextInt()) {
			case 1:
				System.out.println("choose the address to which you want the delivery");
				address=a1.get(scan.nextInt()-1);
				payment();
				break;
			case 2:
				a1.add(addr_count,new Address());
				a1.get(addr_count).add_adr();
				address=a1.get(addr_count);
				addr_count++;
				payment();
				break;
			case 3:
				logout();
				break;
			}}
			
			
	}
	private  void payment() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("welcome to the payment page");
		System.out.println();
		System.out.println("enter 1 for cash on delivery \n"
				+ " enter 2 to pay through card\n"+"enter 3 for Upi payment");
		int a=scan.nextInt();
		scan.nextLine();
		System.out.println();
		switch(a) {
		case 1:
			v=1;
			System.out.println("amount to payed at delivery : "+r);
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println();
			Thread.sleep(100);
			for(int i=0;i<=15;i++) {
				System.out.print("."+" ");
				Thread.sleep(300);}
			Thread.sleep(800);
			System.out.println();
			System.out.println();
			System.out.println("order placed successfully");
			Thread.sleep(800);
			System.out.println();
			System.out.println("product will be delivered within 4 working days"
					+ "\nto address : \n");
			address.show_add();
			break;
		case 2:v=1;
			   System.out.println("Enter the card holder name");
		   	   scan.next();
			   while(true) {
			   System.out.println("Enter the card number..");
			   String cnumber = scan.next();
			   if(checkchar(cnumber) && cnumber.length()==16)
				   break;
			   else
				   System.out.println("enter proper card number");
				   }
			   System.out.println("enter the validity date in format mm/yy");
			   scan.next();
			   while(true) {
			   System.out.println("enter the cvv number");
			   String cvv= scan.next();
			   if(checkchar(cvv) && cvv.length()==3)
				   break;
			   else
				   System.out.println("enter proper cvv");
				   }
			   Thread.sleep(1000);
			   System.out.println();
			   System.out.println("card details verified!!");
			   Thread.sleep(1000);
			   System.out.println();
			   while(true) {
					int o=otp();
					if(o==0) {
						Thread.sleep(700);
						System.out.println("user verified\n");
						Thread.sleep(500);
						break;}
					}
			   thread();
				Thread.sleep(800);
			   System.out.println("card payment successfull");
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("order placed successfully");
				Thread.sleep(800);
				System.out.println();
				System.out.println("product will be shipped within 4 working days"
						+ "\nto address : \n");
				address.show_add();
			   break;
			
		case 3:
			v=1;
			System.out.println("enter 1 - phonepay\nenter 2 - googlepay\nenter 3 - Paytm");
			scan.next();
			System.out.println();
			System.out.println("enter the upi address");
			scan.next();
			Thread.sleep(800);
			System.out.println();
			System.out.println("upi address verified\n\nrequest sent for payment");
			System.out.println();
			thread();
			Thread.sleep(800);
			System.out.println("upi payment successfull");
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("order placed successfully");
			Thread.sleep(800);
			System.out.println();
			System.out.println("product will be shipped within 4 working days"
					+ "\nto address : \n");
			address.show_add();
			break;
		}
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println();
		logout();
	}
	private  void logout() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("press 1 to clear cart before logout\n press 2 to just logout");
		int e=scan.nextInt();
		if(e==2)
			System.out.println("logout sucessful");
		else
			{clear_cart();
			item_count=0;
		System.out.println("you are logged out sucessfully");}
		System.out.println();
		System.out.println("please help us improve by rating our app");
		System.out.println("1 : poor\t2 : ok\t3 : good\t4 : verygood\t5 : excellent");
		System.out.print("-->");
		scan.nextInt();
		Thread.sleep(900);
		System.out.println("thank you visit again_/\\_");
		System.out.println();
		System.out.println();
		Thread.sleep(800);
		System.out.println("In case of any issue with our products delivered \nplease contact our dedicated returns and customer greivance team at ---> minikart@gmail.com");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		Thread.sleep(2000);
		start();
	}
	private  void clear_cart() {
		for(int i=0;i<cart.length;i++) {
			cart[i]=null;
		}
	}
	private  void deletecart(int x) {
	  if(item_count==0) {
		System.out.println("\ncart is already empty\n");
		return;
	}
		cart[x]=null;
		Product[] y=new Product[100];
		for(int i=0,j=0;i<cart.length;i++) {
			if(cart[i]!=null) {
			y[j]=cart[i];
			j++;}}
		clear_cart();
		for(int z=0;z<y.length && y[z]!=null;z++) {
			cart[z]=y[z];
		}
		item_count--;
	}
	private  void addwishlist(int x) {
		wishlist[wish_count]=cart[x];
		deletecart(x);
		wish_count++;
		}
	private  void delwishlist(int x) {
		wishlist[x]=null;
		Product[] y=new Product[100];
		for(int i=0,j=0;i<wishlist.length;i++) {
			if(wishlist[i]!=null) {
			y[j]=wishlist[i];
			j++;}}
		for(int w=0;w<wishlist.length;w++) {
			wishlist[w]=null;
		}
		for(int z=0;z<y.length && y[z]!=null;z++) {
			wishlist[z]=y[z];
		}
		wish_count--;
	}
	private  void wishto_cart(int x) {
		cart[item_count]=wishlist[x];
		wishlist[x]=null;
		delwishlist(x);
		item_count++;
	}
		
	private int otp() throws InterruptedException {
		Thread.sleep(500);
	System.out.println("otp sent to your mobile number\n");
	int otp=(int)(Math.random()*10000)+10000;
	Thread.sleep(800);
	System.out.println("your otp is : "+otp);
	int otp1;
	int otp_c;
	otp_c=0;
	Thread.sleep(500);
	System.out.println("enter the 5 digit otp : ");
	while(true) {
		otp1=scan.nextInt();
		if(otp1==otp) {
			return 0;
		}
		else {
		otp_c++;
		
		if(otp_c>=3) {
			System.out.println("\n\notp attempts exceeded!!!!\nTry with new otp\n\n");
			Thread.sleep(900);
			return 1;
			
			}
		System.out.println("enter the correct otp");}
	}}

}
