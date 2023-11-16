package ArmazemJenipapo;

import java.util.Date;

public class fornecedor extends Pessoa {
	
	private int idFornecedor;
	private String nome;
	private int cnpj;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private int cep;
	private int telefone;
	private String email;
	private Date dataCadastro;
	private Date dataNascimento;
	public produto produtoDistribuido;
	
fornecedor(int idFornecedor, String nome, int cnpj, String logradouro,String bairro, String cidade, String estado,
		int cep, int telefone, String email, Date dataCadastro, Date dataNascimento, produto produtoDistribuido){
	
	this.idFornecedor = idFornecedor;
	this.nome = nome;
	this.cnpj = cnpj;
	this.logradouro = logradouro;
	this.bairro = bairro;
	this.cidade = cidade;
	this.estado = estado;
	this.cep = cep;
	this.telefone = telefone;
	this.email = email;
	this.dataCadastro = dataCadastro;
	this.dataNascimento = dataNascimento;
	this.produtoDistribuido = produtoDistribuido;
}
	
private void adicionarFornecidos() {
	
}

private void listarFornecidos() {
	
}

private void removerFornecidos() {
	
}
	
	
	
	
}
