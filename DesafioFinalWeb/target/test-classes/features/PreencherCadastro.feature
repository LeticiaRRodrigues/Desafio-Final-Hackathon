#language: pt
#enconding: UTF-8

Funcionalidade: Preencher campos obrigatorios
@PreencherCadastro
Cenario: Preencher dados

Dado que eu estou na aba Checkout
Quando eu informar o first Name "Leticia" 
E eu informar o last Name "Rodrigues"
E informar o Zip/Postal Code "71680369"
E clicar no botao continue
Entao o sistema apresenta a aba Checkout: Overview
