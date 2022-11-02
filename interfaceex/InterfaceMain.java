package interfaceex;

 

import java.util.Scanner;

 

public class InterfaceMain {

 

    public static void main(String[] args) {

 

        
        Bounceable bref;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color of ball:-");
                        
        String c = sc.next();
        
        bref = new Ball(c);  //2
        
        System.out.println("Enter bounce factor multiple for ball:-");
        
        int multiple = sc.nextInt();
        
        meth(bref,multiple);
        
        
        

 

    }
    
    
    public static void meth(Bounceable b,int multiple)
    {
        b.setBounceMultiple(multiple);
        b.bounce();
        
    }

 

}