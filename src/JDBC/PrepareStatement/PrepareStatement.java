package JDBC.PrepareStatement;

import java.sql.*;

public class PrepareStatement {

    public static void main(String[] args) throws SQLException {
	var insertSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
	var updateSql = "UPDATE exhibits SET name = '' " + "WHERE name = 'None'";
	var deleteSql = "DELETE FROM exhibits WHERE id = 10";
	var sql = "SELECT * FROM exhibits";

	try (Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");
//		PreparedStatement ps = conn.prepareStatement("SELECT * FROM exhibits")
//		var ps = conn.prepareStatement("SELECT * FROM exhibits")
		var ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery()) {
	    int result = ps.executeUpdate();
	    boolean isResultSet = ps.execute();
	    if (isResultSet) {
		try (ResultSet rs1 = ps.getResultSet()) {
		    System.out.println("Ran a query");
		}
	    } else {
		int result1 = ps.getUpdateCount();
		System.out.println("ran an update");
	    }
	    System.out.println(result);
	}
    }

    public static void register(Connection conn, int key, int type, String name) throws SQLException {
	var sql = "INSERT INTO names VALUES(?,?,?)";
	try (var ps = conn.prepareStatement(sql)) {
//	    ps.setInt(1, key);
//	    ps.setString(3, name);
//	    ps.setInt(2, type);
	    ps.setObject(1, key);
	    ps.setObject(3, name);
	    ps.setObject(2, type);
	    ps.executeUpdate();
	    
	    ps.setObject(5, key);
	    ps.setObject(6, name);
	    ps.setObject(7, type);
	    ps.executeUpdate();
	}
    }
}
