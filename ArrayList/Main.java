package ArrayList;

import java.util.*;
public class Main {
	public static void main(String args[]) {
		Accounts a1 = new Accounts("Harshit",101,1000);
		Accounts a2 = new Accounts("Harshit",101,1000);  
		Accounts a3 = new Accounts("Himanshu",102,2000); 
		Accounts a4 = new Accounts("Hardik",103,3000); 
		Accounts a5 = new Accounts("Devesh",104,4000); 
		Accounts a6 = new Accounts("Dipak",105,5000); 
		
		//Direct Comparing Objects 
		if(a1==a2) {
			System.out.println("Both Pointing to Same Object");
		}
		else if(a1.equals(a2)) {
			System.out.println("Same Object In Application");
		}
		else {
			System.out.println("Different Object");
		}
		
		
		ArrayList<Accounts> allaccounts = new ArrayList<Accounts>();
		allaccounts.add(a1);
		allaccounts.add(a2);
		allaccounts.add(a3);
		allaccounts.add(a4);
		allaccounts.add(a5);
		allaccounts.add(a6);
		System.out.println(allaccounts);
		
		
		//Comparing ArrayList 
		System.out.println(allaccounts.get(0) == allaccounts.get(1));
		System.out.println(allaccounts.get(0).equals(allaccounts.get(1)));
		
	}
	

}
