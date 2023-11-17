package ArmazemJenipapo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int h = 1;

        while (h != 0) {
            System.out.println("WELCOME TO ARMAZEM JENIPAPO");
            System.out.println("Quem você é? Digite o numero correspondente");
            System.out.println("1.Administrador");
            System.out.println("2.Fornecedor");
            System.out.println("3.Cliente");
            System.out.println("4.Não sou cadastrado");

            int numero = entrada.nextInt();

            switch (numero) {

                case 1:
                    System.out.println("Bem vindo Administrador");
                    System.out.println("O que você deseja? Digite a opção desejada!");
                    System.out.println("1.Cadastrar Produto");
                    System.out.println("2.Remover Produto");
                    System.out.println("3.Listar Produto em Estoque");
                    System.out.println("4.Listar Produto do Fornecedor");

                    int numeroMenu = entrada.nextInt();

                    switch (numeroMenu) {

                        case 1:
                            System.out.println("Nome do produto:");
                            String nome = entrada.next();
                            entrada.nextLine();
                            System.out.println("Desrição do produto:");
                            String descricao = entrada.nextLine();
                            System.out.println("Nome do Fornecedor do produto:");
                            String nomeFornecedor = entrada.nextLine();

                            System.out.println(nome + descricao + nomeFornecedor);
                            // if nomeFornecedor ==
                    }

                    break;
                case 2:
                    fornecedor fornecedor = new fornecedor();
                    int i = 1;

                    while (i != 0) {

                        System.out.println("Bem vindo Fornecedor");
                        System.out.println("O que você deseja? Digite a opção desejada!");
                        System.out.println("1.Cadastrar Fornecedor");
                        System.out.println("2.Remover Fornecedor");
                        System.out.println("3.Listar Fornecedor");
                        int numerofornecedor = entrada.nextInt();

                        switch (numerofornecedor) {

                            case 1:
                                fornecedor.adicionarFornecidos();
                                break;
                            case 2:
                                System.out.println("EM MANUTENÇÃO");
                                break;
                            case 3:
                                fornecedor.listarFornecidos();
                                break;
                            default:
                                i = 0;
                        } // fim switch


                    } // fim while


                    break;
                case 3:
                    System.out.println("Bem vindo Cliente");
                    break;
                case 4:
                    System.out.println("Vamos fazer seu cadastro");
                    System.out.println("Qual cadastro quer realizar:");
                    System.out.println("1. Cadastro Cliente");
                    System.out.println("2. Cadastro Administrador");
                    System.out.println("3. Cadastro Fornecedor");
                    System.out.println("4. Voltar");

                    int escolhaCadastro = entrada.nextInt();
                    switch (escolhaCadastro) {

                        case 1:
                            //Função cadastrarCliente()
                            break;

                        case 2:
                            //Função cadastrarAdmin()
                            break;

                        case 3:
                            //Função cadastrarFornecedor()
                            break;

                        case 4:
                            //Função menuPrincipal()
                            break;

                        default:
                            System.out.println("O número escolhido é inválido! Digite um número entre 1 a 4.");
                            break;
                    }

                default:
                    System.out.println("O número escolhido é inválido! Digite um número entre 1 a 3.");
                    break;
            }
        }
    } // fim while principal
	}