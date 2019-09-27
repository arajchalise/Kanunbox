
package kanunbox;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.sql.Time;


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
       if (i != 0) {
       return true;
       }
       
    } catch(Exception e){
        e.printStackTrace();
    }
    return false;
}

public ResultSet fetchEmployee() throws SQLException{
    String query = "SELECT email, name, post, joinDate FROM tbl_employee WHERE role<>3";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    return rs;
}

public ResultSet fetchAdvocate() throws SQLException{
    String query = "SELECT email, name, address, contactNo FROM tbl_employee WHERE role=3";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    return rs;
}

public boolean createUser(String name, String password, int role){
        
    try{
        PreparedStatement stmt=con.prepareStatement("INSERT INTO tbl_user VALUES(?, ?, ?)"); 
        stmt.setString(1, name);
        stmt.setString(2, password);
        stmt.setInt(3, role);
        int i = stmt.executeUpdate();
        con.close();
        if(i != 0) {
        return true;
        }
    } catch(Exception e){
        e.printStackTrace();
    }
    
    return false;
}

public int countAdvocate() throws SQLException{
    String query = "SELECT count(*) FROM tbl_employee WHERE role=3";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    while(rs.next()){
    return rs.getInt(1);
    }
    return 0;
}

public int insertClients(String name, String address, int age, String occupation, String cont, String ref, int tos) throws SQLException{
    String[] returnID = {"clientId"};
    PreparedStatement stmt = con.prepareStatement("INSERT INTO tbl_clients(name, address, age, occupation, contactNo, referredBy, tos) VALUES(?, ?, ?, ?, ?, ?, ?)", returnID);
    stmt.setString(1, name);
    stmt.setString(2, address);
    stmt.setInt(3, age);
    stmt.setString(4, occupation);
    stmt.setString(5, cont);
    stmt.setString(6, ref);
    stmt.setInt(7, tos);
    int i = stmt.executeUpdate();
    if (i > 0) {
    try(ResultSet rs = stmt.getGeneratedKeys()){
        if(rs.next()){
            return (rs.getInt(1));
        }
    } catch(Exception e){}
    }
    return 0;
}

public int insertCase(String nature, String type, String sub, Date regDate, String regNo, String status, int clientId) throws SQLException{
    String[] returnID = {"caseId"};
    String sql = "INSERT INTO tbl_cases(natureOfCase, typeOfCase, subjectOfCase, regDate, regNo, status, clientId) "
            + "VALUES('"+nature+"', '"+type+"', '"+sub+"', '"+regDate+"', '"+regNo+"', '"+status+"', "+clientId+")";
    PreparedStatement stmt = con.prepareStatement("INSERT INTO tbl_cases(natureOfCase, typeOfCase, subjectOfCase, regDate, regNo, status, clientId) VALUES(?, ?, ?, ?, ?, ?, ?)", returnID);
    stmt.setString(1, nature);
    stmt.setString(2, type);
    stmt.setString(3, sub);
    stmt.setDate(4, regDate);
    stmt.setString(5, regNo);
    stmt.setString(6, status);
    stmt.setInt(7, clientId);
    int i = stmt.executeUpdate();
    if (i > 0) {
    try(ResultSet rs = stmt.getGeneratedKeys()){
        if(rs.next()){
            return (rs.getInt(1));
        }
    } catch(Exception e){}
    }
    return 0;
}

public String getAdvocateId(String name) throws SQLException{
    String query = "SELECT email FROM tbl_employee WHERE name=?";
    
    PreparedStatement st = con.prepareStatement(query);
    st.setString(1, name);
    ResultSet rs = st.executeQuery();
    while(rs.next()){
    return rs.getString(1);
        //System.out.println(rs.getString(1));
    }
    return null;
}

