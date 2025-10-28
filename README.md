# Gestão de pedidos online
Este projeto implementa um sistema de pedidos usando o padrão State.
Cada estado (Novo, Pago, etc.) é uma classe concreta que implementa a interface OrderState.
A mudança de estado é feita chamando order.setState(new EstadoX()).

## Autor
Gabriell de Souza Zappelini
