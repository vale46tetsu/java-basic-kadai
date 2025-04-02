package kadai_004;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employees_Chapter04 {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/challenge_java"; 
        String user = "root"; 
        String password = "Rossi4674!"; 

        String createTableSQL = "CREATE TABLE IF NOT EXISTS employees ("
                + "id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(60) NOT NULL, "
                + "email VARCHAR(255) NOT NULL, "
                + "age INT(11), "
                + "address VARCHAR(255)"
                + ");";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

        	 System.out.println("データベース接続成功：" + conn);
             int result = stmt.executeUpdate(createTableSQL);
             System.out.println("社員テーブルを作成しました:更新レコード数=" + result);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
