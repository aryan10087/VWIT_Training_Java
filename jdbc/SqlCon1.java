package jdbc;

 

import java.sql.*;
import java.util.Scanner;

 


public class SqlCon1 {

 

    public static void main(String[] args) {
        
        
        //step 1: register Driver class with DriverManager
         
        try
        {
    //    Class.forName("com.mysql.jdbc.Driver"); //deprecated
        Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        
        //step 2: ask SQL Connection from Driver Manager class, providing connction url,username,password
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?useSSL=false","root","Myfamily@6522");)
        {
            
            
            //step 3: get PreparedStatement object from Connection and pass sql statement to it for pre-compilation
    PreparedStatement st = 
            con.prepareStatement("Select id,name,email from emp_system where id=? and name=?"); //pre-compiled
            
    
            int ct=2;
            Scanner sc = new Scanner(System.in);
            ResultSet rs=null;
            
            while(ct>0)
            {
              
              System.out.println("Enter id:");
              int i = sc.nextInt();
              st.setInt(1,i);
              
              System.out.println("Enter name:");
              String n = sc.next();
              st.setString(2, n);
              
              //step 4: fire/execute query on PreparedStatement object and collect the ResultSet object 
               rs = st.executeQuery();
              
            //step 5: Iterate through the ResultSet top fetch the rows  
              while(rs.next())
              {
                  //step 6: Use Resultset- getxxxx(column no) tpo fetch particular column value
                  int id1 = rs.getInt(1);
                  
                  String name1 = rs.getString(2);
                  
                  String email1 = rs.getString(3);
                  
                  System.out.println("id="+id1+", name="+name1+", email="+email1);
              }
             
              ct--;
            }                  
            
              sc.close();
              rs.close();
              st.close();
            
              //step 6: connection is auto closed as u r using try with resource.
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        
        

 

    }

 

}