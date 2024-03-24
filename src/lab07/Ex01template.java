package ex01template;
//resposta da letra B:
//O padrão Template é utilizado para definir a estrutura de um algoritmo em uma classe base, delegando a implementação de determinadas etapas do algoritmo para subclasses. Ele permite reutilizar código ao mesmo tempo que permite personalização de partes específicas do algoritmo.
//Por outro lado, o padrão Decorator é empregado para adicionar funcionalidades adicionais a um objeto de forma dinâmica, sem modificar sua estrutura básica. Ele permite estender o comportamento de um objeto adicionando novas funcionalidades, mantendo a mesma interface e sem a necessidade de criar subclasses excessivas ou modificar a estrutura do objeto original.

import java.util.Scanner;

public class Ex01template {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de itens:");
        int quantidadeItens = scanner.nextInt();
        
        System.out.println("Digite o valor do item:");
        double valorItem = scanner.nextDouble();
        
        System.out.println("Digite a forma de pagamento (criptomoedas):");
        String formaPagamento = scanner.next();
        
        PedidoTemplate pedidoOnlineCriptomoedas = new PedidoOnlineCriptomoedas();
        pedidoOnlineCriptomoedas.processarPedido(quantidadeItens, valorItem, formaPagamento);

        PedidoTemplate pedidoLojaCriptomoedas = new PedidoLojaCriptomoedas();
        pedidoLojaCriptomoedas.processarPedido(quantidadeItens, valorItem, formaPagamento);
        
        scanner.close();
    }
}