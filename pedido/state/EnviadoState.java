package pedido.state;

import pedido.Order;

public class EnviadoState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("O pedido já foi pago e enviado");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("O pedido já foi enviado");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("Pedido entregue ao cliente");
        order.setState(new EntregueState());
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Não é possível cancelar.O pedido já foi enviado");
    }

    @Override
    public String getNomeEstado() {
        return "Enviado";
    }
}