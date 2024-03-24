package ex01template;

abstract class PedidoTemplate {

    public final void processarPedido(int quantidadeItens, double valorItem, String formaPagamento) {
        processarPagamento(formaPagamento);

        if (verificarEntrega()) {
            realizarEntrega(quantidadeItens, valorItem);
        } else {
            System.out.println("Pedido pronto para ser retirado na loja.");
        }
    }

    protected abstract void processarPagamento(String formaPagamento);

    protected boolean verificarEntrega() {
        return true; 
    }

    protected abstract void realizarEntrega(int quantidadeItens, double valorItem);
}