public String getAdvocateName(String id) throws SQLException{
     String query = "SELECT name FROM tbl_employee WHERE email=?";
    
    PreparedStatement st = con.prepareStatement(query);
    st.setString(1, id);
    ResultSet rs = st.executeQuery();
    while(rs.next()){
    return rs.getString(1);
        //System.out.println(rs.getString(1));
    }
    return null;
}

public void insertAdv(String adv, int cases){
    try{
        PreparedStatement stmt = con.prepareStatement("INSERT INTO tbl_advocate_case(caseId, advId) VALUES(?, ?)");
        stmt.setInt(1, cases);
        stmt.setString(2, adv);
        int i = stmt.executeUpdate();
        //System.out.println(i+"Cases");
    } catch(Exception e){
        e.printStackTrace();
    }

}

public void insertAssoc(String name, String address, int inv, int caseId){
    try{
        PreparedStatement stmt = con.prepareStatement("INSERT INTO tbl_assoc(name, address, inv, caseID) VALUES(?, ?, ?, ?)");
        stmt.setString(1, name);
        stmt.setString(2, address);
        stmt.setInt(3, inv);
        stmt.setInt(4, caseId);
        int i = stmt.executeUpdate();
        //System.out.println(i);
    } catch(Exception e){
    }
}

public ResultSet fetchCase(String adv){
try{
    PreparedStatement stmt = con.prepareStatement("SELECT tbl_cases.caseId, tbl_clients.name, tbl_cases.subjectOfCase, tbl_cases.status FROM tbl_cases, tbl_advocate_case, tbl_clients WHERE tbl_cases.caseId = tbl_advocate_case.caseID AND tbl_cases.clientId = tbl_clients.clientId AND advId=?");
    stmt.setString(1, adv);
    ResultSet rs = stmt.executeQuery();
    return rs;
}catch(Exception e){
    e.printStackTrace();
}
return null;
}

public ResultSet fetchCase(int caseId) throws SQLException{
    String query = "SELECT * FROM tbl_cases WHERE caseId="+caseId;
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    return rs;
}

public ResultSet fetchClients(int clientId) throws SQLException{
    String query = "SELECT * FROM tbl_clients WHERE clientId="+clientId;
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    return rs;
}

public ResultSet fetchAssoc(int caseId) throws SQLException{
    String query = "SELECT * FROM tbl_assoc WHERE caseID="+caseId+"";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    return rs;
}

public ResultSet fetchHearing(int caseId) throws SQLException{
    String query = "SELECT * FROM tbl_hearing WHERE caseId="+caseId;
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    return rs;
}


public void insertAppointment(int clientId, String advId, String purpose, Date date, Time time, int status){
    try{
        PreparedStatement stmt = con.prepareStatement("INSERT INTO tbl_appointment(clientId, advId, purpose, date, time, status) VALUES(?, ?, ?, ?, ?, ?)");
        stmt.setInt(1, clientId);
        stmt.setString(2, advId);
        stmt.setString(3, purpose);
        stmt.setDate(4, date);
        stmt.setTime(5, time);
        stmt.setInt(6, status);
        int i = stmt.executeUpdate();
        //System.out.println(i+" ");
    } catch(Exception e){}
}

public ResultSet fetchAppointment(String advId, int status) throws SQLException{
    String query = "SELECT * FROM tbl_appointment WHERE status="+status+" AND advId='"+advId+"'";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    return rs;
}

public void doApprove(int id, int status){
    try{
        Statement st = con.createStatement();
        st.executeQuery("UPDATE tbl_appointment SET status="+status+" WHERE id="+id+"");
        
        
    } catch(Exception e){}
}

public ResultSet fetchDeclinedAppointment() throws SQLException{
    String query = "SELECT * FROM tbl_appointment WHERE status=-1";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    return rs;
}

public boolean updateAppointment(String advId, int id){
    try{
        Statement stmt = con.createStatement();
        stmt.executeQuery("UPDATE tbl_appointment SET advId='"+advId+"', status=0 WHERE id="+id+"");
        
    } catch(Exception e){}
    //return false;
    return true;
}

