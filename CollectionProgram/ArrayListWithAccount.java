package CollectionProgram;

import java.util.*;

public class ArrayListWithAccount {

	
	public static void main(String[] args) {
		

		List<Account> list = new ArrayList<Account>();
		
		Account a = new Account("Dipak More", 10023, 34000);
		Account a1  = new Account("Mayur", 10025, 35000);
		Account a2  = new Account("Mayur", 10025, 35000);
		list.add(a);
		list.add(a1);
		list.add(new Account("Pankaj",23039,50000));
		list.add(new Account("Vikas", 233535, 34500));
		list.add(a1);
		list.add(new Account("Pankaj",23039,50000));
		
		boolean isPresent = list.contains(a1);
		System.out.println("Mayur has already created the account: "+isPresent);
		
		 boolean ans =  a1.equals(a2);
		 System.out.println("a1 object and a2 both are represent single customer: "+ans);
		
	}
}
