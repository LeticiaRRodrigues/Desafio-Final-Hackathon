$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AdicionarItens.feature");
formatter.feature({
  "name": "Selecionar Itens",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Adicionar itens",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@AdicionarItens"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu adicionar o item Backpack",
  "keyword": "Quando "
});
formatter.match({
  "location": "AdicionarItensSteps.euAdicionarOItemBackpack()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu adicionar o item Fleece",
  "keyword": "E "
});
formatter.match({
  "location": "AdicionarItensSteps.euAdicionarOItemFleece()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu adicionar o item Onesie",
  "keyword": "E "
});
formatter.match({
  "location": "AdicionarItensSteps.euAdicionarOItemOnesie()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu adicionar o item Bike Light",
  "keyword": "E "
});
formatter.match({
  "location": "AdicionarItensSteps.euAdicionarOItemBikeLight()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema adiciona os itens no carrinho",
  "keyword": "Entao "
});
formatter.match({
  "location": "AdicionarItensSteps.oSistemaAdicionaOItemNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/CancelarPedido.feature");
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
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Filtros.feature");
formatter.feature({
  "name": "Filtrar",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Filtrar itens por preco",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Filtro"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o menu filtro",
  "keyword": "Quando "
});
formatter.match({
  "location": "FiltrosSteps.euAcionarOMenuFiltro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no submenu Price (low to high)",
  "keyword": "E "
});
formatter.match({
  "location": "FiltrosSteps.clicarNoSubmenuPriceLowToHigh()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta os itens do menor para o maior preco",
  "keyword": "Entao "
});
formatter.match({
  "location": "FiltrosSteps.oSistemaApresentaOsItensDoMenorParaOMaiorPreco()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/FinalizarCompras.feature");
formatter.feature({
  "name": "Conferir itens e finalizar compras",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Carrinho",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@FinalizarCompras"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu incluo itens no carrinho",
  "keyword": "Dado "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "eu acessar o carrinho",
  "keyword": "Quando "
});
formatter.match({
  "location": "FinalizarComprasSteps.euAcessarOCarrinho()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "remover o item Onesie",
  "keyword": "E "
});
formatter.match({
  "location": "FinalizarComprasSteps.removerOItemOnesie()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicar no botao Checkout",
  "keyword": "E "
});
formatter.match({
  "location": "FinalizarComprasSteps.clicarNoBotaoCheckout()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "o sistema apresenta a aba Checkout",
  "keyword": "Entao "
});
formatter.match({
  "location": "FinalizarComprasSteps.oSistemaApresentaAAbaCheckout()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Realizar login",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu esteja acessando o sitema",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.queEuEstejaAcessandoOSitema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o usuario \"standard_user\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.informarOUsuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"secret_sauce\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe o usuario logado",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaExibeOUsuarioLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/PreencherCadastro.feature");
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
formatter.embedding("image/png", "embedded5.png", null);
formatter.after({
  "status": "passed"
});
});