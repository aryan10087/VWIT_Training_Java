package HashSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        Set<Employee1> st = new HashSet<Employee1>();
        
        Employee1 e1 = new Employee1("Harshit",101,50000);
        
        st.add(e1);
        
        Employee1 e2 = new Employee1("Himanshu",102,60000);
        
        st.add(e2);
        
        st.add(new Employee1("Harshit",101,50000));
        st.add(new Employee1("Hardik",103,50000));
        
        
        System.out.println(st);
        System.out.println(st.size());

    }

}
