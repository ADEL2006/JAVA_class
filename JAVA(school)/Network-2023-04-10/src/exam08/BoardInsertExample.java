package exam08;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

public class BoardInsertExample {

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
                    "INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata)"+
                    "VALUE(?, ?, ?, now(), ?, ?)";


            PreparedStatement pstmt = conn.prepareStatement
                    (sql, Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, "밤이 밝은 날");
            pstmt.setString(2, "밤하늘이 밝아요");
            pstmt.setString(3, "white night");
            pstmt.setString(4, "white_night.png");
            pstmt.setString(5, "/Users/yang-wonjun/Downloads/white_night.png");


            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행 수: "+rows);


            if(rows == 1) {
                ResultSet rs = pstmt.getGeneratedKeys();

                if(rs.next()) {
                    int bno = rs.getInt(1);
                    System.out.println("저장된 bno: "+bno);
                }
                rs.close();
            }

            pstmt.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {

            if(conn == null) {
                try{
                    conn.close();
                }
                catch (SQLException e) {
                }
            }
        }
    }
}
