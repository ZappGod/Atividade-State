package pedido.state;

import pedido.Order;

public class EntregueState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("O pedido já foi entregue e pago");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("O pedido já foi entregue");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("O pedido já foi entregue anteriormente");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Não é possível cancelar.O pedido já foi entregue");
    }

    @Override
    public String getNomeEstado() {
        return "Entregue";
    }
}