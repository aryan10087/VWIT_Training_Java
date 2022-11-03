package HashSet;

public class Employee1 {
	
	public String name;
	public int empid;
	public double salary;
	
	
	public Employee1(String naam,int id, double sal) {
		this.name = naam;
		this.empid = id;
		this.salary = sal;
	}
	
	
	 @Override
	    public boolean equals(Object obj)  
	    {
	        
	        System.out.println("emp's equal method:comparing empid="+this.empid+"and empid="+((Employee1)obj).empid);
	        if(obj instanceof Employee1)
	          return this.empid == ((Employee1)obj).empid;
	        else
	          return false;
	    }
	    
	    
	    @Override
	    public int hashCode()
	    {
	        System.out.println("hashCode of this employee with empid:"+this.empid+" is :"+this.empid);
	        return this.empid;
	    }
	
	

}
