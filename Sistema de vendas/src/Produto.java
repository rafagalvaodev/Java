public class Produto {
    private final int produtoId;
    private String nome;
    private double preco;
    private static int cotadorProdutos;

    public Produto(String nome, double preco) {
        this.produtoId = ++Produto.cotadorProdutos;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getProdutoId() {
        return this.produtoId;
    }

    @Override
    public String toString() {
        return String.format("ID do Produto: %d\nNome: %s valor %.2f",
                this.produtoId,
                this.nome,
                this.preco);
    }
}
