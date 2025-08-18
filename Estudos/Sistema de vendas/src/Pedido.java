public class Pedido {
    private final int pedidoId;
    private  Produto[] produtos;
    private int contadorProdutos;
    private static final int MAX_PRODUTOS = 10;
    private static int contadorPedido;

    public Pedido() {
        this.pedidoId = ++Pedido.contadorPedido;
        this.produtos = new Produto[Pedido.MAX_PRODUTOS];
    }

    public void adicionaProduto(Produto produto){
        if (this.contadorProdutos < Pedido.MAX_PRODUTOS){
            this.produtos[this.contadorProdutos++] = produto;
        }else {
            System.out.printf("O limite de produtos é %d você tem %d produtos. Não pode ser adicionado mais nenhum produto",
                    Pedido.MAX_PRODUTOS,
                    this.contadorProdutos);
        }
    }

    public double calculaTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProdutos; i++) {
            Produto produto = this.produtos[i];
            total += produto.getPreco();

        }
        return total;
    }

    public void mostraPedido(){
        System.out.printf("ID do pedido: %d\n", this.pedidoId);
        double totalPedido = this.calculaTotal();
        System.out.printf("Total do pedido: %.2f\n", totalPedido);
        System.out.printf("Produtos\n");
        for (int i = 0; i < this.contadorProdutos; i++) {
            System.out.println(this.produtos[i]);
        }
    }
}
