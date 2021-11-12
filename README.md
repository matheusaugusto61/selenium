# Selenium

Selenium é um conjunto de ferramentas de código aberto, usado principalmente para testar aplicações web pelo browser, de forma automatizada. Uma das vantagens é que não há necessidade de aprender uma linguagem especifica de script de testes. O Selenium também é utilizado para automatizar tarefas de administração tediosas, feitas através de sistemas web. 

## WebDriver: 
Neste projeto, utilizamos o WebDriver. WebDriver conduz um navegador de forma nativa, usando APIs de automação de navegador, fornecidas pelos proprios navegadores com o objetivo de controlar o navegador e executar testes. É como se literalmente um usuário real estivesse operando o navegador. Por que utilizar WebDriver?
* O WebDriver foi projetado como uma interface de programação simples e mais concisa.
* WebDriver é uma API compacta orientada a objetos.
* Ele dirige o navegador de forma eficaz.

## Clonando o projeto:

Requisitos:
* Git - https://git-scm.com/downloads
* IDE (Recomendado: Netbeans) - https://www.oracle.com/br/tools/technologies/netbeans-ide.html 
* JDK (Java Development Kit) - https://www.oracle.com/java/technologies/downloads/

### Criando ambiente local:
Inicie o terminal do gitbash ou o terminal de sua preferência. Navegue até a pasta que você deseja que os arquivos do projeto sejam armazenados. Execute o seguinte comando para criar um repositório git:
```
git init
```
Para definir um repositório remoto, digite o seguinte comando: 
```
git remote add origin https://github.com/QualitySquad/selenium
```
E para finalizar digite o comando:
```
git pull origin master
```
Pronto! A partir deste momento todos os arquivos estarão na pasta que você definiu anteriormente.

## Estrutura do projeto:

* Classe Selenium2. Selenium 2 é a classe principal do projeto, dentro de Selenium2 ficará os objetos e a execução dos métodos.
* AbrirChrome: 
Dentro da classe AbrirChrome temos o métodos AbrirChrome(), que espera receber dois parametros: url e caminho, ambos do tipo string. Este método será utilizado em todos os outros métodos.
* CasoTeste01:
* CasoTeste02:
Teste responsável por verificar se a URL da API está sendo gerada. A lógica deste teste consiste em selecionar o id trivia_amount, que pertence ao input number, recolher o value e depois disparar o evento submit. Disparando o evento submit, se tudo der certo a classe alert-success será renderizada, sendo o ponto chave do nosso teste. Se a classe alert-sucess for gerada iremos imprimir a frase de sucesso com o número default do input number. Caso contrario um erro será impresso, avisando que não foi possível gerar a URL da api. 
Autor: Israel Gomes
* CasoTeste03:
Teste responsável por verificar no sistema se o usuário com as informações solicitadas, já foi cadastrado no sistema e retornará um alerta, ou se será cadastrado normalmente, e retornará uma mensagem de sucesso.
Autor: Leonardo Marinho
* CasoTeste04:
* CasoTeste05:
* Bibliotecas: Todos os arquivos necessários para o funcionamento do Selenium, que também podem ser encontrados no link: https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.0.0/selenium-java-4.0.0.zip 

### Importante
Dentro de cada classe "CasoTeste" criamos 02 Strings, url e caminho. É imprescindível que o caminho contenha o apontamento para o arquivo chromedriver.exe, que está localizado na raiz deste projeto, então recomendamos que ao baixar o projeto você ajuste isso antes de roda-lo.

### Links Úteis:
* Documentação Selenium: https://www.selenium.dev/documentation/
* Transferências Selenium: https://www.selenium.dev/downloads/
* IDE Netbeans - https://www.oracle.com/br/tools/technologies/netbeans-ide.html 
* JDK (Java Development Kit) - https://www.oracle.com/java/technologies/downloads/
