package interfaceex;

public class Tyre implements Bounceable{
		
		int velocity;
		private int Tyresize;
		
	 	public Tyre(int size) {
	        super();
	        this.Tyresize=size;
	    }
	   

	    public void size()
	    {
	       System.out.println("Tyre Size is: "+ this.Tyresize);    
	    }
	    
	    
	    public void velocity(int multiple)
	    {
	        
	        this.velocity = Bounceable.BOUNCE_FACTOR * multiple;
	        
	    }
	
}
