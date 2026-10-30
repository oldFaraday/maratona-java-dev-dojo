#### Dicas:
``` Atalho
psvma -> static void main(String[] args) {}
```

``` Atalho
psvm -> static void main() {}
```

``` Atalho
sout -> System.out.println();
```
## Aula 10/11 - Convenções de variáveis, declaração e tamanho em memória:
### O que são?
Tipos primitivos são tipos que vão guardar valores simples na memória.

### Quais são eles?
Existem 8 tipos primitivos no Java. São eles:

![[Tipos primitivos.png]]

- Use **`int`** como padrão para contadores, índices e cálculos inteiros;
- **`long`** quando os valores puderem ultrapassar ~2 bilhões (IDs, timestamps, cálculos grandes);
- **`byte`** e **`short`** apenas para economizar memória em arrays ou streams massivos, pois em variáveis isoladas o ganho é irrelevante e há risco de erros de conversão;
- Use **`double`** como padrão para decimais e cálculos científicos, e **`float`** só quando memória for crítica ou por interoperabilidade (ex.: bibliotecas gráficas);
- Para valores monetários, evite ambos e prefira `BigDecimal`.
- Use **`char`** para um único caractere (e `String` para texto) 
- **`boolean`** para flags e condições lógicas, sempre evitando simular booleanos com `int` (0/1), por que prejudica a legibilidade.

##  Aula 12 - Casting:
Casting é basicamente a prática de forçar o valor de um tipo de variável em outro tipo, por exemplo, forçar o valor 10.000.000.000 dentro de uma variável int, que não comportaria esse valor. para fazer o casting usa-se a seguinte sintaxe:
``` Java
int idade = (int) 10000000000L;
```

## Aula 13 - Strings:
A **String** não é um tipo primitivo, por tanto não pode ser escrita em toda em minúsculo. Por ser uma classe, ela dever ser escrita com a primeira letra capitular, seguido do nome e o valor atribuído a ela entre aspas duplas.

Exemplo:
``` Java
String nome = "Gustavo";
```

## Aula 14 - Exercício:

``` Java
/*
Prática

Crie variáveis para os campos descritos abaixo entre e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>

*/
```