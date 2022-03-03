# Desafio de Programação - Capgemini 2022 

Esses algoritmos foram desenvolvidos para o Desafio de Programação da Academia Técnica Capgemini 2022, onde foram apresentados 3 questões.

Todos os códigos foram desenvolvidos com Java e Maven, dessa forma sendo possível utilizar testes unitários para as funções. 

Foram testadas as funções criadas com os exemplos passados do desafio, sendo realizados através de testes unitários presente no arquivo: 
[src/test/java/com/gIssamu/QuestionTest.java](https://github.com/GabsOda/desafio_programacao_java_capgemini_2022/blob/main/src/test/java/com/gIssamu/QuestionsTest.java)

### Requerimentos: 
- Java na sua versão 11 ou superiores. 
- Maven na versão 3.6.3

## Questão 1 
Código localizado na pasta: 

[src/main/java/com/gIssamu/question1](https://github.com/GabsOda/desafio_programacao_java_capgemini_2022/tree/main/src/main/java/com/gIssamu/question1)

Para esta primeira questão, deveriamos desenvolver um algoritmo que encontre a mediana dada uma lista com numeros de quantidade ímpar. 

Foi criada a classe ``Median`` contendo o código para realizar essa verificação. 

E também uma classe ``Question1`` contendo a classe main para ser possível rodar o ćodigo. 

Inicialmente pede-se a quantidade de valores que vão estar presente na lista que o usuário deverá informar ao programa, informando um valor Integer e apertando enter para ir para a póxima parte. Lógo em seguida irá pedir os valores da lista, que não precisa estar em ordem, para procurar a mediana. 

E este programa apresentará como responsta o valor, dentre dos que foi informado, qual será o valor da mediana. 

### Um exemplo: 

Para a lista: 
```
n = [9, 2, 1, 4, 6]
```
O resultado da execução do programa será: 
```
4
```
Já que o número 4 é a mediana da lista ``n`` informada depois de ser realizada uma ordenação nos valores dessa lista. 

### Para rodar esta questão: 

Para ver o código funcionando deve-se utilizar um terminal e na pasta raiz do projeto rodar: 
```bash
$ mvn exec:java -Dexec.mainClass=com.gIssamu.question1.Question1
```
Em que dessa forma o Maven irá baixar as dependências necessárias para rodar o projeto e logo em seguida já começar a execução do programa. 


## Questão 2
Código localizado na pasta: 

[src/main/java/com/gIssamu/question2](https://github.com/GabsOda/desafio_programacao_java_capgemini_2022/tree/main/src/main/java/com/gIssamu/question2)

Para esta segunda questão, deveriamos desenvolver um algoritmo que dado um vetor de inteiros ``n`` e um inteiro qualquer ``x`` encontre a quantidade de elementos pares do vetor que tem una diferença igual ao valor ``x``. 

Foi criada a classe ``Counter`` contendo o código para realizar essa contagem de pares. 

E também uma classe ``Question2`` contendo a classe main para ser possível rodar o ćodigo. 

Inicialmente pede-se a quantidade de valores que vão estar presente na lista que o usuário deverá informar ao programa, informando um valor Integer e apertando enter para ir para a póxima parte. Lógo em seguida irá pedir os valores do array. E depois o valor dessa diferença. 

E este programa apresentará como responsta uma quantidade de pares inteiros no vetor com pessuem a diferença entre os valores escolhida. 

### Exemplo: 

Para a lista: 
```
n = [1, 5, 3, 4, 2]
```
A diferença:
```
2
```
O resultado da execução do programa será: 
```
3
```
Como resultado foram possível encontrar 3 pares de inteiros no vetor com uma diferença de 2: [5, 3], [4, 2] e [3, 1]. 

### Para rodar esta questão: 

Assim como na questão 1, rodar no terminal da pasta raiz do projeto:  
```bash
$ mvn exec:java -Dexec.mainClass=com.gIssamu.question2.Question2
```
Em que dessa forma o Maven irá baixar as dependências necessárias para rodar o projeto e logo em seguida já começar a execução do programa. 

## Questão 2
Código localizado na pasta: 

[src/main/java/com/gIssamu/question3](https://github.com/GabsOda/desafio_programacao_java_capgemini_2022/tree/main/src/main/java/com/gIssamu/question3)

Para esta terceira questão, deveriamos desenvolver um algoritmo que dado uma string realiza uma encriptaçao nessa string. 

Essa encriptação foi realizada primeiro removendo possíveis espaços que podem existir na string, e logo após os caracteres são escritos na forma de um grid no qual a quantidade de linhas e colunas seguem essa regra: 

a raíz da quantidade de caracteres

E após esse grid formado o resultado é obtido organizando os caracteres na forma de palavras onde cada coluna formada nesse grid se torne uma palavra. 

Foi criada a classe ``Encryptor`` contendo o código para realizar essa encryptação. 

E também uma classe ``Question3`` contendo a classe main para ser possível rodar o ćodigo. 

Na execução do programa ele pedirá a string que irá ser encriptada. 

E apresentará como responsta a string já encriptada. 

### Exemplo: 

A string: 
```
s = ola mundo
```
Removendo o espaço presente nessa string, ela possui: ``8 caracteres`` 

Dessa forma seu grid ficará com tamanho de 3 linhas e 3 colunas, já que a raiz de 8 está entre 2 e 3, na forma: 

```
ola 
mun
do 
```
Em seguida o programa irá combinar esse grid em apenas uma string, fazendo com que cada coluna desse grid se torne uma palavra, apresentando dessa forma como resultado: 
```
omd luo an
```
E está seria a string encriptada. 

### Para rodar esta questão: 

Da forma forma que as demais questões, rodar no terminal:  
```bash
$ mvn exec:java -Dexec.mainClass=com.gIssamu.question3.Question3
```
Em que dessa forma o Maven irá baixar as dependências necessárias para rodar o projeto e logo em seguida já começar a execução do programa. 