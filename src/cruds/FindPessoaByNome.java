package cruds;

import interfaces.Getable;

public class FindPessoaByNome implements Getable {

    private final String nome;

    public FindPessoaByNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTable() {
        return "Pessoas";
    }

    @Override
    public String getWhereClause() {
        return "nome='"+nome+"'";
    }

    @Override
    public String[] getColumns() {
        return new String[0];
    }
}
