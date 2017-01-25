package interfaces;

import java.sql.ResultSet;

public interface Tabelas {
    String getName();

    String getIdColumnName();

    String[] getColumns();

    String[] getValues();

}
