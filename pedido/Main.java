package pedido;

public class Main {
    public static void main(String[] args) {
        Order pedido = new Order();

        pedido.enviar();   // ainda não pago
        pedido.pagar();    // paga o pedido
        pedido.enviar();   // envia o pedido
        pedido.entregar(); // entrega ao cliente
        pedido.cancelar(); // não pode cancelar após entrega
    }
}