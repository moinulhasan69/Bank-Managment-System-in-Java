import java.sql.*;

public class Database {
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/banking","root","");
            System.out.println("Connected Succesfully");
            return con;
        }
        catch(Exception e){
            System.out.println("Connection Failed");
            return null;
        }
    }
}
