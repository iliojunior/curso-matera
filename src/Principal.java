import Models.Pessoas;
import MySql.ConexaoMySql;
import cruds.CRUD;
import cruds.FindPessoaByNome;

public class Principal {
    public static void main(String[] args) {
        ConexaoMySql.getConnection();
        Pessoas pessoa = CRUD.find(new FindPessoaByNome("ilio"));
        System.out.println(pessoa.getNome());
    }
}