package pedido.state;

import pedido.Order;

public class PagoState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("O pedido já foi pago!");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("Pedido enviado ao cliente!");
        order.setState(new EnviadoState());
    }

    @Override
    public void entregar(Order order) {
        System.out.println("Não é possível entregar.O pedido ainda não foi enviado!");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Pedido cancelado e pagamento estornado!");
        order.setState(new CanceladoState());
    }

    @Override
    public String getNomeEstado() {
        return "Pago";
    }
}