package jdbc;

 

import java.sql.*;

 


public class SqlCon {

 

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
            
            
            //step 3: get statement object from Connection
              Statement st = con.createStatement();
              
              
              //step 4: fire/execute query on Statement object and collect the ResultSet object 
              ResultSet rs = st.executeQuery("Select * from emp_system");
              
            //step 5: Iterate through the ResultSet top fetch the rows  
              while(rs.next())
              {
                  //step 6: Use Resultset- getxxxx(column no) tpo fetch particular column value
 int id = rs.getInt(1);
                  
                  String address = rs.getString(2);
                  
                  String email = rs.getString(3);
                  
                  System.out.println("id="+id+", address="+address+", email="+email);
              }
              
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