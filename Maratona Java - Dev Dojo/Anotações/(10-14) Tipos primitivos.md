#### Dicas:
``` Atalho
psvma -> static void main(String[] args) {}
```

``` Atalho
psvm -> static void main() {}
```
## Aula 10 - Convenções de variáveis
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