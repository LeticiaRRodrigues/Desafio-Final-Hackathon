$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PreencherCadastro.feature");
formatter.feature({
  "name": "Preencher campos obrigatorios",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Preencher dados",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@PreencherCadastro"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu estou na aba Checkout",
  "keyword": "Dado "
});
formatter.match({
  "location": "PreencherCadastroSteps.queEuEstouNaAbaCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o first Name \"Leticia\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "PreencherCadastroSteps.euInformarOFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o last Name \"Rodrigues\"",
  "keyword": "E "
});
formatter.match({
  "location": "PreencherCadastroSteps.euInformarOLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o Zip/Postal Code \"71680369\"",
  "keyword": "E "
});
formatter.match({
  "location": "PreencherCadastroSteps.informarOZipPostalCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao continue",
  "keyword": "E "
});
formatter.match({
  "location": "PreencherCadastroSteps.clicarNoBotaoContinue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a aba Checkout: Overview",
  "keyword": "Entao "
});
formatter.match({
  "location": "PreencherCadastroSteps.oSistemaApresentaAAbaCheckoutOverview()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});