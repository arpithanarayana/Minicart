package com.jsp.project;
import java.util.*;
public class Utility {
	public static void main(String[] args) {	
		while(true){try {
			Account.start();}
			catch(Exception x)
			{
				System.out.println("please enter proper input");
				x.printStackTrace();
				Account.scan.nextLine();
				Utility.main(null);
			}
		}

	}

}
