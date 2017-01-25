package MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConexaoMySql {
    private static String status = "Não conectado...";
    private static final String providerName = "com.mysql.cj.jdbc.Driver";
    private static final String serverName = "localhost";
    private static final String userName = "root";
    private static final String password = "";
    private static final String database = "ilio";
    private static final String url = "jdbc:mysql://" + serverName + "/" + database + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static Connection connection;

    private ConexaoMySql() {

    }

    public static String getStatus() {
        return status;
    }

    private static Connection openConnection() {
        try {
            Class.forName(providerName).newInstance();
            connection = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        status = connection != null ?
                "STATUS--->Conectado com sucesso!" :
                "STATUS--->Não foi possivel realizar conexão";

        return connection;
    }

    public static Connection getConnection() {
        if (connection != null) {
            boolean isClosed = true;

            try {
                isClosed = connection.isClosed();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            if (!isClosed)
                return connection;
            else {
                connection = openConnection();
                return connection;
            }
        }

        try {
            connection = openConnection();
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean closeConnection() {
        try {
            getConnection().close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static Connection restartConnection() {
        closeConnection();
        return getConnection();
    }
}
