package ArmazemJenipapo;

import java.util.Date;

public class produto {
    
    public float id;
    public String nome;
    public String descricao;
    public fornecedor nomeFornecedor;
    public Date dataCadastro;

    produto(float id, String nome, String descricao, fornecedor nomeFornecedor,Date dataCadastro){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.nomeFornecedor = nomeFornecedor;
        this.dataCadastro = new Date();
    }

}
