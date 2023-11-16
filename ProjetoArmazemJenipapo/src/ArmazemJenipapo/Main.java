package ArmazemJenipapo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
int numero = 0;
        
        System.out.println("WELCOME TO ARMAZEM JENIPAPO");
        System.out.println("Quem você é? Digite o numero correspondente");
        System.out.println("1.Administrador");
        System.out.println("2.Fornecedor");
        System.out.println("3.Cliente");
        System.out.println("4.Não sou cadastrado");
        
        Scanner entrada = new Scanner(System.in);
        
        numero = entrada.nextInt();
          
        switch (numero){
            
            case 1: 
                 System.out.println("Bem vindo Administrador");
                 System.out.println("O que você deseja? Digite a opção desejada!");
                 System.out.println("1.Cadastrar Produto");
                 System.out.println("2.Remover Produto");
                 System.out.println("3.Listar Produto em Estoque");
                 System.out.println("4.Listar Produto do Fornecedor"); 
                 
                 int numeroMenu = 0;
                 numeroMenu = entrada.nextInt();
                 
                 switch (numeroMenu){
                     
                     case 1:
                         System.out.println("Nome do produto:");
                         String nome = entrada.nextLine();
                         System.out.println("Desrição do produto:");
                         String descricao = entrada.nextLine();
                         System.out.println("Nome do Fornecedor do produto:");
                         String nomeFornecedor = entrada.nextLine();
                          
                        // if nomeFornecedor == 
            }
                 
                 break;
            case 2:
                 System.out.println("Bem vindo Fornecedor");
                 break;
            case 3:
                 System.out.println("Bem vindo Cliente");
                 break;
            case 4:
                 System.out.println("Vamos fazer seu cadastro");
                 break;
                 
            default:
                System.out.println("O número escolhido é inválido! Digite um número entre 1 a 3.");
    }
    }
	}


