# Exerc�cio para a disciplina TSW-019

## O que � Cucumber?

**Cucumber** � uma abordagem de teste que oferece suporte ao Behavior Driven Development (BDD). Ele explica o comportamento do aplicativo em um texto simples em ingl�s usando a linguagem Gherkin.

Saiba mais em: [https://cucumber.io/](https://cucumber.io)

## O que � Gherkin?

**Gherkin** � um conjunto de regras gramaticais que torna o texto simples estruturado o suficiente para o Cucumber entender.

Gherkin serve a v�rios prop�sitos:

* Especifica��o de execut�vel inequ�voca
* Teste automatizado usando Cucumber
* Documentar como o sistema realmente se comporta

![](https://cucumber.io/img/single-source-of-truth-256x256.png)

A gram�tica Cucumber existe em diferentes sabores para muitos idiomas falados, de modo que sua equipe pode usar as palavras-chave em seu pr�prio idioma.

Os documentos do Gherkin s�o armazenados em arquivos de texto .feature e normalmente s�o versionados no controle de origem junto com o software.

# Implementa��o do exerc�cio para a disciplina TSW-019


![Cen�rio escrito em Gherkin](https://raw.githubusercontent.com/enoqueleal/TWS019/master/docs/screenshot-01.jpg)

![Implementa��o dos steps do Teste utilizando Cucumber e Java](https://raw.githubusercontent.com/enoqueleal/TWS019/master/docs/screenshot-02.jpg)

![Resultado da execu��o dos cen�rios](https://raw.githubusercontent.com/enoqueleal/TWS019/master/docs/screenshot-03.jpg)

![Saida system out da execu��o dos cen�rios](https://raw.githubusercontent.com/enoqueleal/TWS019/master/docs/screenshot-04.jpg)

### Arquivos

[/features/ClinicAnalyzer.feature](https://github.com/enoqueleal/TWS019/blob/master/src/test/resources/features/ClinicAnalyzer.feature)

[/steps/Steps.java](https://github.com/enoqueleal/TWS019/blob/master/src/test/java/com/tsw019/steps/Steps.java)
