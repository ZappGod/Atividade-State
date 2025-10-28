package pedido.state;

import pedido.Order;

public class CanceladoState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("Não é possível pagar.O pedido foi cancelado!");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("Não é possível enviar.O pedido foi cancelado!");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("Não é possível entregar.O pedido foi cancelado!");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("O pedido já está cancelado!");
    }

    @Override
    public String getNomeEstado() {
        return "Cancelado!";
    }
}