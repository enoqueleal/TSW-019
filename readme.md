# Exercício para a disciplina TSW-019

## O que é Cucumber?

**Cucumber** é uma abordagem de teste que oferece suporte ao Behavior Driven Development (BDD). Ele explica o comportamento do aplicativo em um texto simples em inglês usando a linguagem Gherkin.

Saiba mais em: [https://cucumber.io/](https://cucumber.io)

## O que é Gherkin?

**Gherkin** é um conjunto de regras gramaticais que torna o texto simples estruturado o suficiente para o Cucumber entender.

Gherkin serve a vários propósitos:

* Especificação de executável inequívoca
* Teste automatizado usando Cucumber
* Documentar como o sistema realmente se comporta

![](https://cucumber.io/img/single-source-of-truth-256x256.png)

A gramática Cucumber existe em diferentes sabores para muitos idiomas falados, de modo que sua equipe pode usar as palavras-chave em seu próprio idioma.

Os documentos do Gherkin são armazenados em arquivos de texto .feature e normalmente são versionados no controle de origem junto com o software.

# Implementação do exercício para a disciplina TSW-019


![Cenário escrito em Gherkin](https://raw.githubusercontent.com/enoqueleal/TWS019/master/docs/screenshot-01.jpg)

![Implementação dos steps do Teste utilizando Cucumber e Java](https://raw.githubusercontent.com/enoqueleal/TWS019/master/docs/screenshot-02.jpg)

![Resultado da execução dos cenários](https://raw.githubusercontent.com/enoqueleal/TWS019/master/docs/screenshot-03.jpg)

![Saida system out da execução dos cenários](https://raw.githubusercontent.com/enoqueleal/TWS019/master/docs/screenshot-04.jpg)

### Arquivos

[/features/ClinicAnalyzer.feature](https://github.com/enoqueleal/TWS019/blob/master/src/test/resources/features/ClinicAnalyzer.feature)

[/steps/Steps.java](https://github.com/enoqueleal/TWS019/blob/master/src/test/java/com/tsw019/steps/Steps.java)
