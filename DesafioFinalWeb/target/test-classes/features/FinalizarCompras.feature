#language: pt
#enconding: UTF-8

Funcionalidade: Conferir itens e finalizar compras

@FinalizarCompras
Cenario: Carrinho

Dado que eu incluo itens no carrinho
Quando eu acessar o carrinho
E remover o item Onesie
E clicar no botao Checkout
Entao o sistema apresenta a aba Checkout
