package ArmazemJenipapo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class fornecedor extends Pessoa {
	
	private int idFornecedor;
	private String nome;
	private String senha;
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
	
fornecedor(){
	
	this.idFornecedor = idFornecedor;
	this.nome = nome;
	this.senha = senha;
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

public int getIdFornecedor() {
	return idFornecedor;
}

public void setIdFornecedor(int idFornecedor) {
	this.idFornecedor = idFornecedor;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

private String getSenha() {
	return senha;
}

private void setSenha(String senha) {
	this.senha = senha;
}

public int getCnpj() {
	return cnpj;
}

public void setCnpj(int cnpj) {
	this.cnpj = cnpj;
}

public String getLogradouro() {
	return logradouro;
}

public void setLogradouro(String logradouro) {
	this.logradouro = logradouro;
}

public String getBairro() {
	return bairro;
}

public void setBairro(String bairro) {
	this.bairro = bairro;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

public int getCep() {
	return cep;
}

public void setCep(int cep) {
	this.cep = cep;
}

public int getTelefone() {
	return telefone;
}

public void setTelefone(int telefone) {
	this.telefone = telefone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Date getDataCadastro() {
	return dataCadastro;
}

public void setDataCadastro(Date dataCadastro) {
	this.dataCadastro = dataCadastro;
}

public Date getDataNascimento() {
	return dataNascimento;
}

public void setDataNascimento(Date dataNascimento) {
	this.dataNascimento = dataNascimento;
}

public produto getProdutoDistribuido() {
	return produtoDistribuido;
}

public void setProdutoDistribuido(produto produtoDistribuido) {
	this.produtoDistribuido = produtoDistribuido;
}

	List<String> listaDeFornecedor = new ArrayList<>();
public void adicionarFornecidos() {
	Scanner entrada = new Scanner(System.in);


	 System.out.println("digite o nome");
	 nome = entrada.next();

	 System.out.println("digite o senha");
	 senha = entrada.next();

	 System.out.println("digite o telefone");
	 String telefoneStr = entrada.nextLine();
	 int telefoneInt = Integer.parseInt(telefoneStr);

	 String user = new String(nome + " " + senha + " " + telefoneInt);

	 listaDeFornecedor.add(user);

	 System.out.println("Cadastrado com Sucesso!!");

}

public void listarFornecidos () {



	System.out.println(listaDeFornecedor);
	
}

private void removerFornecidos() {
	
}
	
	
	
	
}