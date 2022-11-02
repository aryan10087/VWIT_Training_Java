package CollectionProgram;

import java.util.*;

public class ArrayListDemo2 {

	 public static void main(String[] args)
	    {
	        
	        List<Integer> lst = new ArrayList<Integer>();
	        
	            
	    
	        lst.add(80);  // new Integer(80) -- autoboxing - box the primitve into object type
	        lst.add(30);
	        
	    //    lst.add("java");
	        lst.add(10);
	        lst.add(1);
	        
	        
	         System.out.println(lst);   //lst.toString();
	        
	         System.out.println(lst.size());
	         
	         int no = lst.get(0); //  new Integer(100).intvalue() -- auto-unboxing - unbox Integer object to its primitive value
	         System.out.println("value at index position 0:"+no);
	         
	         System.out.println(lst); 
	         System.out.println(lst.size());
	         
	          lst.remove(0);
	          
	          System.out.println(lst);   
	          System.out.println(lst.size());
	          
	          lst.set(0,130);
	          System.out.println(lst); 
	          System.out.println(lst.size());
	          
	        
	    }
}
