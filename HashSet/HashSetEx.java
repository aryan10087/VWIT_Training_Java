package HashSet;
import java.util.*;

public class HashSetEx{
	
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	        
	        Set<Employee> st = new HashSet<Employee>();
	        
	        Employee e1 = new Employee(2,"Raj Malhotra",25000,10);
	        
	        st.add(e1);
	        
	        Employee e = new Employee(1,"Anubhav Sinha",15000,10);
	        
	        st.add(e);
	        
	        st.add(new Employee(3,"Sangeeta Shah",35000,20));
	        st.add(new Employee(2,"Raj Malhotra",25000,10));
	        
	        
	        System.out.println(st);
	        System.out.println(st.size());

	    }


}
