package ArmazemJenipapo;

public class Estoque {
    private Produto nomeProduto;
    private int quantidade;

public Estoque(Produto nomeProduto, int quantidade) {
	this.nomeProduto = nomeProduto;
	this.quantidade = quantidade;
   }


public Produto getNomeProduto() {return nomeProduto;}

public void setNomeProduto(Produto nomeProduto) {this.nomeProduto = nomeProduto;}
  


public int getQuantidade() {return quantidade;}
    
public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

}


