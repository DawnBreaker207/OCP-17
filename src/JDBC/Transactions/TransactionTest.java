package JDBC.Transactions;

import java.sql.*;

public class TransactionTest {

    public static void main(String[] args) throws SQLException {
	try (Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo")) {
	    conn.setAutoCommit(false);

	    var elephantRowsUpdated = updateRow(conn, 5, "African Elephant");
	    var zebraRowUpdated = updateRow(conn, -5, "Zebra");

	    if (!elephantRowsUpdated || !zebraRowUpdated)
		conn.rollback();
	    else {
		String selectSql = """
			SELECT COUNT(*)
			FROM exhibits
			WHERE num_acres <= 0""";

		try (var ps = conn.prepareStatement(selectSql); ResultSet rs = ps.executeQuery()) {
		    rs.next();
		    int count = rs.getInt(1);
		    if (count == 0)
			conn.commit();
		    else
			conn.rollback();
		}
	    }
	}
    }

    private static boolean updateRow(Connection conn, int numToAdd, String name) throws SQLException {
	String updateSql = """
		UPDATE exhibits
		SET num_acres = num_acres + ?
		WHERE name = ?""";
	try (PreparedStatement ps = conn.prepareStatement(updateSql)) {
	    ps.setInt(1, numToAdd);
	    ps.setString(2, name);
	    return ps.executeUpdate() > 0;
	}
    }

    public static void BookMarking() throws SQLException {
	try (Connection conn = DriverManager.getConnection("")) {
	    conn.setAutoCommit(false);
	    Savepoint sp1 = conn.setSavepoint();

	    Savepoint sp2 = conn.setSavepoint("second savepoint");

	    conn.rollback(sp2);

	    conn.rollback(sp1);
	}
    }
}
