# PROVASICREDI_

### CONFIGURAÇÃO DO PROJETO

1- Baixar o Java na versão JDK 8.<br>
2- Instalar o Java<br>
3- Configurar as Variaveis de ambiente<br>
4- Criar um projeto Maven na versão do JDK 1.8<br>
5- Nomear o projeto com o nome provasicredi


    Acesse o link abaixo e procure as seguintes dependências para configurar o arquivo Pom.xml:

<b>https://mvnrepository.com/</b>

• selenium-java<br>
• jUnit<br>
• Cucumber-java<br>
• Cucumber-junit<br>
• Cucumber-core<br>
• extentreports<br>
• commons-io


Após feito o passo anterior, copie a pasta <br>scr/</b> do projeto baixado e substitua a pasta <b>src/</b> do projeto criado, como foi dito na linha 9.


Baixe o chromedriver de acordo com seu sistema operacional:

<b>http://chromedriver.chromium.org/downloads</b>

<b>Instalar uma versão muito antiga do driver pode gerar complicações ao executar o projeto</b>


Após baixar, descompacte-o e cole o arquivo na pasta resources do projeto:
> \provasicredi_\src\test\resources

Se for Windows vá na classe TestRule e altere no final do caminho do chromedriver inserindo a palavra ".exe".
Conforme o exemplo abaixo:

> src/test/resources/chromedriver/chromedriver.exe

Caso utilize Linux, retire o ".exe". Conforme o exemplo abaixo:

src/test/resources/chromedriver/chromedriver


Após isso basta apenas executar a classe CadastroTest.java


Você poderá visualizar o relatório dos testes no seguinte caminho:

> \provasicredi_\src\test\resources\HtmlReport
