import  java.sql.*;
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://localhost:5432/Demo";
        String uname="postgres";
        String pass="0000";
        Connection con=DriverManager.getConnection(url,uname,pass);

        System.out.println("connection established");

    }
}
