package cruds;

import MySql.ConexaoMySql;
import interfaces.Getable;
import interfaces.Tabelas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class CRUD {

    private CRUD() {

    }

    public static <T extends Tabelas> T find(Getable getable) {
        String columns = getable.getColumns().length > 0 ?
                String.join(",", getable.getColumns()) :
                "*";

        String where = "";
        where = getable.getWhereClause().isEmpty() ?
                where :
                " WHERE " + getable.getWhereClause();


        String query = "SELECT "
                + columns
                + " FROM "
                + getable.getTable()
                + where;

        Connection conn = ConexaoMySql.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            return (T) Class.forName("Models." + getable.getTable()).getConstructor(ResultSet.class).newInstance(rs);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
