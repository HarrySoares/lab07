package ex01template;

class PedidoLojaCriptomoedas extends PedidoTemplate {

    @Override
    protected void processarPagamento(String formaPagamento) {
        System.out.println("Pagamento via criptomoedas processado com sucesso na loja.");
    }

    @Override
    protected void realizarEntrega(int quantidadeItens, double valorItem) {
        System.out.println("Pedido na loja com pagamento via criptomoedas entregue.");
    }
}
