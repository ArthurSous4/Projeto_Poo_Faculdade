package ArmazemJenipapo;

import java.util.Date;

public class Cliente extends Pessoa {

	private String nome;
	private int cpf;
	private Date dataCadastro = new Date();
	private float valorGastoTotal = 0;
	
Cliente(String nome, int cpf){
	
	this.nome = nome;
	this.cpf = cpf;
}

private String getNomeCliente() {
	return nome;
}

private void setNomeCliente(String nome) {
	this.nome = nome;
}

private int getCpf() {
	return cpf;
}

private void setCpf(int cpf) {
	this.cpf = cpf;

}
}
