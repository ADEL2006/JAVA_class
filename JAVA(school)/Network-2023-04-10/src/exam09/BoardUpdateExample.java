package exam09;

import java.io.FileInputStream;
import java.sql.*;




public class BoardUpdateExample {

    public static void main(String[] args) {
        Connection conn = null;

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");


            conn = DriverManager.getConnection(
                    "jdbc:mysql://10.80.163.163:3306/thisisjava",
                    "java",
                    "mysql"
            );


            String sql = new StringBuilder()
                    .append("UPDATE boards SET")
                    .append("btitle=?, ")
                    .append("bcontent=?, ")
                    .append("bfilename=?, ")
                    .append("bfiledata=? ")
                    .append("WHERE bno=?")
                    .toString();


            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "백야");
            pstmt.setString(2, "밤이 밝은 날");
            pstmt.setString(3, "white_night.png");
            pstmt.setBlob(4, new FileInputStream("/Users/yang-wonjun/Downloads/white_night.png"));
            pstmt.setInt(5, 9);


            int rows = pstmt.executeUpdate();
            System.out.println("수정된 행 수: "+rows);


            pstmt.close();

        }catch (Exception e) {
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
