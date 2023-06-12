package exam08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {

    public static void main(String[] args) {
        Connection conn = null;

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");


            conn = DriverManager.getConnection(
                    "jdbc:mysql://10.80.163.163:3306/thisisjava",
                    "java",
                    "mysql"
            );


            String sql = ""+
                    "INSERT INTO users (userid, username, userpassword, userage, useremail)"+
                    "VALUE(?, ?, ?, ?, ?)";


            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "didzl1398");
            pstmt.setString(2, "양원준");
            pstmt.setString(3, "Tkfrnrtn1972");
            pstmt.setInt(4, 18);
            pstmt.setString(5, "piko0201@dgsw.hs.kr");


            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행 수: "+rows);


            pstmt.close();

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(conn != null) {
                try{

                    conn.close();
                }catch (SQLException e){}
            }
        }
    }
}
