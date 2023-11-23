package ArmazemJenipapo;

public class Estoque {
    private String nomeProduto;
    private int quantidade;

    public Estoque(String nomeProduto, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }


    public String getNomeProduto() {return nomeProduto;}

    public void setNomeProduto(String nomeProduto) {this.nomeProduto = nomeProduto;}


    public int getQuantidade() {return quantidade;}

    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    public void adicionarQuantidade(int quantidadeAdicional) {
        quantidade += quantidadeAdicional;
    }

    public void removerQuantidade(int quantidadeRemover) {
        if (quantidadeRemover > 0 && quantidadeRemover <= quantidade) {
            quantidade -= quantidadeRemover;
        } else {
            System.out.println("Quantidade inválida. Nenhuma alteração feita no estoque.");
        }
    }

}

