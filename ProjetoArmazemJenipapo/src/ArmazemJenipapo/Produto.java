package ArmazemJenipapo;

public class Produto {
    
    private int id;
    private int codigoBarras;
    private String nome;
    private String descricao;
    private Fornecedor nomeFornecedor;
    private String dataCadastro;

    
Produto(){}  //Construtor Vazio 
    
Produto(int id,int codigoBarras, String nome, String descricao, Fornecedor nomeFornecedor,String dataCadastro){
        
	this.id = id;
	this.codigoBarras = codigoBarras;
	this.nome = nome;
    this.descricao = descricao;
    this.nomeFornecedor = nomeFornecedor;
    this.dataCadastro = dataCadastro;
}

public int getId() {return id;}

public void setId(int id) {this.id = id;}



public int getCodigoBarras() {return codigoBarras;}

public void setCodigoBarras(int codigoBarras) {this.codigoBarras = codigoBarras;}



public String getNome() {return nome;}

public void setNome(String nome) {this.nome = nome;}



public String getDescricao() {return descricao;}

public void setDescricao(String descricao) {this.descricao = descricao;}



public Fornecedor getNomeFornecedor() {return nomeFornecedor;}

public void setNomeFornecedor(Fornecedor nomeFornecedor) {this.nomeFornecedor = nomeFornecedor;}



public String getDataCadastro() {return dataCadastro;}

public void setDataCadastro(String dataCadastro) {this.dataCadastro = dataCadastro;}

}