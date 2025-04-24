package JDBC.ConnecDatabase;

import java.sql.*;

public class TestConnect {
    public static void main(String args[]) throws SQLException {
		try(Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo")) {
		    System.out.println(conn);
		}
    }
}
