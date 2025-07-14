import  java.sql.*;
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://localhost:5432/Demo";
        String uname="postgres";
        String pass="0000";
        String query="insert into student values(?,?,?)";
        String sql="Select * from student where sid=? and sname=?";
        int sid=6;
        int marks =35;
        String sname="Lohan";
        Connection con=DriverManager.getConnection(url,uname,pass);
        System.out.println("connection established");

        PreparedStatement st=con.prepareStatement(sql);
        st.setInt(1,5);
        st.setString(2,"Max");
        ResultSet rs=st.executeQuery();
        if(rs.next())
        {
            System.out.println("id- "+rs.getInt(1)+" |"+" marks- "+rs.getInt(2)+" |"+" Name: "+rs.getString(3));
        }

//        st.setInt(1,sid);
//        st.setInt(2,marks);
//        st.setString(3,sname);
        st.execute();
//        Statement st=con.createStatement();
//        st.execute(query);
//        ResultSet rs=st.executeQuery(query);
//
//       while (rs.next())
//       {
//           System.out.println("id- "+rs.getInt(1)+" |"+" marks- "+rs.getInt(2)+" |"+" Name: "+rs.getString(3));
//       }
//





        con.close();

    }
}
