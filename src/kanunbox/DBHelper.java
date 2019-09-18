
package kanunbox;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;


public class DBHelper {
    private Connection con;
    private int role;
    public boolean isConnected(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

               // String userName = "sa";
                //String password = "XX432I9vk";
                String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=KanunBox;user=sa;password=XX432I9vk";
                con = DriverManager.getConnection(connectionUrl);
                
                return true;
        } catch(Exception e){
            //System.out.println("Error Occured");
            e.printStackTrace();
        }
    
        return false;
    }
    
public int getData(String s1, String s2) throws SQLException{
            try{
                
                String query = "SELECT * FROM [tbl_user] WHERE name='"+s1+"' AND password='"+s2+"'";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                    role = rs.getInt(3);
                    return role;
                }
                
               con.close();
            } catch(Exception e){
                e.printStackTrace();
            }
            return role;
}

public boolean insertEmployee(String name, String address, Date dob, Date joinDate, String contactNo, String email, String photo, String post, int role){
    try{
        PreparedStatement stmt=con.prepareStatement("INSERT INTO tbl_employee VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)"); 
        stmt.setString(1, name);
        stmt.setString(2, address);
        stmt.setDate(3, dob);
        stmt.setString(4, contactNo);
        stmt.setString(5, email);
        stmt.setString(6, photo);
        stmt.setString(7, post);
        stmt.setDate(8, joinDate);
        stmt.setInt(9, role);
       int i = stmt.executeUpdate();
       con.close();
        System.out.println(i+" Inserted ");
       
    } catch(Exception e){
        e.printStackTrace();
    }
    return false;
}

public ResultSet fetchEmployee() throws SQLException{
    String query = "SELECT email, name, post FROM tbl_employee WHERE post<>'Advocate'";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    return rs;
}

public ResultSet fetchAdvocate() throws SQLException{
    String query = "SELECT email, name, address, contactNo FROM tbl_employee WHERE post='Advocate'";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    return rs;
}
}
    

