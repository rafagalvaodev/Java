public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Calças", 25.30);
        Produto produto2 = new Produto("Camisa", 35.99);

        Pedido pedido1 = new Pedido();
        pedido1.adicionaProduto(produto);
        pedido1.adicionaProduto(produto2);
        pedido1.mostraPedido();

        System.out.printf("O total do pedido é: %.2f",pedido1.calculaTotal());

    }
}