public ResultSet fetchCase() throws SQLException{
    String qry = "SELECT * FROM tbl_cases";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(qry);
    return rs;
}

public String fetchAdvocate(int id) throws SQLException{
    String qry = "SELECT * FROM tbl_advocate_case WHERE caseID="+id+"";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(qry);
    while(rs.next()){
        return rs.getString("advId");
    }
    return null;
}

public ResultSet fetchClients() throws SQLException{

    String query = "SELECT * FROM tbl_clients";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    return rs;
}

public String fetchCaseOfClients(int id) throws SQLException{
    String qry = "SELECT subjectOfCase FROM tbl_cases WHERE clientId="+id+"";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(qry);
    while(rs.next()){
        return rs.getString("subjectOfCase");
    }
    return null;
}


public int getClientCount() throws SQLException{
    String query = "SELECT count(*) FROM tbl_clients";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    while(rs.next()){
    return rs.getInt(1);
    }
    return 0;    
}

public int getPendingCaseCount() throws SQLException{
    try{
        PreparedStatement stmt = con.prepareStatement("SELECT count(*) FROM tbl_cases WHERE status=?");
        stmt.setString(1, "चालु");
       ResultSet rs = stmt.executeQuery();
        while(rs.next()){
        return rs.getInt(1);
    }
    } catch(Exception e){}
    return 0; 
}

public int getWinCaseCount() throws SQLException{
    try{
        PreparedStatement stmt = con.prepareStatement("SELECT count(*) FROM tbl_cases WHERE status=?");
        stmt.setString(1, "जित");
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
        return rs.getInt(1);
    }
    } catch(Exception e){}
    return 0; 
}

public ResultSet fetchPendingCase(String advId){
   try{
    PreparedStatement stmt = con.prepareStatement("SELECT tbl_cases.caseId, tbl_clients.name, tbl_cases.subjectOfCase, tbl_cases.status FROM tbl_cases, tbl_advocate_case, tbl_clients WHERE tbl_cases.caseId = tbl_advocate_case.caseID AND tbl_cases.clientId = tbl_clients.clientId AND advId=? AND status=?");
    stmt.setString(1, advId);
    stmt.setString(2, "चालु");
    ResultSet rs = stmt.executeQuery();
    return rs;
}catch(Exception e){
    e.printStackTrace();
}
return null;
}


public void insertEvidences(String name, String fileName, int id){

    try{
        PreparedStatement stmt = con.prepareStatement("INSERT INTO tbl_evidences(name, filename, caseId) VALUES(?, ?, ?)");
        stmt.setString(1, name);
        stmt.setString(2, fileName);
        stmt.setInt(3, id);
        int i = stmt.executeUpdate();
        System.out.println(i+" evid");
    } catch(Exception e){}
}


public void insertHearing(Date date, String court, String adv, String verd, int id){

    try{
        PreparedStatement stmt = con.prepareStatement("INSERT INTO tbl_hearing(hearingDate, court, advocate, verdict, caseId) VALUES(?, ?, ?, ?, ?)");
        stmt.setDate(1, date);
        stmt.setString(2, court);
        stmt.setString(3, adv);
        stmt.setString(4, verd);
        stmt.setInt(5, id);
        int i = stmt.executeUpdate();
        System.out.println(i+" Hearing");
    } catch(Exception e){
        e.printStackTrace();
    }
}

public void insertAdditionalCaseDetail(String rno, String sts, Date rDate, int id){

    try{
        PreparedStatement stmt = con.prepareStatement("UPDATE tbl_cases SET regNo=?, status=?, regDate=? WHERE caseId=?");
        stmt.setString(1, rno);
        stmt.setString(2, sts);
        stmt.setDate(3, rDate);
        stmt.setInt(4, id);
        int i = stmt.executeUpdate();
        System.out.println(i+" case Detail");
    }catch(Exception e){}
}
}

   

