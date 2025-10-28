package pedido;

import pedido.state.*;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new NovoState();
        System.out.println("Novo pedido criado. Estado atual: " + state.getNomeEstado());
    }

    public void setState(OrderState state) {
        this.state = state;
        System.out.println("Estado atual do pedido: " + state.getNomeEstado());
    }

    public void pagar() {
        state.pagar(this);
    }

    public void enviar() {
        state.enviar(this);
    }

    public void entregar() {
        state.entregar(this);
    }

    public void cancelar() {
        state.cancelar(this);
    }

    public String getEstadoAtual() {
        return state.getNomeEstado();
    }
}