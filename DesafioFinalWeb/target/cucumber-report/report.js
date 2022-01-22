$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CancelarPedido.feature");
formatter.feature({
  "name": "Cancelar o pedido",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Cancelar pedido",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CancelarPedido"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu estou na aba Checkout: Overview",
  "keyword": "Dado "
});
formatter.match({
  "location": "CancelarPedidoSteps.queEuEstouNaAbaCheckoutOverview()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o botao cancel",
  "keyword": "Quando "
});
formatter.match({
  "location": "CancelarPedidoSteps.euAcionarOBotaoCancel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema volta para a pagina inicial",
  "keyword": "Entao "
});
formatter.match({
  "location": "CancelarPedidoSteps.oSistemaVoltaParaAPaginaInicial()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});