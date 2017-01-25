package Models;

import interfaces.Tabelas;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Pessoas implements Tabelas {
    private int pessoaId;
    private String nome;
    private String sobrenome;
    private String cpf;

    public int getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getName() {
        return "Pessoas";
    }

    @Override
    public String getIdColumnName() {
        return "pessoaId";
    }

    @Override
    public String[] getColumns() {
        return new String[]{
                "nome",
                "sobrenome",
                "cpf"
        };
    }

    @Override
    public String[] getValues() {
        return new String[]{
                getName(),
                getSobrenome(),
                getCpf()
        };
    }

    public Pessoas(ResultSet resultSet) {

        try {
            setNome(resultSet.getString("nome"));
            setSobrenome(resultSet.getString("sobrenome"));
            setCpf(resultSet.getString("cpf"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
