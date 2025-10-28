package pedido.state;

import pedido.Order;

public class NovoState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("Pagamento recebido.Pedido agora está pago!");
        order.setState(new PagoState());
    }

    @Override
    public void enviar(Order order) {
        System.out.println("Não é possível enviar.O pedido ainda não foi pago!");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("Não é possível entregar.O pedido ainda não foi pago nem enviado!");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Pedido cancelado com sucesso");
        order.setState(new CanceladoState());
    }

    @Override
    public String getNomeEstado() {
        return "Novo";
    }
}