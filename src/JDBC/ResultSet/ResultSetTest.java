package JDBC.ResultSet;

import java.sql.*;
import java.util.HashMap;

public class ResultSetTest {

    public static void main(String args[]) throws SQLException {
	var sql = "SELECT id, name FROM exhibits";
	var sqlCount = "SELECT count(*) FROM exhibits";
	var idToNameMap = new HashMap<Integer, String>();

	try (Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");
		var ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();) {

	    while (rs.next()) {
//		int id = rs.getInt("id");
//		String name = rs.getString("name");
//		idToNameMap.put(id, name);
		var idField = rs.getObject("id");
		var nameField = rs.getObject("name");
		if (idField instanceof Integer id)
		    System.out.println(id);
		if (nameField instanceof String name)
		    System.out.println(name);
	    }

	    if (rs.next()) {
		int count = rs.getInt(1);
		System.out.println(count);
	    }
	    System.out.println(idToNameMap);
	}
    }

}
