package ex01template;

class PedidoOnlineCriptomoedas extends PedidoTemplate {

    @Override
    protected void processarPagamento(String formaPagamento) {
        System.out.println("Pagamento via criptomoedas processado com sucesso.");
    }

    @Override
    protected void realizarEntrega(int quantidadeItens, double valorItem) {
        System.out.println("Pedido online com pagamento via criptomoedas entregue.");
    }
}