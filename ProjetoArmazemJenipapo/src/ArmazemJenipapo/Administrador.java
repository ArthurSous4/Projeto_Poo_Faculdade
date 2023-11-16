package ArmazemJenipapo;

public class Administrador extends Pessoa {
	
	private String nome;
	private String senha;
	
Administrador(String nome, String senha){
	
	this.nome = nome;
	this.nome = senha;
}

public String getNomeAdm() {
	return nome;
}

public void setNomeAdm(String nome) {
	this.nome = nome;
}

private String getSenhaAdm() {
	return senha;
}

private void setSenhaAdm(String senha) {
	this.senha = senha;
}

public void adicionarProduto() {
	
}

public String listarProdutos() {
	return null;
}

public void removerProdutos() {
	
}

public produto cadastrarProduto() {
	return null;
}

public void deletarProduto() {
	
}

public String listarFornecedores() {
	return null;
}

public String historicoVendas() {
	return null;
}
}
