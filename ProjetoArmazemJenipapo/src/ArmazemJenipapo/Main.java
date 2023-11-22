package ArmazemJenipapo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	
static ArrayList<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
static ArrayList<Estoque> listaEstoques = new ArrayList<Estoque>();
	
public static void cadastrarFornecedor() {
	
	Scanner sc = new Scanner(System.in);
	Random idProduto = new Random();
     
	int numeroId = idProduto.nextInt(100);
	
	System.out.println("Vamos cadastrar um novo Forneçedor:");
	System.out.println("Digite o nome do Forneçedor:\n");
	String nome = sc.next();
	
	System.out.println("Digite o CNPJ: ");
	int cnpj = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Digite o Logradouro:\n");
	String logradouro = sc.nextLine();
	
	System.out.println("Digite o Bairro:\n");
	String bairro = sc.nextLine();
	
	System.out.println("Digite a cidade:\n");
	String cidade = sc.nextLine();
	sc.nextLine();
	
	System.out.println("Digite o estado:\n");
	String estado = sc.next();
	
	System.out.println("Digite o CEP:\n");
	int cep = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Digite seu telefone:\n");
	String telefone = sc.nextLine();
	sc.nextLine();
	
	System.out.println("Digite seu Email:\n");
	String email = sc.next();
			
	System.out.println("Digite a data do cadastro:\n");
	String dataCadastro = sc.next();
	
	System.out.println("Digite sua data de nascimento:\n");
	String dataNascimento = sc.next();
	
	Fornecedor forn = new Fornecedor(numeroId, nome, cnpj, logradouro, bairro, cidade, estado, cep, telefone, email, dataCadastro, dataNascimento); 
	
	listaFornecedores.add(forn);
}

public static void listarFornecedores() {
	
	for (int i =0 ; i < listaFornecedores.size(); i++) {
		
	int id = listaFornecedores.get(i).getIdFornecedor();
	String nome = listaFornecedores.get(i).getNome();
	int cnpj = listaFornecedores.get(i).getCnpj();
	String logradouro = listaFornecedores.get(i).getLogradouro();
	String bairro = listaFornecedores.get(i).getBairro();
	String cidade = listaFornecedores.get(i).getCidade();
	String estado = listaFornecedores.get(i).getEstado();
	int cep = listaFornecedores.get(i).getCep();
	String telefone = listaFornecedores.get(i).getTelefone();
	String email = listaFornecedores.get(i).getEmail();
	String dataCadastro = listaFornecedores.get(i).getDataCadastro();
	String dataNascimento = listaFornecedores.get(i).getDataNascimento();
	
	System.out.println("");
	System.out.println("Os Fornecedores encontardos foram:");
	System.out.println("ID = " + id + "| NOME = " + nome + "| CNPJ = " + cnpj + "| LOGRADOURO = " + logradouro + "| BAIRRO = " + bairro + "| CIDADE = " + cidade + "| ESTADO = " + estado + "| CEP = " + cep + 
			"| TELEFONE = " + telefone + "| EMAIL = " + email + "| DATA DE CADASTRO = " + dataCadastro + "| DATA DE NASCIMENTO = " + dataNascimento );
	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}

public static void buscarFornecedorNome() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("BUSCAR FORNEÇEDOR POR NOME");
	System.out.println("Qual é o nome do Fornecedor?");
	String nomeFornecedor = sc.next();
	
	for (int i =0 ; i < listaFornecedores.size(); i++) {
		
		String nomeForn = listaFornecedores.get(i).getNome();
		
		if (nomeFornecedor.equals(nomeForn)) {
			
			int id = listaFornecedores.get(i).getIdFornecedor();
			String nome = listaFornecedores.get(i).getNome();
			int cnpj = listaFornecedores.get(i).getCnpj();
			String logradouro = listaFornecedores.get(i).getLogradouro();
			String bairro = listaFornecedores.get(i).getBairro();
			String cidade = listaFornecedores.get(i).getCidade();
			String estado = listaFornecedores.get(i).getEstado();
			int cep = listaFornecedores.get(i).getCep();
			String telefone = listaFornecedores.get(i).getTelefone();
			String email = listaFornecedores.get(i).getEmail();
			String dataCadastro = listaFornecedores.get(i).getDataCadastro();
			String dataNascimento = listaFornecedores.get(i).getDataNascimento();
			
			System.out.println("O Fornecedor encontardo foi:");
			System.out.println("ID = " + id + "| NOME = " + nome + "| CNPJ = " + cnpj + "| LOGRADOURO = " + logradouro + "| BAIRRO = " + bairro + "| CIDADE = " + cidade + "| ESTADO = " + estado + "| CEP = " + cep + 
					"| TELEFONE = " + telefone + "| EMAIL = " + email + "| DATA DE CADASTRO = " + dataCadastro + "| DATA DE NASCIMENTO = " + dataNascimento );
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}}}

public static void deletarFornecedor() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DELETAR FORNEÇEDOR POR NOME");
		System.out.println("Qual é o nome do Fornecedor?");
		String nomeFornecedor = sc.next();
		
		for (int i =0 ; i < listaFornecedores.size(); i++) {
			
			String nomeForn = listaFornecedores.get(i).getNome();
			
			if (nomeFornecedor.equals(nomeForn)) {
				listaFornecedores.remove(i);
				System.out.println("Fornecedor: " + nomeForn + " deletado com sucesso!!");
			}
	}}

	
	
public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	int h = 1;

        while (h != 0) {
            System.out.println("Bem Vindo ao Sistema de Armazenamento do Armazém Jenipapo");
            System.out.println("O que você quer administar:");
            System.out.println("1.Estoque");
            System.out.println("2.Fornecedor");
            System.out.println("3.Produto");
            System.out.println("4.Sair");

            int numero = entrada.nextInt();

            switch (numero) {

                case 1:
                    System.out.println("Bem vindo ao estoque");
                    System.out.println("O que você deseja? Digite a opção desejada!");
                    System.out.println("1.Atualizar Estoque");
                    System.out.println("2.Remover Produto");
                    System.out.println("3.Listar Produto em Estoque");

                    int numeroMenu = entrada.nextInt();

                    switch (numeroMenu) {

                        case 1:
                          
                    }

                    break;
                
                
                case 2:  //Escolha Fornecedor
                    int i = 1;
                    while (i != 0) {

                        System.out.println("O que você deseja? Digite a opção desejada!");
                        System.out.println("1.Cadastrar Fornecedor");
                        System.out.println("2.Deletar Fornecedor");
                        System.out.println("3.Listar Fornecedor");
                        System.out.println("4.Procurar Fornecedor por nome");
                        System.out.println("5.Voltar ao menu");
                        int numerofornecedor = entrada.nextInt();

                        switch (numerofornecedor) {

                            case 1:
                                cadastrarFornecedor();
                                break;
                            case 2:
                                deletarFornecedor();
                                break;
                            case 3:
                                listarFornecedores();
                                break;
                            case 4:
                            	buscarFornecedorNome();
                            	break;
                            case 5:
                            	i = 0;
                            	break;
                            default:
                            	System.out.println("Digite uma opção válida (Entre 1 a 5)");
                                break;
                        } // fim switch


                    } // fim while
                    break;
                
                    
                case 3:
                    //Escolha Produto
                    break;
                
                default:
                    System.out.println("O número escolhido é inválido! Digite um número entre 1 a 3.");
                    break;
            }
        }
    } // fim while principal
	}