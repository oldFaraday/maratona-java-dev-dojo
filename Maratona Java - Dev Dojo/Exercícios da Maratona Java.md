# Exercícios da Maratona Java — Dev Dojo

Este arquivo reúne exercícios originais para acompanhar a [Maratona Java do Dev Dojo](https://www.youtube.com/watch?v=VKjFuX91G5Q&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW). Cada seção indica até qual aula você precisa ter assistido para resolver os exercícios. Os enunciados usam somente os recursos ensinados até aquela aula.

## Como usar este arquivo

- Leia o pré-requisito da seção antes de começar.
- Resolva os exercícios na ordem. Dentro de cada seção, a dificuldade é progressiva.
- Antes da aula 68 não há leitura de dados pelo teclado. Nesses exercícios, use valores fixos no código e altere-os para testar.
- A partir da aula 68, os enunciados podem pedir que o usuário digite os dados.
- Os exercícios de JDBC e JUnit assumem que o ambiente do curso já está configurado (Docker, MySQL, Maven e JUnit).
- Este arquivo contém apenas os enunciados. As soluções ficam por sua conta.

## Índice

O arquivo tem **904 exercícios**, distribuídos em 53 seções. A ordem acompanha o curso e cada seção informa a última aula necessária.

### Básico

- Tipos Primitivos e Strings — até a aula 14
- Operadores — até a aula 19
- Estruturas Condicionais — até a aula 26
- Estruturas de Repetição — até a aula 31
- Arrays — até a aula 35
- Arrays Multidimensionais — até a aula 38

### Intermediário

- Classes e Objetos — até a aula 43
- Métodos — até a aula 53
- Encapsulamento — até a aula 56
- Sobrecarga de Métodos — até a aula 57
- Construtores — até a aula 59
- Blocos de Inicialização — até a aula 60
- Modificador static — até a aula 63
- Associação entre Objetos — até a aula 67
- Leitura de Dados pelo Console — até a aula 69
- Associação — Projeto Integrador — até a aula 70
- Herança — até a aula 75
- Sobrescrita de toString — até a aula 76
- Modificador final — até a aula 79
- Enumeração — até a aula 83
- Classes Abstratas — até a aula 86
- Interfaces — até a aula 89
- Polimorfismo — até a aula 94

### Avançado

- Exceções — até a aula 105
- Wrappers — até a aula 107
- Strings e StringBuilder — até a aula 111
- Datas Legadas — até a aula 118
- java.time — até a aula 129
- ResourceBundle — até a aula 130
- Regex — até a aula 136
- Scanner — Tokens e Delimitadores — até a aula 137
- IO — até a aula 143
- NIO — até a aula 158
- Serialização — até a aula 160

### Coleções

- equals, hashCode e Big-O — até a aula 165
- List — até a aula 168
- Ordenação, Comparable, Comparator, Busca e Iterator — até a aula 174
- Set, HashSet, NavigableSet e TreeSet — até a aula 177
- Map, HashMap, LinkedHashMap, NavigableMap e TreeMap — até a aula 181
- Queue e PriorityQueue — até a aula 182

### Mais Avançado

- Generics — até a aula 188
- Classes Internas — até a aula 192
- Parametrizando Comportamentos — até a aula 194
- Lambdas — até a aula 197
- Method Reference — até a aula 200
- Optional — até a aula 202
- Streams — até a aula 219

### Punk

- Threads — até a aula 228
- Concorrência e CompletableFuture — até a aula 245
- Padrões de Projeto — até a aula 251
- JDBC — até a aula 279

### Finalização

- Testes Unitários com JUnit — até a aula 281
- Record e Pattern Matching — até a aula 284

## Exercícios de Tipos Primitivos e Strings (até a aula 14)

**Pré-requisito:** aulas 10 a 14. Use apenas declaração de variáveis, tipos primitivos, `String`, casting e concatenação. Ainda não use operadores aritméticos, condicionais ou laços.

1. Crie um programa que declare variáveis para nome, idade, altura e se a pessoa é estudante. Escolha os tipos adequados e imprima cada valor com uma etiqueta.
2. Declare uma variável `byte` para a quantidade de filhos, uma `short` para o ano de nascimento, uma `int` para a população de uma cidade e uma `long` para a população mundial. Atribua valores e imprima cada uma.
3. Crie variáveis para o preço de um produto (`double`) e para a quantidade em estoque (`int`). Imprima uma frase com os dois valores.
4. Declare um `char` com a letra inicial do seu nome e imprima. Depois faça o casting desse `char` para `int` e imprima o código numérico correspondente.
5. Declare um `double` com o valor 19.99 e faça o casting para `int`. Imprima os dois valores e escreva um comentário explicando o que aconteceu com a parte decimal.
6. Declare um `float` e um `double` com o mesmo valor decimal. Use o sufixo `f` no `float`, imprima os dois e observe a diferença de precisão.
7. Crie uma ficha de filme com título (`String`), duração em minutos (`short`), nota (`double`) e se é dublado (`boolean`). Imprima tudo em uma única linha usando concatenação.
8. Declare duas Strings, `nome` e `sobrenome`, e imprima o nome completo com um espaço entre elas.
9. Crie variáveis para os dados de um carro: modelo, ano, cor, preço e se é automático. Imprima uma ficha do veículo.
10. Declare uma variável `long` com um número grande e tente armazená-la em um `int` sem casting. Escreva um comentário explicando o erro e depois faça o casting explícito.
11. Crie um programa que declare os dados de um aluno (nome, matrícula, três notas e situação de matrícula) e imprima um boletim simples. Não calcule a média ainda; apenas mostre os valores.
12. Monte uma etiqueta de bagagem com nome do passageiro, número do voo, assento (`char`), peso da bagagem (`double`) e se tem prioridade (`boolean`). Imprima a etiqueta em várias linhas, usando apenas concatenação e `println`.

## Exercícios de Operadores (até a aula 19)

**Pré-requisito:** aulas 15 a 19. Use operadores aritméticos, relacionais, lógicos e de atribuição. Ainda não use `if`, `switch`, laços ou arrays.

1. Declare dois números inteiros e imprima a soma, a subtração, a multiplicação, a divisão inteira e o resto da divisão.
2. Declare quatro notas `double` e calcule a média aritmética. Imprima o resultado.
3. Converta uma temperatura de Celsius para Fahrenheit usando a fórmula `F = C * 9 / 5 + 32`. Imprima o resultado.
4. Um produto custa 250,00 e teve um aumento de 15%. Calcule o novo preço usando operadores de atribuição compostos.
5. Um salário de 3.200,00 sofreu um desconto de 8%. Calcule o valor final usando `-=`.
6. Verifique se um número inteiro é par usando o operador de resto. Imprima `true` ou `false`.
7. Declare duas idades e imprima o resultado das comparações `>`, `<`, `>=`, `<=`, `==` e `!=`.
8. Verifique se uma pessoa pode votar: ela precisa ter 16 anos ou mais e possuir título de eleitor. Imprima o resultado booleano.
9. Verifique se três segmentos podem formar um triângulo. A soma de dois lados deve ser maior que o terceiro, para todos os pares. Imprima o resultado.
10. Verifique se um ano é bissexto usando apenas operadores lógicos e relacionais. A regra é: divisível por 4 e não por 100, ou divisível por 400.
11. Calcule o IMC de uma pessoa com peso e altura fixos. Imprima o valor e também se o IMC é maior que 25.
12. Simule uma conta bancária: comece com 1.000,00, deposite 250,00, retire 120,00 e cobre uma taxa de 15,00. Use operadores de atribuição e imprima o saldo final.
13. Calcule a expressão `10 + 5 * 2` e depois `(10 + 5) * 2`. Imprima os dois resultados e um comentário explicando a diferença.
14. Crie um contador começando em 10. Use `++` e `--` em prefixo e sufixo, imprimindo o valor após cada operação. Explique a diferença entre `++contador` e `contador++`.
15. Converta uma quantidade de horas, minutos e segundos para o total em segundos. Depois, descubra quantas horas inteiras existem em 100.000 segundos usando divisão e resto.

## Exercícios de Estruturas Condicionais (até a aula 26)

**Pré-requisito:** aulas 20 a 26. Use `if`, `else if`, `else`, operador ternário e `switch`. Ainda não use laços, arrays ou leitura pelo teclado.

1. Verifique se um número inteiro é positivo, negativo ou zero.
2. Classifique uma idade em criança (0 a 12), adolescente (13 a 17), adulto (18 a 59) ou idoso (60 ou mais).
3. Converta uma nota de 0 a 100 em conceito: A para 90 ou mais, B para 80 a 89, C para 70 a 79, D para 60 a 69 e F abaixo de 60.
4. Simule um login com um código de acesso numérico fixo. Se o código informado for igual ao cadastrado, imprima "Acesso permitido"; caso contrário, imprima "Acesso negado".
5. Calcule o preço de um produto com desconto: até 100, sem desconto; de 100,01 a 500, 10%; acima de 500, 15%.
6. Classifique um IMC: abaixo de 18,5; de 18,5 a 24,9; de 25 a 29,9; 30 ou mais.
7. Considere um número fixo de 1 a 7 e imprima o dia da semana correspondente usando `switch`.
8. Considere um número fixo de 1 a 12 e imprima o mês correspondente usando `switch`.
9. Crie uma calculadora simples com dois números e um operador (`+`, `-`, `*` ou `/`) usando `switch`.
10. Verifique se três lados formam um triângulo e classifique-o em equilátero, isósceles ou escaleno.
11. Verifique se um ano é bissexto usando `if`.
12. Encontre o maior entre três números usando `if` e `else if`.
13. Ordene três números em ordem crescente usando apenas condicionais e variáveis auxiliares.
14. Calcule o preço de um ingresso: menores de 12, estudantes e maiores de 60 pagam metade; os demais pagam o valor cheio. Às terças-feiras, todos pagam metade.
15. Use o operador ternário para imprimir "Aprovado" ou "Reprovado" com base na média de duas notas.
16. Use `switch` para calcular o frete por região: 1 Norte (30), 2 Nordeste (25), 3 Centro-Oeste (20), 4 Sudeste (15) e 5 Sul (10).
17. Classifique um caractere como vogal, consoante ou símbolo usando `switch` e `if`.
18. Calcule o imposto de renda simplificado: até 2.000, isento; de 2.000,01 a 4.000, 10%; acima de 4.000, 20%. Imprima a alíquota e o valor do imposto.
19. Verifique se um triângulo é retângulo comparando os quadrados dos lados, sem usar `Math.sqrt`.
20. Calcule uma conta de água por faixas de consumo: até 10 m³, valor fixo de 30,00; de 11 a 20 m³, 30,00 mais 2,00 por metro excedente; acima de 20 m³, 50,00 mais 4,00 por metro excedente.
21. Determine a estação do ano a partir do mês usando `switch`.
22. Desafio: simule um menu de banco com as opções 1 saldo, 2 depósito, 3 saque e 4 sair. Use `switch` e valores fixos para o saldo e para a operação escolhida.

## Exercícios de Estruturas de Repetição (até a aula 31)

**Pré-requisito:** aulas 27 a 31. Use `while`, `do while`, `for`, `break` e `continue`. Ainda não use arrays, métodos ou leitura pelo teclado.

1. Imprima os números de 1 a 100 usando `for`.
2. Imprima os números pares de 1 a 50 usando `while`.
3. Calcule a soma dos números de 1 a 100.
4. Imprima a tabuada de um número fixo de 1 a 10.
5. Calcule o fatorial de 7.
6. Imprima os 15 primeiros termos da sequência de Fibonacci.
7. Conte quantos dígitos tem um número inteiro.
8. Inverta um número inteiro. Por exemplo, 1234 deve virar 4321.
9. Verifique se um número é primo.
10. Calcule a soma dos dígitos de um número.
11. Calcule o MDC de dois números usando o algoritmo de Euclides.
12. Imprima os números primos de 1 a 100, usando `continue` para pular os que não são primos.
13. Encontre o primeiro número entre 1 e 1000 que seja divisível por 7, por 11 e por 13 ao mesmo tempo. Use `break` quando encontrá-lo.
14. Desenhe um triângulo retângulo de asteriscos com 5 linhas usando laços aninhados.
15. Imprima as tabuadas de 1 a 10 para os números de 1 a 10 usando laços aninhados.
16. Calcule a soma dos números pares e a quantidade de números ímpares entre 1 e 200.
17. Gere a sequência de Collatz a partir de 27 até chegar a 1 e conte quantos passos foram necessários.
18. Calcule uma aproximação de π usando a série `4 - 4/3 + 4/5 - 4/7 + ...` até que o termo seja menor que 0,0001.
19. Simule um saque de 187 reais informando quantas notas de 100, 50, 20, 10, 5 e 2 serão usadas, priorizando as maiores.
20. Calcule a raiz quadrada inteira de um número usando apenas laços, sem usar `Math.sqrt`.
21. Verifique se um número é perfeito, ou seja, se a soma dos divisores próprios é igual ao próprio número.
22. Imprima os 10 primeiros números de Armstrong maiores que zero. Um número é de Armstrong quando a soma de seus dígitos elevados à quantidade de dígitos é igual a ele.

## Exercícios de Arrays (até a aula 35)

**Pré-requisito:** aulas 32 a 35. Use arrays, `for`, `foreach`, `break` e `continue`. Ainda não use métodos, coleções ou leitura pelo teclado.

1. Crie um array com cinco nomes e imprima cada um usando `for`.
2. Crie um array com 10 números inteiros e imprima a soma e a média.
3. Encontre o maior e o menor valor de um array de inteiros.
4. Conte quantos números pares e quantos ímpares existem em um array.
5. Imprima um array na ordem inversa.
6. Crie um segundo array com os mesmos valores do primeiro, sem usar atribuição direta entre arrays.
7. Conte quantas vezes um valor específico aparece em um array.
8. Crie um novo array sem os valores duplicados do array original.
9. Junte dois arrays em um terceiro array.
10. Ordene um array de inteiros usando o algoritmo bubble sort.
11. Faça uma busca binária em um array ordenado e imprima o índice encontrado.
12. Rotacione os elementos de um array uma posição para a esquerda.
13. Encontre o segundo maior valor de um array.
14. Verifique se um array é palíndromo, ou seja, se ele tem a mesma leitura de trás para frente.
15. Conte a frequência de cada elemento de um array e imprima o resultado.
16. Crie um array com as notas de 10 alunos, calcule a média e conte quantos ficaram acima da média.
17. Crie dois arrays paralelos: nomes de produtos e quantidades em estoque. Imprima os produtos com estoque abaixo de 5.
18. Implemente o algoritmo de ordenação por seleção (selection sort).
19. Remova um elemento de um array pelo índice, criando um novo array menor.
20. Encontre a maior sequência de elementos consecutivos de um array em que cada elemento é maior que o anterior.
21. Desafio: separe um array de inteiros em dois novos arrays, um com os pares e outro com os ímpares.
22. Desafio: encontre todos os pares de números de um array cuja soma seja igual a um valor alvo.

## Exercícios de Arrays Multidimensionais (até a aula 38)

**Pré-requisito:** aulas 36 a 38. Use matrizes, arrays irregulares, `for` e `foreach`. Ainda não use métodos ou coleções.

1. Crie uma matriz 3x3 e imprima todos os elementos.
2. Calcule a soma de todos os elementos de uma matriz.
3. Calcule a soma de cada linha e imprima os resultados.
4. Calcule a soma de cada coluna e imprima os resultados.
5. Crie a matriz transposta de uma matriz.
6. Imprima a diagonal principal e a diagonal secundária de uma matriz quadrada.
7. Verifique se uma matriz é a matriz identidade.
8. Multiplique duas matrizes 3x3.
9. Encontre o maior elemento de uma matriz e sua posição (linha e coluna).
10. Conte quantos valores negativos existem em uma matriz.
11. Simule um mapa de assentos de cinema 4x5 com `boolean`. Marque alguns assentos como ocupados e conte quantos estão livres.
12. Crie um tabuleiro 3x3 de jogo da velha com `char` e imprima-o formatado.
13. Crie um array irregular em que cada aluno tem uma quantidade diferente de notas. Calcule a média de cada aluno.
14. Verifique se uma matriz quadrada é simétrica.
15. Calcule a soma dos elementos da borda de uma matriz.
16. Gire uma matriz 3x3 em 90 graus.
17. Desafio: encontre o elemento que aparece mais vezes em uma matriz e informe sua posição.
18. Desafio: calcule o determinante de uma matriz 2x2 e de uma matriz 3x3.

## Exercícios de Classes e Objetos (até a aula 43)

**Pré-requisito:** aulas 39 a 43. Use classes, atributos públicos, objetos e referências. Ainda não use métodos próprios, construtores, `private` ou coleções. Os cálculos devem ser feitos no `main`.

1. Crie a classe `Pessoa` com nome e idade. Instancie duas pessoas e imprima os dados.
2. Crie a classe `Carro` com modelo, ano e cor. Instancie um carro e imprima os dados.
3. Crie a classe `Produto` com nome, preço e quantidade. Instancie dois produtos e imprima-os.
4. Crie a classe `Livro` com título, autor e número de páginas. Instancie dois livros.
5. Crie a classe `Aluno` com nome e três notas. Instancie um aluno e calcule a média no `main`.
6. Crie a classe `ContaBancaria` com titular e saldo. Instancie uma conta e simule um depósito alterando o saldo diretamente.
7. Crie a classe `Filme` com título, duração e nota. Instancie três filmes e imprima o de maior nota.
8. Crie a classe `Funcionario` com nome, cargo e salário. Instancie dois funcionários.
9. Crie a classe `Cidade` com nome, estado e população. Instancie três cidades.
10. Crie a classe `Celular` com marca, modelo, armazenamento e bateria. Instancie dois celulares.
11. Crie dois objetos `Pessoa` e uma terceira referência que aponta para o primeiro. Altere um dado pela terceira referência e imprima os dois objetos.
12. Crie dois objetos `Produto` e troque as referências entre duas variáveis. Imprima os dados antes e depois da troca.
13. Crie a classe `Retangulo` com largura e altura. Instancie um retângulo e calcule a área no `main`.
14. Crie a classe `Data` com dia, mês e ano. Instancie uma data e imprima no formato `dd/mm/aaaa` usando concatenação.
15. Crie a classe `Endereco` com rua, número, cidade e CEP. Instancie dois endereços.
16. Crie a classe `Jogador` com nome, nível e pontos. Instancie três jogadores e imprima o jogador com maior pontuação usando `if`.
17. Desafio: crie as classes `Pessoa` e `Animal` e mostre que objetos diferentes podem ter atributos com o mesmo nome sem se confundirem.
18. Desafio: crie a classe `Retangulo` e a classe `Circulo`, cada uma com os atributos necessários. Instancie um objeto de cada tipo e use `if` para imprimir qual tem a maior área.

## Exercícios de Métodos (até a aula 53)

**Pré-requisito:** aulas 44 a 53. Use métodos com parâmetros, retorno, parâmetros por valor e por referência, `this` e varargs. Ainda não use `private`, construtores, `static` ou coleções.

1. Crie um método `somar(int a, int b)` que retorna a soma.
2. Crie um método `maior(int a, int b, int c)` que retorna o maior dos três números.
3. Crie um método `ehPar(int numero)` que retorna `boolean`.
4. Crie um método `fatorial(int n)` que retorna o fatorial.
5. Crie um método `ehPrimo(int n)` que retorna `boolean`.
6. Crie um método `contarDigitos(int n)` que retorna quantos dígitos tem o número.
7. Crie um método `inverter(int n)` que retorna o número invertido.
8. Crie um método `media(double[] notas)` que retorna a média de um array.
9. Crie um método `imprimirArray(int[] numeros)` que imprime todos os elementos.
10. Crie um método `preencher(int[] numeros, int valor)` que preenche todo o array com o valor recebido.
11. Crie um método `zerar(int numero)` que tenta alterar um parâmetro primitivo. Chame-o e mostre que o valor original não mudou.
12. Crie um método `alterarArray(int[] numeros)` que altera o primeiro elemento. Chame-o e mostre que o array original foi alterado.
13. Crie um método `somarTodos(int... numeros)` usando varargs.
14. Crie um método `media(double... notas)` usando varargs.
15. Crie uma classe `Aluno` com nome e nota. Crie um método `atualizarNome(String nome)` que usa `this.nome = nome`.
16. Crie um método `buscar(int[] numeros, int valor)` que retorna o índice do valor ou -1.
17. Crie um método `contarPares(int[] numeros)` que retorna a quantidade de números pares.
18. Crie um método `ordenar(int[] numeros)` que ordena o array usando bubble sort.
19. Crie um método `somarMatrizes(int[][] a, int[][] b)` que retorna uma nova matriz com a soma.
20. Crie uma classe `Calculadora` com métodos para soma, subtração, multiplicação, divisão e potência. A potência deve ser calculada com um laço.
21. Crie um método `mover(int[] numeros, int posicao, int novaPosicao)` que move um elemento dentro do array, ajustando os demais.
22. Crie um método que recebe um array e retorna um novo array sem valores duplicados.
23. Desafio: crie um método `compactar(int[] numeros)` que remove os zeros do array e retorna um novo array apenas com os valores diferentes de zero.
24. Desafio: crie uma classe `Agenda` com um array de códigos de contato e métodos para adicionar, buscar e remover códigos, sem usar coleções.

## Exercícios de Encapsulamento (até a aula 56)

**Pré-requisito:** aulas 54 a 56. Use `private`, getters, setters e validações dentro dos métodos. Ainda não use construtores, `static` ou coleções. Instancie os objetos com o construtor padrão e configure-os pelos setters.

1. Crie `Pessoa` com `private String nome` e `private int idade`, getters e setters. Valide a idade entre 0 e 120.
2. Crie `ContaBancaria` com `private double saldo`, getter, métodos `depositar` e `sacar` com validação.
3. Crie `Produto` com `private double preco`; o setter não deve aceitar valor negativo.
4. Crie `Aluno` com `private double[] notas`, getter e setter que validam notas entre 0 e 10.
5. Crie `Funcionario` com `private double salario` e um método `aumentarSalario(double percentual)`.
6. Crie `Carro` com `private int velocidade` e métodos `acelerar` e `frear`, limitando a velocidade entre 0 e 200.
7. Crie `Termometro` com `private double temperatura`; o setter não deve aceitar valores abaixo de -273,15.
8. Crie `Usuario` com `private int codigo` e `private int senha`, e um método `autenticar(int codigo, int senha)`.
9. Crie `Estoque` com `private int quantidade` e métodos `adicionar` e `remover`, sem permitir estoque negativo.
10. Crie `Retangulo` com `private double largura` e `private double altura`, getters, setters e métodos `area` e `perimetro`.
11. Crie `Relogio` com `private int hora`, `private int minuto` e `private int segundo`, setters com validação e um método `mostrarHora`.
12. Crie `Contato` com `private String nome` e `private String telefone`, com getters e setters.
13. Crie `Jogador` com `private int vida` entre 0 e 100 e métodos `receberDano` e `curar`.
14. Crie `ContaBancaria` com histórico de operações em um array de Strings, mantendo o encapsulamento e limitando o histórico a 10 entradas.
15. Desafio: crie `Produto` com `private double preco` e `private int quantidade`. O método `vender(int quantidade)` deve validar o estoque e atualizar o total vendido.
16. Desafio: crie `Senha` com `private int codigo` e um método `alterarCodigo` que exige o código atual e aceita apenas um novo código com 4 dígitos, entre 1000 e 9999.

## Exercícios de Sobrecarga de Métodos (até a aula 57)

**Pré-requisito:** aulas 54 a 57. Use métodos sobrecarregados, com o mesmo nome e assinaturas diferentes. Ainda não use construtores, `static` ou coleções.

1. Crie `Calculadora` com `somar(int, int)`, `somar(double, double)` e `somar(int, int, int)`.
2. Crie `Impressora` com `imprimir(String)`, `imprimir(int)` e `imprimir(String, int)`.
3. Crie `Conversor` com `paraCelsius(double)` e `paraCelsius(int)`.
4. Crie `Area` com `calcular(int lado)` e `calcular(int base, int altura)`.
5. Crie `Saudacao` com `saudar()`, `saudar(String nome)` e `saudar(String nome, int hora)`.
6. Crie `Validador` com `validar(int)` e `validar(String)`.
7. Crie `Media` com `media(int, int)`, `media(int, int, int)` e `media(double[])`.
8. Crie `Desconto` com `aplicar(double valor)` e `aplicar(double valor, double percentual)`.
9. Crie `Mensagem` com `enviar(String)`, `enviar(String, String)` e `enviar(String, String, int)`.
10. Crie `Conta` com `depositar(double)` e `depositar(double, String descricao)`.
11. Crie `Cadastro` com métodos sobrecarregados para cadastrar uma pessoa por nome, por nome e idade, e por nome, idade e cidade.
12. Crie `Relatorio` com métodos que recebem um array de inteiros, um array de doubles e uma matriz, e imprimem cada formato.
13. Desafio: crie `Texto` com métodos sobrecarregados para repetir uma palavra uma vez, duas vezes e um número informado de vezes.
14. Desafio: crie `Pagamento` com métodos sobrecarregados para calcular o total à vista, com desconto e com acréscimo por parcelas.

## Exercícios de Construtores (até a aula 59)

**Pré-requisito:** aulas 58 e 59. Use construtores, sobrecarga de construtores e validações na criação do objeto. Ainda não use `static` ou coleções.

1. Crie `Pessoa` com um construtor que recebe nome e idade e outro construtor sem parâmetros.
2. Crie `Produto` com um construtor que recebe nome e preço e outro que recebe nome, preço e quantidade.
3. Crie `Carro` com um construtor que recebe modelo e ano e outro que recebe modelo, ano e cor.
4. Crie `ContaBancaria` com um construtor que recebe titular e saldo inicial e outro que recebe apenas o titular, com saldo zero.
5. Crie `Aluno` com um construtor que recebe nome e três notas.
6. Crie `Livro` com um construtor que recebe título, autor e páginas; valide páginas maiores que zero.
7. Crie `Funcionario` com um construtor que recebe nome e salário e outro que recebe nome, salário e cargo.
8. Crie `Data` com um construtor que recebe dia, mês e ano; valide os valores.
9. Crie `Retangulo` com um construtor que recebe largura e altura; valide valores positivos.
10. Crie `Celular` com um construtor que recebe marca e modelo e outro que recebe marca, modelo e armazenamento.
11. Crie `Pedido` com um construtor que recebe nome do produto e quantidade; calcule o total com base em um preço fixo.
12. Crie `Jogador` com um construtor que recebe nome e pontuação e outro que recebe apenas o nome, com pontuação zero.
13. Crie `ContaBancaria` com um construtor que valida o saldo inicial e outro que recebe um bônus de abertura.
14. Crie uma classe `Carrinho` com um construtor que recebe um array de preços e calcula o total.
15. Desafio: crie `Funcionario` com construtores sobrecarregados e valide que o salário não pode ser negativo em nenhum deles.
16. Desafio: crie `Agenda` com um construtor que recebe a quantidade máxima de contatos e inicializa um array de nomes.

## Exercícios de Blocos de Inicialização (até a aula 60)

**Pré-requisito:** aulas 58 a 60. Use blocos de inicialização de instância, construtores e atributos. Ainda não use `static` ou coleções.

1. Crie uma classe com um bloco de inicialização que imprime "Objeto criado". Instancie três objetos.
2. Crie uma classe com um atributo, um bloco de inicialização e um construtor, todos imprimindo mensagens. Mostre a ordem de execução.
3. Crie uma classe com dois blocos de inicialização e um construtor. Mostre a ordem em que os blocos são executados.
4. Crie `Configuracao` com um bloco que define tema e idioma padrão. Instancie dois objetos e altere um deles.
5. Crie `Carrinho` com um bloco que inicializa um array de 5 posições com a palavra "vazio".
6. Crie `Conta` com um bloco que define uma data de abertura como String e um construtor que recebe o titular.
7. Crie `Jogo` com um bloco que preenche um array com valores iniciais.
8. Crie `Pedido` com um bloco que inicializa a quantidade de itens em 1 e um construtor que permite alterar essa quantidade.
9. Crie uma classe com um bloco que calcula o valor total a partir dos atributos de preço e quantidade.
10. Crie uma classe com um bloco que valida um atributo e corrige o valor caso ele esteja fora do intervalo permitido.
11. Desafio: crie uma classe com dois blocos de inicialização, sendo que o segundo usa um valor definido pelo primeiro. Mostre o resultado.
12. Desafio: crie uma classe `Cadastro` com um bloco que inicializa um array de 10 nomes e um construtor que preenche as primeiras posições.

## Exercícios de Modificador static (até a aula 63)

**Pré-requisito:** aulas 61 a 63. Use atributos estáticos, métodos estáticos e blocos de inicialização estáticos. Ainda não use `final`, herança ou coleções.

1. Crie `Contador` com um atributo `static int total` incrementado no construtor. Crie três objetos e imprima o total.
2. Crie uma classe `Matematica` com métodos `static` para soma, subtração, multiplicação e divisão.
3. Crie um método `static boolean ehPar(int n)`.
4. Crie uma classe `Util` com `static int max(int a, int b)` e `static int min(int a, int b)`.
5. Crie uma classe com um bloco `static` que inicializa um array estático com 10 números.
6. Crie uma classe com bloco `static` e bloco de instância. Mostre a ordem das mensagens ao criar dois objetos.
7. Crie `Configuracao` com atributos `static String tema` e `static String idioma`.
8. Crie `Funcionario` com `static String empresa` e um atributo de instância `nome`. Imprima os dados de dois funcionários.
9. Crie `Venda` com `static double totalVendido` e um método que soma o valor de cada venda.
10. Crie uma classe `Conversor` com métodos estáticos para converter quilômetros em milhas e Celsius em Fahrenheit.
11. Crie uma classe `Tabuada` com um método estático que imprime a tabuada de um número.
12. Crie uma classe com um bloco `static` que preenche uma tabela de preços e um método estático que consulta essa tabela.
13. Crie uma classe `Banco` com `static int totalContas`, `static double totalDepositado` e métodos estáticos para registrar contas e depósitos.
14. Explique em um comentário por que um método `static` não pode acessar diretamente um atributo de instância. Depois corrija o código passando o objeto como parâmetro.
15. Desafio: crie uma classe `Registro` com um contador estático de objetos criados e um método estático que retorna a média de um array de valores.
16. Desafio: crie uma classe com dois blocos estáticos e mostre a ordem de execução ao carregar a classe.

## Exercícios de Associação entre Objetos (até a aula 67)

**Pré-requisito:** aulas 64 a 67. Use associações um-para-um, um-para-muitos, muitos-para-um e bidirecionais, com arrays de objetos. Ainda não use coleções.

1. Crie `Endereco` e `Cliente` com um endereço. Instancie um cliente e imprima os dados.
2. Crie `Departamento` e `Funcionario` em uma associação um-para-muitos: um departamento tem um array de funcionários.
3. Crie `Funcionario` e `Departamento` em uma associação muitos-para-um: cada funcionário conhece seu departamento.
4. Crie `Autor` e `Livro` com associação bidirecional.
5. Crie `Pedido` e `ItemPedido` com composição: um pedido tem vários itens.
6. Crie `Carro` e `Motor` com composição.
7. Crie `Escola`, `Turma` e `Aluno` com associações em níveis.
8. Crie `Time` e `Jogador`.
9. Crie `Carrinho` e `Produto` com quantidades.
10. Crie `Medico` e `Paciente` com associação muitos-para-muitos usando arrays dos dois lados.
11. Crie `Casa` e `Comodo`.
12. Crie `Playlist` e `Musica`.
13. Crie `Empresa`, `Departamento` e `Funcionario`.
14. Crie `Pedido` com um array de itens e um método que calcula o total.
15. Crie `Agenda` e `Contato`.
16. Crie `Biblioteca` com arrays de livros e autores e um método que encontra os livros de um autor.
17. Desafio: crie `Curso` e `Aluno` com uma associação em que o aluno pode estar em vários cursos e o curso tem vários alunos.
18. Desafio: crie `OrdemServico` com cliente, técnico e array de peças, e calcule o valor total do serviço.

## Exercícios de Leitura de Dados pelo Console (até a aula 69)

**Pré-requisito:** aulas 68 e 69. Use `Scanner`, `System.in`, `nextInt`, `nextDouble`, `next` e `nextLine`. Ainda não use coleções.

1. Leia o nome do usuário e imprima uma saudação.
2. Leia dois números inteiros e imprima a soma.
3. Leia a idade e imprima quantos anos a pessoa terá no próximo ano.
4. Leia o preço e a quantidade de um produto e imprima o total.
5. Leia três notas e imprima a média.
6. Leia uma palavra e imprima essa palavra duas vezes.
7. Leia nome e idade e imprima uma frase completa.
8. Leia um número e imprima o dobro, o triplo e a metade.
9. Leia dois nomes e imprima o segundo antes do primeiro.
10. Leia o salário e o percentual de aumento e imprima o novo salário.
11. Leia um número inteiro e, depois, uma frase completa. Explique em um comentário como evitar o problema do `nextLine()` após o `nextInt()`.
12. Leia altura e peso e calcule o IMC.
13. Leia dia, mês e ano e imprima a data formatada.
14. Leia o nome e o preço de três produtos e imprima um recibo simples.
15. Desafio: leia o nome de um aluno e quatro notas, calcule a média e informe se ele foi aprovado, considerando média maior ou igual a 7.
16. Desafio: leia dois números e um operador, e mostre o resultado da operação usando `switch`.

## Exercícios de Associação — Projeto Integrador (até a aula 70)

**Pré-requisito:** aulas 64 a 70. Use classes, associações, arrays de objetos, métodos, encapsulamento, construtores e leitura pelo console. Ainda não use herança, interfaces ou coleções.

1. Sistema escolar: cadastre alunos e uma turma. Leia os dados pelo console e imprima o boletim de cada aluno.
2. Biblioteca: cadastre livros e autores. Permita buscar todos os livros de um autor pelo código do autor.
3. Hospital: cadastre médicos e pacientes. Agende consultas e imprima a agenda de cada médico.
4. E-commerce: cadastre clientes, produtos e pedidos. Calcule o total de cada pedido.
5. Hotel: cadastre quartos e hóspedes. Faça reservas e mostre quais quartos estão ocupados.
6. Academia: cadastre alunos e treinos. Associe cada aluno a um treino e imprima a ficha.
7. Loja de música: cadastre artistas, álbuns e músicas. Imprima o catálogo por artista.
8. Restaurante: cadastre mesas, pratos e pedidos. Feche a conta de uma mesa.
9. Locadora: cadastre veículos e clientes. Registre locações e calcule o valor por dias de uso.
10. Banco: cadastre clientes e contas. Permita depósito e saque com validação de saldo.
11. Sistema de estacionamento: cadastre vagas e veículos. Registre entrada e saída e calcule o valor a pagar.
12. Sistema de vendas: cadastre vendedores, produtos e vendas. Ao final, imprima um relatório com o total vendido por vendedor.
13. Desafio: sistema de clínica com médicos, pacientes, consultas e pagamentos, usando arrays de objetos em todas as associações.
14. Desafio: sistema de campeonato com times, jogadores e partidas. Calcule a pontuação de cada time.

## Exercícios de Herança (até a aula 75)

**Pré-requisito:** aulas 71 a 75. Use `extends`, `super`, `protected`, sobrescrita de métodos e sequência de inicialização. Ainda não use classes abstratas, interfaces ou coleções.

1. Crie `Animal` com nome e um método `emitirSom()`. Crie `Cachorro` e `Gato` que herdam e sobrescrevem o método.
2. Crie `Funcionario` com nome e salário. Crie `Gerente` e `Vendedor` com bônus diferentes.
3. Crie `Veiculo` com marca e modelo. Crie `Carro` e `Moto` com métodos específicos.
4. Crie `Conta` com titular e saldo. Crie `ContaCorrente` e `ContaPoupanca` com taxas diferentes.
5. Crie `Pessoa` com nome e idade. Crie `Aluno` e `Professor` com atributos específicos.
6. Crie `Produto` com nome e preço. Crie `Livro` e `Eletronico` com garantia.
7. Crie `Ingresso` com valor. Crie `IngressoMeia` e `IngressoVIP` com regras de preço.
8. Crie `Imovel` com endereço e valor. Crie `Casa` e `Apartamento` com atributos específicos.
9. Crie uma hierarquia `Animal` -> `Mamifero` -> `Cachorro`, usando `super` nos construtores.
10. Crie `Funcionario` com um método `calcularBonus()` e faça as subclasses sobrescreverem o método.
11. Use `protected` para permitir que uma subclasse acesse um atributo da superclasse.
12. Mostre a sequência de inicialização de uma hierarquia com blocos e construtores.
13. Chame um método da superclasse com `super` dentro de um método sobrescrito.
14. Crie `Conta` com um método `sacar`. Crie `ContaCorrente`, que sobrescreve o método cobrando uma taxa.
15. Crie uma hierarquia de `Forma` com `Retangulo`, `Circulo` e `Triangulo`, cada uma com `area()`.
16. Crie uma hierarquia de `Pagamento` com `Cartao`, `Boleto` e `Pix`, cada uma com `processar()`.
17. Desafio: crie `Animal`, `Cachorro` e `CachorroGuia`. O `CachorroGuia` deve sobrescrever um método e usar `super` para aproveitar o comportamento do pai.
18. Desafio: crie uma hierarquia de `Veiculo` com `CarroEletrico` e `CarroCombustao`, e calcule o custo por quilômetro de cada um.

## Exercícios de Sobrescrita de toString (até a aula 76)

**Pré-requisito:** aulas 71 a 76. Use herança, sobrescrita de métodos e `@Override` para implementar `toString()`.

1. Crie `Pessoa` com nome e idade e sobrescreva `toString()` para mostrar os dois dados.
2. Crie `Produto` com nome, preço e quantidade e sobrescreva `toString()`.
3. Crie `Livro` com título, autor e páginas e sobrescreva `toString()`.
4. Crie `Carro` com modelo, ano e cor e sobrescreva `toString()`.
5. Crie `Conta` com titular e saldo e sobrescreva `toString()`.
6. Crie `Pedido` com um array de itens e sobrescreva `toString()` para listar todos os itens.
7. Crie `Aluno` com nome e notas e sobrescreva `toString()`.
8. Crie `Data` com dia, mês e ano e sobrescreva `toString()` para retornar no formato `dd/mm/aaaa`.
9. Crie `Filme` com título, duração e nota e sobrescreva `toString()`.
10. Crie `Funcionario` com nome, cargo e salário e sobrescreva `toString()`.
11. Crie `Animal` e as subclasses `Cachorro` e `Gato`. Cada subclasse deve usar `super.toString()` e acrescentar seu som.
12. Crie `Endereco` e `Cliente`. O `toString()` de `Cliente` deve incluir os dados do endereço.
13. Desafio: crie uma classe `Turma` com um array de alunos e sobrescreva `toString()` para imprimir todos os alunos.
14. Desafio: crie uma hierarquia de `Produto` com `Livro` e `Eletronico`, e use `super.toString()` nas subclasses.

## Exercícios de Modificador final (até a aula 79)

**Pré-requisito:** aulas 77 a 79. Use `final` em variáveis, atributos, parâmetros, classes e métodos. Ainda não use classes abstratas, interfaces ou coleções.

1. Declare uma variável local `final` e tente alterá-la. Explique o erro em um comentário.
2. Crie um atributo `final` inicializado no construtor.
3. Crie um atributo `final` inicializado em um bloco de inicialização.
4. Crie uma referência `final` para um objeto e altere um atributo interno desse objeto.
5. Crie uma classe `final` e tente estendê-la. Explique o erro em um comentário.
6. Crie um método `final` em uma superclasse e tente sobrescrevê-lo. Explique o erro.
7. Crie constantes `static final` para uma classe de configuração.
8. Crie um array `final` e altere seus elementos.
9. Crie um método com um parâmetro `final`.
10. Use `final` em um método de cálculo de imposto para impedir que as subclasses alterem a regra.
11. Crie uma classe `Constantes` com valores `static final` e use-os em cálculos.
12. Explique a diferença entre `final` em um tipo primitivo e em um tipo referência.
13. Desafio: crie uma classe `Configuracao` com constantes `static final` para limites e use-as em validações.
14. Desafio: crie uma classe `Funcionario` com um atributo `final` de matrícula e um atributo mutável de salário.

## Exercícios de Enumeração (até a aula 83)

**Pré-requisito:** aulas 80 a 83. Use enums simples, com construtores, atributos, sobrescrita de métodos e busca por atributos.

1. Crie o enum `DiaSemana` com os sete dias, imprima todos os valores e use `switch` para dizer se o dia é útil ou fim de semana.
2. Crie o enum `Planeta` com nome, massa e raio, e um método que calcula a gravidade com a fórmula `g = G * massa / (raio * raio)`, usando uma constante `G`. Imprima a gravidade de cada planeta.
3. Crie o enum `StatusPedido` com uma descrição e um método `proximo()` que retorna o próximo status do pedido.
4. Crie o enum `Tamanho` com um multiplicador de preço e um método `calcularPreco(double precoBase)`.
5. Crie o enum `NivelAcesso` com um nível numérico e um método `podeAcessar(int nivelNecessario)`.
6. Crie o enum `Mes` com a quantidade de dias e um método `quantidadeDias(boolean bissexto)`.
7. Crie o enum `Operacao` com `aplicar(double, double)` e teste as quatro operações.
8. Crie um enum `Planeta` com código e nome e busque um valor pelo código usando um laço sobre `values()`.
9. Crie o enum `Turno` com hora de início e fim e um método `horasTrabalhadas()`.
10. Crie o enum `Cargo` com salário base e um método `salarioComBonus(double percentual)`.
11. Crie o enum `Prioridade` com um peso e um método `maisPrioritaria(Prioridade outra)`.
12. Use um enum `DiaSemana` em um `switch` para imprimir uma mensagem diferente para cada dia.
13. Crie um enum `Operacao` com um método abstrato implementado por cada constante.
14. Crie o enum `Moeda` com símbolo e um método `formatar(double valor)`.
15. Crie o enum `FormaPagamento` com taxa e um método `total(double valor)`.
16. Crie o enum `NivelJogo` com pontos necessários e um método que retorna o nível a partir dos pontos.
17. Desafio: crie o enum `Instrucao` com um código e um método que executa uma operação simples sobre dois números, usando `switch`.
18. Desafio: crie o enum `StatusEntrega` com prazos em dias e um método que retorna o prazo total a partir de uma quantidade de itens.

## Exercícios de Classes Abstratas (até a aula 86)

**Pré-requisito:** aulas 84 a 86. Use classes abstratas, métodos abstratos e métodos concretos. Ainda não use interfaces ou coleções.

1. Crie a classe abstrata `Animal` com nome, o método abstrato `emitirSom()` e um método concreto `apresentar()` que imprime o nome e o som.
2. Crie a classe abstrata `Forma` com `area()` abstrato e `descricao()` concreto. Crie `Retangulo` e `Circulo` e imprima a descrição de cada um.
3. Crie a classe abstrata `Funcionario` com `calcularSalario()` abstrato e `calcularBonus()` concreto, que retorna 10% do salário. Crie `Gerente` e `Vendedor`.
4. Crie a classe abstrata `Veiculo` com `consumo()` abstrato e `custoPorKm(double precoCombustivel)` concreto. Compare o custo de um carro e de uma moto.
5. Crie a classe abstrata `Conta` com `taxa()` abstrato e `aplicarTaxa()` concreto. Simule um depósito e a cobrança da taxa em dois tipos de conta.
6. Crie a classe abstrata `Produto` com `precoFinal()` abstrato e `desconto(double percentual)` concreto. Crie `Livro` e `Eletronico`.
7. Crie a classe abstrata `Empregado` com `bonus()` abstrato e `salarioTotal()` concreto. Crie `Horista` e `Mensalista`.
8. Crie a classe abstrata `Jogo` com `iniciar()` abstrato e `executar()` concreto, que chama `iniciar()` e imprime "Fim do jogo".
9. Crie a classe abstrata `Instrumento` com `tocar()` abstrato e `afinar()` concreto. Crie `Violao` e `Piano`.
10. Crie a classe abstrata `Eletrodomestico` com `consumo()` abstrato e `custoMensal(double tarifa)` concreto. Compare dois aparelhos.
11. Crie a classe abstrata `PrepararBebida` com o método concreto `preparar()`, que chama as etapas abstratas `ferverAgua()`, `adicionarIngrediente()` e `servir()`. Crie `Cafe` e `Cha`.
12. Crie uma classe abstrata com construtor e atributo `protected`. Crie uma subclasse que chama `super` e imprime o atributo.
13. Crie um array de formas abstratas, calcule a soma das áreas e encontre a forma de maior área.
14. Crie uma classe abstrata com um método concreto `validarPreco(double)` e um método abstrato `executar()`. Use a validação nas subclasses.
15. Crie uma classe abstrata `Conta` com regras comuns de depósito e saque e o método abstrato `taxa()`. Simule operações em uma conta corrente e em uma poupança.
16. Crie uma classe abstrata `Pagamento` com o método concreto `validar()` e o abstrato `processar()`. Crie `Cartao` e `Boleto`.
17. Desafio: crie a classe abstrata `Relatorio` com o método concreto `gerar()`, que chama `cabecalho()`, `corpo()` e `rodape()`. Crie `RelatorioVendas` e `RelatorioEstoque`.
18. Desafio: crie a classe abstrata `Funcionario` com `calcularSalario()` abstrato, as subclasses `Horista` e `Mensalista` e um relatório de folha de pagamento com o total.

## Exercícios de Interfaces (até a aula 89)

**Pré-requisito:** aulas 87 a 89. Use interfaces, implementação de múltiplas interfaces, atributos e métodos estáticos em interfaces. Ainda não use lambdas ou coleções.

1. Crie a interface `Imprimivel` com `imprimir()` e implemente-a em `Relatorio` e `Etiqueta`. Guarde os dois em um array de `Imprimivel` e imprima tudo.
2. Crie a interface `Pagavel` com `calcularPagamento()` e implemente-a em `Boleto`, `Cartao` e `Pix`. Processe todos e some os valores.
3. Crie a interface `Notificavel` com `notificar(String mensagem)` e implemente-a em `Email` e `Sms`. Envie a mesma mensagem pelos dois canais.
4. Crie as interfaces `Voavel` e `Nadavel` e uma classe `Pato` que implementa as duas. Chame os dois comportamentos.
5. Crie a interface `Reprodutor` com `play()`, `pause()` e `stop()`, e implemente-a em `Musica` e `Video`.
6. Crie a interface `Calculavel` com `calcular()` e implemente-a em `Retangulo` e `Circulo`. Some as áreas usando um array do tipo da interface.
7. Crie a interface `Autenticavel` com `autenticar(int codigo)` e implemente-a em `Usuario` e `Administrador`, com regras diferentes.
8. Crie a interface `Armazenavel` com `salvar()` e `carregar()`, e implemente-a em `Arquivo` e `Memoria`.
9. Crie uma interface com um método `default` e mostre uma classe usando o método sem implementá-lo. Depois sobrescreva o método em outra classe.
10. Crie uma interface com um método `static` e use-o para criar um objeto.
11. Crie uma interface com uma constante `TAXA` e use-a no cálculo de um valor.
12. Crie a interface `Forma` com `area()` e `perimetro()`, implemente-a em `Retangulo` e `Circulo` e compare os resultados.
13. Crie duas interfaces com métodos de mesmo nome e uma classe que implementa as duas, resolvendo o conflito com `Interface.super`.
14. Crie uma interface `Funcionario` com `calcularBonus()` e implemente-a em `Gerente` e `Vendedor`. Calcule a folha de pagamento.
15. Crie as interfaces `Cliente` e `Fornecedor` e uma classe `Parceiro` que implementa as duas, com métodos distintos para cada papel.
16. Crie a interface `Notificacao` com `enviar()` e implemente-a em `Email`, `Sms` e `WhatsApp`. Use um array do tipo da interface para enviar todas as notificações.
17. Desafio: crie a interface `Imposto` com `calcularImposto()` e implemente-a em `PessoaFisica` e `PessoaJuridica`. Calcule o total de impostos de um array de contribuintes.
18. Desafio: crie a interface `Repositorio` com métodos de inclusão, busca, atualização e remoção, e implemente-a em memória. Use o repositório pela interface.

## Exercícios de Polimorfismo (até a aula 94)

**Pré-requisito:** aulas 90 a 94. Use polimorfismo, parâmetros polimórficos, cast e `instanceof`. Ainda não use lambdas, streams ou coleções.

1. Crie um array de `Animal` com `Cachorro` e `Gato` e chame `emitirSom()` em cada elemento.
2. Crie um array de `Funcionario` com `Gerente` e `Vendedor` e calcule a folha de pagamento.
3. Crie um array de `Forma` com retângulos e círculos e some as áreas.
4. Crie um array de `Conta` com contas correntes e poupanças e aplique as taxas.
5. Crie um array de `Veiculo` com carros e motos e acelere cada um.
6. Crie um método que recebe um `Animal` e imprime o som, e chame-o com objetos diferentes.
7. Crie um método que recebe uma `Forma` e retorna a área, e use-o com subclasses.
8. Use `instanceof` para descobrir se um objeto é `Cachorro` ou `Gato` antes de chamar um método específico.
9. Use cast explícito para acessar um método exclusivo de uma subclasse.
10. Crie uma interface `Pagamento` e um array de pagamentos com `Cartao`, `Boleto` e `Pix`.
11. Crie um array de `Produto` com `Livro` e `Eletronico` e aplique descontos diferentes.
12. Crie um array de `Ingresso` com meia e VIP e calcule o total arrecadado.
13. Crie um array de `Instrumento` e chame `tocar()` em cada um.
14. Crie um array de `Notificacao` e envie todas as mensagens.
15. Crie um método polimórfico que recebe uma interface e executa a operação sem conhecer a classe concreta.
16. Crie uma classe `Funcionario` com `calcularBonus()` e use polimorfismo para calcular o bônus de tipos diferentes.
17. Desafio: crie um sistema de pagamentos com uma interface, um array de pagamentos e um relatório final por tipo.
18. Desafio: crie uma hierarquia de `Animal` e use `instanceof` e cast para tratar cada animal de forma específica em um zoológico.

## Exercícios de Exceções (até a aula 105)

**Pré-requisito:** aulas 95 a 105. Use `try`, `catch`, `finally`, `throw`, exceções checked e unchecked, multi-catch, try-with-resources e exceções customizadas. Ainda não use coleções.

1. Provogue uma divisão por zero e capture a `ArithmeticException`, imprimindo uma mensagem amigável.
2. Acesse um índice inválido de um array e capture a `ArrayIndexOutOfBoundsException`.
3. Acesse um atributo por uma referência nula e capture a `NullPointerException`.
4. Crie um bloco `try` com `catch` e `finally` e mostre a ordem das mensagens.
5. Crie um `try` com dois `catch` diferentes para tratar dois tipos de erro.
6. Use multi-catch para tratar `ArithmeticException` e `NullPointerException` no mesmo bloco.
7. Lance uma `IllegalArgumentException` quando uma idade for negativa.
8. Crie a exceção unchecked `SaldoInsuficienteException` e lance-a em um saque sem saldo.
9. Crie a exceção checked `ValidacaoException` e use `throws` em um método de cadastro.
10. Crie uma exceção checked para falha de login e trate-a no `main`.
11. Crie uma classe que implementa `AutoCloseable` e use try-with-resources.
12. Crie um método que lança uma exceção e outro que a propaga até o `main`.
13. Lance uma exceção dentro de um construtor quando um dado inválido for recebido.
14. Crie uma superclasse com um método que lança uma exceção e uma subclasse que sobrescreve o método lançando uma exceção mais específica.
15. Use `finally` para garantir a impressão de uma mensagem de encerramento, mesmo quando ocorrer erro.
16. Valide um cadastro de produto com exceções para nome nulo, preço negativo e quantidade negativa.
17. Crie um método `sacar` que lança `SaldoInsuficienteException` e trate o erro no `main`.
18. Crie um método `adicionarEstoque` que lança uma exceção quando a quantidade for negativa.
19. Crie uma hierarquia de exceções com uma exceção base e duas específicas.
20. Use try-with-resources com dois recursos e mostre a ordem de fechamento.
21. Desafio: crie um sistema de matrícula que valide idade, nota e curso, lançando exceções específicas para cada problema.
22. Desafio: crie um método que recebe um array e um índice, valida os dois e lança exceções diferentes para array nulo, índice negativo e índice fora dos limites.

## Exercícios de Wrappers (até a aula 107)

**Pré-requisito:** aulas 106 e 107. Use classes wrapper, autoboxing, unboxing e métodos de conversão como `parseInt` e `parseDouble`.

1. Declare um `Integer` e um `int`, atribua um ao outro e mostre o autoboxing e o unboxing.
2. Converta a String "123" para `int` usando `Integer.parseInt`.
3. Converta a String "19.90" para `double` usando `Double.parseDouble`.
4. Converta "true" para `boolean` usando `Boolean.parseBoolean`.
5. Imprima `Integer.MAX_VALUE` e `Integer.MIN_VALUE`.
6. Compare dois `Integer` usando `compare`.
7. Converta um `int` para String usando `Integer.toString`.
8. Use `Character.isDigit` e `Character.isLetter` para classificar caracteres.
9. Leia uma String numérica, converta para `int` e calcule o dobro.
10. Converta um número decimal para binário e hexadecimal usando os métodos de conversão.
11. Crie um array de `Integer` e calcule a soma dos valores.
12. Provogue um unboxing de um `Integer` nulo e capture a `NullPointerException`.
13. Desafio: leia três Strings numéricas, converta para `double` e calcule a média.
14. Desafio: crie um método que recebe uma String e tenta convertê-la para `int`, tratando `NumberFormatException`.

## Exercícios de Strings e StringBuilder (até a aula 111)

**Pré-requisito:** aulas 108 a 111. Use métodos da classe `String`, comparação com `equals`, concatenação e `StringBuilder`.

1. Leia uma palavra e imprima seu tamanho e o caractere da primeira e da última posição.
2. Leia uma frase e imprima os primeiros 10 caracteres usando `substring`.
3. Leia uma palavra e imprima-a em maiúsculas e em minúsculas.
4. Leia uma frase com espaços no início e no fim e imprima-a sem esses espaços.
5. Leia uma frase e troque todas as ocorrências de uma palavra por outra.
6. Leia uma frase separada por vírgulas e imprima cada parte em uma linha.
7. Verifique se uma frase contém uma palavra específica e se começa e termina com determinados textos.
8. Encontre a primeira e a última posição de uma letra em uma frase.
9. Compare duas Strings com `==` e com `equals` e explique a diferença.
10. Concatene duas Strings usando `+` e usando `concat`.
11. Use `StringBuilder` para montar uma frase com várias partes.
12. Use `StringBuilder` para inverter uma palavra.
13. Verifique se uma palavra é palíndromo.
14. Conte quantas vogais existem em uma frase.
15. Coloque a primeira letra de cada palavra de uma frase em maiúscula.
16. Remova todos os espaços de uma frase.
17. Formate um CPF a partir de 11 dígitos usando `substring` e concatenação.
18. Verifique se duas palavras são anagramas.
19. Desafio: valide uma senha com pelo menos 8 caracteres, uma letra maiúscula, uma minúscula e um número, usando `charAt` e um laço.
20. Desafio: compacte uma String usando run-length encoding. Por exemplo, "aaabbc" deve virar "a3b2c1".

## Exercícios de Datas Legadas (até a aula 118)

**Pré-requisito:** aulas 112 a 118. Use `Date`, `Calendar`, `DateFormat`, `SimpleDateFormat`, `Locale` e `NumberFormat`.

1. Crie uma `Date` com a data e hora atuais e imprima o valor.
2. Use `Calendar` para obter ano, mês, dia, hora, minuto e segundo atuais.
3. Use `Calendar` para adicionar 10 dias a uma data e imprima o resultado.
4. Formate uma `Date` no padrão `dd/MM/yyyy` com `SimpleDateFormat`.
5. Converta a String "25/12/2026" para `Date` usando `SimpleDateFormat`.
6. Formate a mesma data em português e em inglês usando `Locale`.
7. Formate um valor monetário em real e em dólar usando `NumberFormat` e `Locale`.
8. Formate um número decimal com separador de milhar e duas casas decimais.
9. Compare duas datas e informe qual é a mais recente.
10. Calcule a idade de uma pessoa a partir da data de nascimento.
11. Calcule quantos dias existem entre duas datas.
12. Descubra o último dia do mês de uma data.
13. Descubra o primeiro dia do mês seguinte a uma data.
14. Formate uma data em três locales diferentes e imprima os resultados.
15. Desafio: valide se uma String representa uma data real, tratando datas inválidas com `ParseException`.
16. Desafio: gere um relatório com a data atual, a data de ontem e a data de amanhã, cada uma em um formato diferente.

## Exercícios de java.time (até a aula 129)

**Pré-requisito:** aulas 119 a 129. Use `LocalDate`, `LocalTime`, `LocalDateTime`, `Instant`, `Duration`, `Period`, `ChronoUnit`, `TemporalAdjusters`, `TemporalAdjuster`, `ZonedDateTime`, `ZoneId`, `OffsetDateTime` e `DateTimeFormatter`.

1. Imprima a data atual com `LocalDate.now()`.
2. Crie uma data específica com `LocalDate.of()` e imprima o dia da semana.
3. Adicione 15 dias e subtraia 2 meses de uma data.
4. Calcule o `Period` entre duas datas e imprima anos, meses e dias.
5. Imprima a hora atual com `LocalTime.now()`.
6. Crie um `LocalDateTime` e imprima data e hora juntas.
7. Crie um `Instant` e converta-o para `LocalDateTime`.
8. Calcule a `Duration` entre dois horários.
9. Use `ChronoUnit` para calcular a diferença em dias, meses e anos entre duas datas.
10. Use `TemporalAdjusters.next(DayOfWeek.FRIDAY)` para encontrar a próxima sexta-feira.
11. Crie um `TemporalAdjuster` customizado que retorna o primeiro dia útil do mês.
12. Crie um `ZonedDateTime` para o fuso de São Paulo e outro para Tóquio.
13. Converta um horário de São Paulo para Tóquio usando `ZoneId`.
14. Crie um `OffsetDateTime` e imprima o offset.
15. Formate uma data com `DateTimeFormatter` no padrão `dd/MM/yyyy`.
16. Faça o parse de uma String de data usando `DateTimeFormatter`.
17. Calcule a idade de uma pessoa com `Period`.
18. Calcule quantos dias úteis existem entre duas datas, ignorando sábados e domingos.
19. Descubra quantos dias tem o mês de uma data específica.
20. Valide se uma data existe, tratando `DateTimeParseException`.
21. Desafio: agende uma reunião entre pessoas de três fusos horários e mostre o horário local de cada uma.
22. Desafio: gere um relatório de um período com todas as datas, dias da semana e finais de semana.

## Exercícios de ResourceBundle (até a aula 130)

**Pré-requisito:** aulas 112 a 130. Use `ResourceBundle`, arquivos `.properties` e `Locale` para internacionalizar textos.

1. Crie os arquivos `mensagens.properties`, `mensagens_pt_BR.properties` e `mensagens_en_US.properties` com uma saudação e carregue o bundle para o locale padrão.
2. Carregue o bundle em português e em inglês e imprima a mesma chave nos dois idiomas.
3. Crie uma chave ausente em um dos arquivos e mostre o comportamento de fallback para o bundle padrão.
4. Crie um menu com três opções internacionalizadas.
5. Crie mensagens de erro para saldo insuficiente em dois idiomas.
6. Use `ResourceBundle` para formatar uma mensagem com o nome do usuário.
7. Liste todas as chaves de um bundle usando `keySet()`.
8. Crie um bundle para três idiomas e altere o `Locale` padrão durante a execução.
9. Crie mensagens para um sistema de login em português e inglês.
10. Crie um bundle com textos de um recibo e gere o recibo em dois idiomas.
11. Desafio: crie um sistema de cadastro com validações e mensagens de erro internacionalizadas.
12. Desafio: crie um bundle com nomes de meses e dias da semana e imprima um calendário simples em dois idiomas.

## Exercícios de Regex (até a aula 136)

**Pré-requisito:** aulas 131 a 136. Use `Pattern`, `Matcher`, metacaracteres, ranges, quantificadores e âncoras.

1. Valide se uma String está no formato de CPF `000.000.000-00`.
2. Valide um e-mail simples com letras, números, ponto, arroba e domínio.
3. Valide um telefone no formato `(00) 00000-0000`.
4. Valide um CEP no formato `00000-000`.
5. Extraia todos os números de uma frase.
6. Extraia todas as palavras de uma frase.
7. Substitua todos os espaços múltiplos de uma frase por um único espaço.
8. Separe uma frase por vírgulas usando `split`.
9. Valide datas no formato `dd/MM/yyyy`.
10. Valide horários no formato `HH:mm`.
11. Valide uma senha com pelo menos uma letra maiúscula, uma minúscula e um número.
12. Valide uma URL simples que comece com `http://` ou `https://`.
13. Encontre todas as hashtags de um texto.
14. Encontre todas as menções no formato `@usuario`.
15. Use quantificadores para encontrar palavras com exatamente 5 letras.
16. Use âncoras para verificar se uma String inteira corresponde a um padrão.
17. Use ranges para validar apenas letras maiúsculas.
18. Use grupos de captura para extrair dia, mês e ano de uma data.
19. Use grupos nomeados para extrair o nome e o domínio de um e-mail.
20. Use `Matcher.find()` e `Matcher.group()` para listar todas as ocorrências de um padrão.
21. Desafio: extraia de um log as datas, os níveis de erro e as mensagens.
22. Desafio: valide uma placa de carro nos formatos antigo e Mercosul.

## Exercícios de Scanner — Tokens e Delimitadores (até a aula 137)

**Pré-requisito:** aulas 68, 69 e 137. Use `Scanner`, `useDelimiter`, `hasNext`, `hasNextInt`, `next` e `nextLine`.

1. Leia uma linha com nomes separados por vírgula e imprima cada nome em uma linha.
2. Leia uma linha no formato `nome;idade;cidade` e imprima os três valores separadamente.
3. Leia vários números separados por espaço e calcule a soma.
4. Use `hasNextInt()` para ler números até encontrar um texto e então pare.
5. Use `useDelimiter(",")` para ler uma sequência de valores separados por vírgula.
6. Crie um `Scanner` a partir de uma String e leia três palavras.
7. Leia uma linha com valores separados por `|` e converta cada valor para inteiro.
8. Leia uma sequência de tokens e pule os dois primeiros antes de imprimir o restante.
9. Leia nomes completos separados por ponto e vírgula.
10. Leia uma linha de um mini CSV com cabeçalho e valores e imprima os pares chave-valor.
11. Desafio: leia uma linha de log no formato `data;nível;mensagem` e separe os campos.
12. Desafio: leia uma lista de produtos com nome, preço e quantidade separados por vírgula e calcule o total.

## Exercícios de IO (até a aula 143)

**Pré-requisito:** aulas 138 a 143. Use `File`, `FileWriter`, `FileReader`, `BufferedWriter`, `BufferedReader` e manipulação de diretórios.

1. Crie um objeto `File` para um arquivo e verifique se ele existe.
2. Crie um diretório e verifique se ele foi criado.
3. Liste os arquivos de um diretório.
4. Escreva um texto em um arquivo usando `FileWriter`.
5. Adicione uma nova linha ao final de um arquivo existente.
6. Leia um arquivo de texto usando `FileReader`.
7. Escreva várias linhas em um arquivo usando `BufferedWriter`.
8. Leia um arquivo linha por linha usando `BufferedReader` e numere as linhas.
9. Copie o conteúdo de um arquivo para outro.
10. Conte quantas linhas existem em um arquivo.
11. Conte quantas palavras existem em um arquivo.
12. Procure uma palavra em um arquivo e imprima as linhas em que ela aparece.
13. Apague um arquivo e verifique se ele deixou de existir.
14. Renomeie um arquivo e confirme o novo nome.
15. Junte o conteúdo de dois arquivos em um terceiro.
16. Crie um arquivo de log e registre três mensagens com data e hora.
17. Desafio: leia um CSV simples e imprima os registros formatados.
18. Desafio: crie um backup de um diretório, copiando todos os arquivos de texto para outro diretório.

## Exercícios de NIO (até a aula 158)

**Pré-requisito:** aulas 144 a 158. Use `Path`, `Paths`, `Files`, normalização, resolução, `BasicFileAttributes`, `DosFileAttribute`, `PosixFileAttributes`, `DirectoryStream`, `SimpleFileVisitor`, `PathMatcher` e `ZipOutputStream`.

1. Crie um `Path` para um arquivo e imprima o caminho absoluto.
2. Verifique se um arquivo existe com `Files.exists`.
3. Crie um arquivo vazio com `Files.createFile`.
4. Crie um diretório com `Files.createDirectory`.
5. Escreva um texto em um arquivo com `Files.write`.
6. Leia todas as linhas de um arquivo com `Files.readAllLines`.
7. Copie um arquivo com `Files.copy`.
8. Mova um arquivo com `Files.move`.
9. Apague um arquivo com `Files.delete`.
10. Normalize um caminho que contém `..` e `.`.
11. Resolva um caminho relativo a partir de um diretório.
12. Calcule o caminho relativo entre dois diretórios com `relativize`.
13. Leia os atributos básicos de um arquivo com `BasicFileAttributes`.
14. Marque um arquivo como somente leitura usando `DosFileAttributeView`.
15. Leia as permissões de um arquivo com `PosixFileAttributes`.
16. Liste os arquivos de um diretório com `DirectoryStream`.
17. Percorra uma árvore de diretórios com `SimpleFileVisitor` e conte os arquivos.
18. Use `PathMatcher` para listar apenas arquivos `.txt`.
19. Compacte um arquivo em um `.zip` com `ZipOutputStream`.
20. Percorra uma árvore de diretórios com `Files.walkFileTree` e imprima os caminhos.
21. Desafio: organize os arquivos de um diretório em subpastas por extensão.
22. Desafio: compacte um diretório inteiro em um arquivo `.zip`, preservando a estrutura de pastas.

## Exercícios de Serialização (até a aula 160)

**Pré-requisito:** aulas 159 e 160. Use `Serializable`, `ObjectOutputStream`, `ObjectInputStream`, `transient` e `serialVersionUID`.

1. Crie uma classe `Pessoa` serializável com nome e idade e grave um objeto em arquivo.
2. Leia o arquivo do exercício anterior e reconstrua o objeto.
3. Marque um atributo como `transient` e mostre que ele não é recuperado após a desserialização.
4. Defina um `serialVersionUID` em uma classe serializável.
5. Serialize um array de objetos.
6. Serialize um objeto de uma subclasse e verifique o comportamento dos atributos herdados.
7. Grave três objetos no mesmo arquivo e leia os três na mesma ordem.
8. Verifique se o arquivo de serialização foi criado e imprima seu tamanho.
9. Altere a classe após a serialização e observe o efeito na desserialização.
10. Crie uma classe de configuração serializável e salve os dados em arquivo.
11. Desafio: crie um sistema de cadastro que salva e carrega um array de clientes em disco.
12. Desafio: implemente `writeObject` e `readObject` para controlar manualmente um atributo durante a serialização.

## Exercícios de equals, hashCode e Big-O (até a aula 165)

**Pré-requisito:** aulas 161 a 165. Use `equals`, `hashCode` e análise de complexidade. Ainda não use coleções.

1. Sobrescreva `equals` em `Pessoa` comparando nome e idade.
2. Sobrescreva `hashCode` em `Pessoa` de forma coerente com `equals`.
3. Teste a reflexividade, a simetria e a transitividade do `equals`.
4. Crie uma subclasse e verifique o comportamento do `equals` com herança.
5. Mostre que dois objetos iguais precisam ter o mesmo `hashCode`.
6. Compare dois arrays manualmente, elemento por elemento, e imprima se são iguais.
7. Implemente uma busca linear e conte quantas comparações foram feitas.
8. Implemente uma busca binária e conte quantas comparações foram feitas.
9. Implemente bubble sort e conte quantas comparações e trocas ocorreram.
10. Explique a complexidade O(n) de uma busca linear.
11. Explique a complexidade O(n²) do bubble sort.
12. Compare o número de operações de uma busca linear e de uma busca binária em um array de 1.000 elementos.
13. Crie uma classe `Chave` com dois atributos e implemente `equals` e `hashCode`.
14. Compare duas Strings com `equals` e explique por que `==` pode falhar.
15. Meça o tempo de execução de um laço simples e de um laço aninhado com `System.currentTimeMillis`.
16. Escolha entre busca linear e busca binária para um array ordenado e justifique.
17. Desafio: implemente `equals` e `hashCode` para `Produto` considerando nome, preço e quantidade.
18. Desafio: crie um método que compara dois arrays de objetos usando `equals` e retorna quantos elementos coincidem.

## Exercícios de List (até a aula 168)

**Pré-requisito:** aulas 166 a 168. Use `List`, `ArrayList` e `LinkedList`. Ainda não use `Collections.sort`, `Set` ou `Map`.

1. Crie uma `ArrayList` de nomes, adicione cinco nomes e imprima a lista.
2. Adicione um elemento em uma posição específica da lista.
3. Remova um elemento pelo índice e outro pelo próprio objeto.
4. Procure um nome na lista e informe se ele existe.
5. Percorra a lista com `for` e com `foreach`, imprimindo cada elemento.
6. Repita os primeiros exercícios usando `LinkedList`.
7. Crie uma lista de objetos `Produto` e imprima todos.
8. Remova os valores duplicados de uma lista sem usar `Set`.
9. Encontre o maior valor de uma lista de inteiros.
10. Junte duas listas em uma terceira.
11. Divida uma lista em duas listas menores.
12. Simule um carrinho de compras com uma lista de produtos e calcule o total.
13. Crie uma agenda de contatos usando uma lista de objetos.
14. Crie uma playlist com uma lista de músicas e permita adicionar e remover.
15. Desafio: crie um controle de estoque com uma lista de produtos e métodos para adicionar, remover e buscar por nome.
16. Desafio: compare o desempenho de `ArrayList` e `LinkedList` em inserções no início e no fim da lista.

## Exercícios de Ordenação, Comparable, Comparator, Busca e Iterator (até a aula 174)

**Pré-requisito:** aulas 169 a 174. Use `Collections.sort`, `Comparable`, `Comparator`, busca binária, conversão entre lista e array e `Iterator`.

1. Ordene uma lista de inteiros com `Collections.sort`.
2. Ordene uma lista de Strings em ordem alfabética.
3. Crie uma classe `Produto` que implementa `Comparable` e ordene por preço.
4. Ordene uma lista de produtos por nome usando `Comparator`.
5. Ordene a mesma lista em ordem reversa.
6. Faça uma busca binária em uma lista ordenada de inteiros.
7. Use `binarySearch` para encontrar o ponto de inserção de um valor que não está na lista.
8. Use `Iterator` para remover os números pares de uma lista.
9. Use `ListIterator` para percorrer uma lista nos dois sentidos.
10. Converta uma lista para array e imprima o array.
11. Converta um array para lista e ordene a lista.
12. Ordene uma lista de nomes pelo tamanho do nome.
13. Ordene uma lista de produtos por preço e, em caso de empate, por nome.
14. Crie um `Comparator` customizado que ordena palavras pela quantidade de vezes que uma letra específica aparece nelas.
15. Ordene uma lista de datas.
16. Faça uma busca binária em uma lista de objetos ordenados por nome.
17. Use `Iterator` para somar todos os valores de uma lista.
18. Remova elementos de uma lista enquanto a percorre, usando `Iterator`.
19. Desafio: ordene uma lista de produtos por categoria e, dentro de cada categoria, por preço.
20. Desafio: crie um ranking de jogadores com `Comparator`, ordenando por pontos e, em caso de empate, por nome.
21. Desafio: implemente uma busca binária manual em uma lista ordenada, sem usar `Collections.binarySearch`.

## Exercícios de Set, HashSet, NavigableSet e TreeSet (até a aula 177)

**Pré-requisito:** aulas 175 a 177. Use `Set`, `HashSet`, `LinkedHashSet`, `NavigableSet` e `TreeSet`.

1. Crie um `HashSet` de nomes e mostre que valores duplicados não são adicionados.
2. Crie um `LinkedHashSet` e mostre que a ordem de inserção é preservada.
3. Crie um `TreeSet` de números e mostre que os elementos ficam ordenados.
4. Imprima o primeiro e o último elemento de um `TreeSet`.
5. Use `headSet` e `tailSet` para obter subconjuntos.
6. Use `subSet` para obter um intervalo de valores.
7. Use `ceiling`, `floor`, `higher` e `lower` para consultar vizinhos.
8. Imprima um `TreeSet` em ordem decrescente com `descendingSet`.
9. Use `pollFirst` e `pollLast` para remover o primeiro e o último elemento.
10. Remova os valores duplicados de uma lista usando um `Set`.
11. Calcule a união e a interseção de dois conjuntos.
12. Coloque objetos `Produto` em um `TreeSet` usando `Comparable`.
13. Coloque objetos em um `TreeSet` usando um `Comparator`.
14. Use um `Set` para listar as palavras únicas de um texto e depois conte quantas vezes cada uma aparece no texto original.
15. Desafio: crie um cadastro de alunos com um `Set` e impeça matrículas duplicadas.
16. Desafio: compare o desempenho de `HashSet`, `LinkedHashSet` e `TreeSet` em uma busca com muitos elementos.

## Exercícios de Map, HashMap, LinkedHashMap, NavigableMap e TreeMap (até a aula 181)

**Pré-requisito:** aulas 178 a 181. Use `Map`, `HashMap`, `LinkedHashMap`, `NavigableMap` e `TreeMap`.

1. Crie um `HashMap` com nomes e idades, adicione três pares e imprima o mapa.
2. Recupere um valor pela chave e trate o caso de chave inexistente.
3. Verifique se uma chave existe com `containsKey`.
4. Remova um par pela chave.
5. Percorra as chaves, os valores e os pares de um mapa.
6. Use `computeIfAbsent` para criar uma lista de valores por chave.
7. Use `merge` para somar valores de uma mesma chave.
8. Crie um `TreeMap` e imprima as chaves em ordem.
9. Imprima a primeira e a última chave de um `TreeMap`.
10. Use `headMap` e `tailMap` para obter intervalos de chaves.
11. Use `subMap` para obter um intervalo entre duas chaves.
12. Conte a frequência de palavras de um texto usando um `Map`.
13. Crie um controle de estoque com nome do produto e quantidade.
14. Crie uma agenda telefônica com nome e telefone.
15. Agrupe produtos por categoria usando um `Map` de listas.
16. Use `LinkedHashMap` e mostre que a ordem de inserção é preservada.
17. Desafio: crie um sistema de votação que conta votos por candidato e imprime o vencedor.
18. Desafio: crie um mapa de alunos por turma e calcule a média de cada turma.
19. Desafio: implemente um cache simples com `HashMap`, verificando se o valor já foi calculado.

## Exercícios de Queue e PriorityQueue (até a aula 182)

**Pré-requisito:** aulas 178 a 182. Use `Queue`, `LinkedList` como fila e `PriorityQueue`.

1. Crie uma `Queue` de nomes e adicione três elementos com `add`.
2. Use `offer`, `poll` e `peek` e explique a diferença entre eles.
3. Use uma `LinkedList` como fila e atenda os elementos na ordem de chegada.
4. Crie uma `PriorityQueue` de números e mostre que o menor sai primeiro.
5. Crie uma `PriorityQueue` com ordem reversa usando `Comparator`.
6. Crie uma `PriorityQueue` de tarefas com prioridade e execute a mais prioritária primeiro.
7. Simule uma fila de impressão com documentos e seus tamanhos.
8. Simule um pronto-socorro com pacientes e níveis de urgência.
9. Crie uma `PriorityQueue` de objetos `Pedido` ordenados por valor.
10. Remova um elemento específico de uma fila e mostre o resultado.
11. Desafio: simule um sistema de atendimento com fila normal e fila prioritária.
12. Desafio: junte duas filas ordenadas em uma terceira fila mantendo a ordem.

## Exercícios de Generics (até a aula 188)

**Pré-requisito:** aulas 183 a 188. Use classes genéricas, métodos genéricos, tipos limitados e wildcards.

1. Crie uma classe genérica `Caixa<T>` que guarda um valor e o retorna.
2. Crie um método genérico `imprimirArray(T[] array)`.
3. Crie uma classe genérica com dois tipos, `Par<A, B>`.
4. Crie um método genérico que recebe dois valores e retorna o maior, usando `Comparable`.
5. Crie um método com `? extends Number` que soma uma lista de números.
6. Crie um método com `? super Integer` que adiciona números a uma lista.
7. Crie uma pilha genérica com `push`, `pop` e `peek`.
8. Crie um repositório genérico com operações de adicionar, buscar e remover.
9. Crie uma interface genérica `Repositorio<T>` e uma implementação para `Produto`.
10. Crie um método genérico que recebe uma lista e um `Comparator` e retorna o maior elemento.
11. Crie uma classe genérica `Cache<T>` com limite de elementos.
12. Explique em um comentário por que não é possível criar um array de tipo genérico diretamente.
13. Crie um método genérico que converte um array em uma lista.
14. Crie uma classe genérica que representa um resultado com sucesso ou erro.
15. Desafio: crie uma classe genérica `Fila<T>` com operações de enfileirar e desenfileirar.
16. Desafio: crie um método genérico que recebe duas listas e retorna uma terceira com os elementos intercalados.
17. Desafio: crie um `Repositorio<T>` genérico com um método de filtro que recebe uma interface própria de validação.
18. Desafio: use wildcards para criar um método que copia elementos de uma lista de um tipo para outra lista de supertipo.

## Exercícios de Classes Internas (até a aula 192)

**Pré-requisito:** aulas 189 a 192. Use classes aninhadas, classes locais, classes anônimas e classes aninhadas estáticas.

1. Crie uma classe externa com uma classe interna e instancie a interna.
2. Acesse um atributo da classe externa a partir da classe interna.
3. Crie uma classe local dentro de um método e use-a.
4. Crie uma classe anônima que implementa uma interface.
5. Crie uma classe anônima que estende uma classe.
6. Crie uma classe aninhada estática e instancie-a sem criar a classe externa.
7. Use uma classe interna para implementar um contador.
8. Use uma classe anônima como `Comparator` para ordenar uma lista.
9. Use uma classe local para validar um valor dentro de um método.
10. Crie uma classe aninhada estática que cria e configura instâncias da classe externa.
11. Desafio: crie uma classe interna que acessa e altera o estado da classe externa.
12. Desafio: use uma classe anônima para implementar um listener simples de eventos.

## Exercícios de Parametrizando Comportamentos (até a aula 194)

**Pré-requisito:** aulas 193 e 194. Use interfaces, classes anônimas e métodos que recebem comportamentos como parâmetro. Ainda não use lambdas.

1. Crie uma interface `Filtro<T>` com o método `testar(T valor)` e use-a para filtrar números pares.
2. Use a mesma interface para filtrar pessoas maiores de idade.
3. Use um `Comparator` criado com classe anônima para ordenar produtos por preço.
4. Crie uma interface `Validador<T>` e valide produtos com preço positivo.
5. Crie uma interface `Formatador<T>` e formate objetos de tipos diferentes.
6. Crie uma interface `Desconto` e aplique descontos diferentes a um produto.
7. Crie um método genérico que recebe uma lista e um filtro e retorna uma nova lista.
8. Combine dois filtros com uma interface que representa uma condição composta.
9. Crie uma estratégia de ordenação que pode ser trocada em tempo de execução.
10. Crie uma estratégia de cálculo de frete e alterne entre duas implementações.
11. Desafio: crie um sistema de relatórios que recebe diferentes formatadores sem alterar o código principal.
12. Desafio: crie um mecanismo de validação de cadastro que executa uma lista de validadores.

## Exercícios de Lambdas (até a aula 197)

**Pré-requisito:** aulas 195 a 197. Use expressões lambda, `Predicate`, `Consumer` e `Function`. Ainda não use streams.

1. Use um `Predicate<Integer>` para filtrar números pares de uma lista.
2. Use um `Consumer<String>` para imprimir todos os nomes de uma lista.
3. Use uma `Function<String, Integer>` para transformar nomes em seus tamanhos.
4. Use um `Supplier<String>` para fornecer uma mensagem padrão.
5. Use um `BiFunction<Integer, Integer, Integer>` para somar dois números.
6. Use um `UnaryOperator<Integer>` para dobrar um valor.
7. Crie uma interface funcional própria sem parâmetros e sem retorno e implemente-a com lambda para imprimir uma mensagem.
8. Use um `Comparator` com lambda para ordenar uma lista de nomes.
9. Crie um método que recebe um `Predicate` e filtra uma lista.
10. Combine dois `Predicate` com `and`, `or` e `negate`.
11. Use uma lambda com bloco de código e `return`.
12. Crie uma interface funcional própria e use uma lambda para implementá-la.
13. Use `Function.andThen` e `Function.compose`.
14. Use `Consumer.andThen` para executar duas ações em sequência.
15. Use uma `Function` para transformar uma lista de produtos em uma lista de preços.
16. Desafio: crie um sistema de filtros combináveis para uma lista de pessoas.
17. Desafio: crie um pipeline simples com `Predicate`, `Function` e `Consumer`, sem usar streams.
18. Desafio: crie uma calculadora que recebe uma `BiFunction` para cada operação.

## Exercícios de Method Reference (até a aula 200)

**Pré-requisito:** aulas 198 a 200. Use referências a métodos estáticos, a métodos de instância e a construtores.

1. Use uma referência a método estático para converter Strings em inteiros.
2. Use `System.out::println` como `Consumer`.
3. Use `String::toUpperCase` como `Function`.
4. Use `String::compareTo` como `Comparator`.
5. Use `Integer::max` como `BiFunction`.
6. Use `ArrayList::new` como `Supplier`.
7. Use uma referência a método de instância de um objeto específico.
8. Use uma referência a método de instância de um tipo arbitrário.
9. Use uma referência ao construtor de uma classe `Produto`.
10. Use uma referência ao construtor de uma classe `Pessoa` com dois argumentos.
11. Desafio: substitua todas as lambdas de um pipeline simples por method references.
12. Desafio: crie uma classe com métodos estáticos de conversão e use referências a esses métodos em uma lista.

## Exercícios de Optional (até a aula 202)

**Pré-requisito:** aulas 201 e 202. Use `Optional`, `of`, `ofNullable`, `empty`, `isPresent`, `ifPresent`, `orElse`, `orElseGet`, `orElseThrow`, `map`, `flatMap` e `filter`.

1. Crie um `Optional` com um valor e imprima-o.
2. Crie um `Optional` vazio e verifique se ele está presente.
3. Use `ofNullable` com um valor que pode ser nulo.
4. Use `isPresent` e `ifPresent` para tratar um valor opcional.
5. Use `orElse` para fornecer um valor padrão.
6. Use `orElseGet` com um `Supplier`.
7. Use `orElseThrow` para lançar uma exceção quando o valor não existir.
8. Use `map` para transformar o valor de um `Optional`.
9. Use `flatMap` para encadear dois `Optional`.
10. Use `filter` para manter um valor apenas se ele atender a uma condição.
11. Busque um produto em uma lista e retorne um `Optional`.
12. Evite um `NullPointerException` usando `Optional` em uma busca.
13. Desafio: crie uma cadeia de `Optional` para obter o endereço de um cliente e a cidade.
14. Desafio: crie um método que retorna o primeiro número par de uma lista usando `Optional`.

## Exercícios de Streams (até a aula 219)

**Pré-requisito:** aulas 203 a 219. Use criação de streams, `filter`, `map`, `sorted`, `distinct`, `limit`, `skip`, `count`, `reduce`, `collect`, `flatMap`, `anyMatch`, `allMatch`, `noneMatch`, `findFirst`, `findAny`, `generate`, `iterate`, `IntStream`, `summarizing`, `groupingBy`, `partitioningBy` e parallel streams.

1. Crie um stream a partir de uma lista e imprima todos os elementos.
2. Filtre os números pares de uma lista com `filter`.
3. Transforme uma lista de nomes em uma lista de tamanhos com `map`.
4. Ordene uma lista com `sorted`.
5. Remova os duplicados de uma lista com `distinct`.
6. Limite o resultado a cinco elementos com `limit`.
7. Pule os três primeiros elementos com `skip`.
8. Conte quantos elementos existem em um stream.
9. Some todos os valores de uma lista com `reduce`.
10. Encontre o maior valor de uma lista com `reduce`.
11. Colete os resultados em uma lista com `collect`.
12. Junte nomes em uma única String com `Collectors.joining`.
13. Use `flatMap` para transformar uma lista de listas em uma lista única.
14. Verifique se algum, todos ou nenhum elemento atende a uma condição com `anyMatch`, `allMatch` e `noneMatch`.
15. Encontre o primeiro elemento de um stream com `findFirst`.
16. Gere um stream com `Stream.generate` e limite a cinco elementos.
17. Gere um stream com `Stream.iterate` e limite a dez elementos.
18. Use `IntStream.range` para imprimir os números de 1 a 10.
19. Use `summarizingInt` para obter soma, média, mínimo e máximo de uma lista.
20. Agrupe produtos por categoria com `groupingBy`.
21. Separe números em pares e ímpares com `partitioningBy`.
22. Use `parallelStream` para somar uma lista grande e compare com o stream sequencial.
23. Desafio: crie um pipeline de e-commerce que filtra produtos, aplica desconto, ordena por preço e coleta os nomes.
24. Desafio: crie um relatório com `groupingBy` e `counting` para contar pessoas por cidade.

## Exercícios de Threads (até a aula 228)

**Pré-requisito:** aulas 220 a 228. Use `Thread`, `Runnable`, estados, prioridade, `sleep`, `yield`, `join`, sincronismo, `wait`, `notify` e `notifyAll`.

1. Crie uma thread estendendo `Thread` e imprima uma mensagem.
2. Crie uma thread implementando `Runnable` e execute-a.
3. Use `Thread.sleep` para fazer uma thread esperar dois segundos.
4. Use `join` para esperar a conclusão de uma thread antes de continuar.
5. Altere a prioridade de duas threads e observe o comportamento.
6. Use `yield` para sugerir que outra thread seja executada.
7. Crie um contador compartilhado sem sincronismo e mostre a condição de corrida.
8. Sincronize um método para corrigir o contador.
9. Sincronize um bloco de código em vez do método inteiro.
10. Crie duas threads que tentam adquirir dois locks em ordens diferentes e provoque um deadlock.
11. Use `wait` e `notify` para coordenar duas threads.
12. Implemente o problema produtor-consumidor com uma fila simples.
13. Crie uma classe thread-safe para representar uma conta bancária.
14. Simule dois saques simultâneos em uma conta e trate o saldo corretamente.
15. Simule uma fila de impressão com três threads.
16. Simule o download de três arquivos em paralelo e imprima o progresso.
17. Crie uma thread daemon e observe o encerramento do programa.
18. Imprima os estados de uma thread durante seu ciclo de vida.
19. Desafio: crie um sistema de processamento de pedidos com produtores e consumidores.
20. Desafio: crie um contador com `synchronized` e outro com uma classe thread-safe e compare os resultados.

## Exercícios de Concorrência e CompletableFuture (até a aula 245)

**Pré-requisito:** aulas 229 a 245. Use `AtomicInteger`, locks, `Condition`, `ReentrantReadWriteLock`, coleções concorrentes, `ExecutorService`, `ScheduledExecutorService`, `Callable`, `Future`, `CompletableFuture` e `ThreadFactory`.

1. Use `AtomicInteger` para incrementar um contador em várias threads.
2. Use `ReentrantLock` para proteger uma seção crítica.
3. Use `Condition` para fazer uma thread esperar por uma condição.
4. Use `ReentrantReadWriteLock` para permitir leituras simultâneas e escritas exclusivas.
5. Use `CopyOnWriteArrayList` em um cenário com muitas leituras e poucas escritas.
6. Use `ArrayBlockingQueue` para implementar um produtor-consumidor.
7. Use `LinkedTransferQueue` para transferir elementos entre threads.
8. Crie um `ExecutorService` com pool fixo e execute cinco tarefas.
9. Use `ScheduledExecutorService` para agendar uma tarefa com atraso.
10. Crie uma tarefa `Callable` que retorna um valor.
11. Use `Future.get()` para obter o resultado de uma tarefa.
12. Use `CompletableFuture` e obtenha o resultado com `join`.
13. Encadeie uma transformação com `thenApply`.
14. Encadeie outra tarefa assíncrona com `thenCompose`.
15. Combine dois resultados com `thenCombine`.
16. Execute várias tarefas e espere todas com `allOf`.
17. Execute várias tarefas e pegue a primeira que terminar com `anyOf`.
18. Trate uma falha com `exceptionally`.
19. Crie uma `ThreadFactory` customizada com nomes de thread.
20. Execute tarefas em paralelo e colete os resultados.
21. Desafio: crie um sistema de cotações que consulta três fontes em paralelo e retorna a primeira resposta.
22. Desafio: crie um pipeline assíncrono de pedido com validação, pagamento e envio, tratando falhas em cada etapa.

## Exercícios de Padrões de Projeto (até a aula 251)

**Pré-requisito:** aulas 246 a 251. Use Builder, Factory, Singleton (eager, lazy e enum) e DTO.

1. Crie uma classe `Pessoa` com Builder para nome, idade e cidade.
2. Crie uma `Factory` que retorna diferentes tipos de `Notificacao`.
3. Implemente Singleton com inicialização eager.
4. Implemente Singleton com inicialização lazy.
5. Implemente Singleton com enum.
6. Crie um DTO para transferir dados de `Cliente` entre camadas.
7. Crie um Builder com validação de campos obrigatórios.
8. Crie uma Factory Method com uma interface e duas implementações.
9. Desafio: crie uma fábrica de famílias de produtos relacionados (Abstract Factory).
10. Use o padrão Strategy para calcular fretes diferentes.
11. Implemente um Singleton thread-safe.
12. Crie um DTO e um método que converte uma entidade em DTO.
13. Crie um Builder para um objeto complexo com listas de itens.
14. Crie uma Factory para criar pagamentos de tipos diferentes.
15. Desafio: crie um sistema de configuração global com Singleton e valores padrão.
16. Desafio: crie um Builder que gera um relatório com seções opcionais.

## Exercícios de JDBC (até a aula 279)

**Pré-requisito:** aulas 252 a 279. Assuma o ambiente do curso já configurado: Docker, MySQL, Maven e o driver JDBC. Use uma tabela `produto` com `id`, `nome`, `preco` e `quantidade`, ou adapte a tabela `anime` do curso.

1. Crie uma conexão com o banco e imprima uma mensagem de sucesso.
2. Insira um produto com `Statement`.
3. Atualize o preço de um produto pelo `id`.
4. Delete um produto pelo `id`.
5. Busque todos os produtos e imprima os resultados.
6. Busque produtos pelo nome usando `LIKE`.
7. Imprima os metadados do `ResultSet` com `ResultSetMetaData`.
8. Imprima os metadados do banco com `DatabaseMetaData`.
9. Use um `ResultSet` do tipo `TYPE_SCROLL_INSENSITIVE` para navegar para frente e para trás.
10. Atualize um registro diretamente pelo `ResultSet`.
11. Insira e delete registros usando o `ResultSet`.
12. Use `PreparedStatement` para inserir um produto com parâmetros.
13. Use `PreparedStatement` para buscar por nome com parâmetro.
14. Execute um lote de inserções com `addBatch` e `executeBatch`.
15. Use `CallableStatement` para chamar uma procedure simples.
16. Use `JdbcRowSet` para consultar produtos.
17. Use `CachedRowSet` para consultar produtos desconectado do banco.
18. Controle uma transação com `setAutoCommit(false)`, `commit` e `rollback`.
19. Crie um CRUD completo de produtos com `findAll`, `findByName`, `save`, `update` e `delete`.
20. Crie um DAO para a tabela `produto`, separando o acesso ao banco da classe principal.
21. Implemente paginação com `LIMIT` e `OFFSET`.
22. Gere um relatório com a quantidade total de produtos e o valor total em estoque.
23. Desafio: crie um CRUD de clientes com relacionamento entre cliente e pedido.
24. Desafio: implemente uma busca com filtros opcionais de nome, preço mínimo e quantidade mínima.

## Exercícios de Testes Unitários com JUnit (até a aula 281)

**Pré-requisito:** aulas 280 e 281. Assuma o JUnit já configurado no projeto. Use anotações e asserções do JUnit 5.

1. Crie um teste para um método de soma e verifique o resultado com `assertEquals`.
2. Teste um método que retorna `true` ou `false` com `assertTrue` e `assertFalse`.
3. Teste um método que retorna `null` com `assertNull`.
4. Use `@BeforeEach` para preparar um objeto antes de cada teste.
5. Use `@AfterEach` para limpar os dados depois de cada teste.
6. Use `@BeforeAll` e `@AfterAll` para preparar e encerrar recursos compartilhados.
7. Teste uma exceção esperada com `assertThrows`.
8. Teste um método que retorna uma lista e verifique o tamanho e os elementos.
9. Use `@ParameterizedTest` para testar vários valores de entrada.
10. Teste uma classe de serviço que calcula desconto.
11. Teste um método que valida idade e rejeita valores negativos.
12. Desafio: crie uma suíte de testes para uma calculadora com soma, subtração, multiplicação e divisão.
13. Desafio: crie testes para um CRUD em memória, cobrindo inclusão, busca, atualização e remoção.

## Exercícios de Record e Pattern Matching (até a aula 284)

**Pré-requisito:** aulas 282 a 284. Use `record`, construtores compactos e pattern matching para `instanceof`.

1. Crie um `record` `Pessoa` com nome e idade e imprima os componentes.
2. Crie um `record` `Produto` com nome e preço.
3. Use um construtor compacto para validar a idade de uma pessoa.
4. Adicione um método personalizado a um `record`.
5. Use um `record` em uma lista e ordene os elementos por um de seus componentes usando um `Comparator`.
6. Use pattern matching com `instanceof` para extrair um valor de um objeto.
7. Use pattern matching com uma condição extra no `if`.
8. Crie uma hierarquia de classes e use pattern matching para tratar cada tipo.
9. Use um `record` como DTO para transferir dados de um cliente.
10. Crie um `record` genérico `Par<A, B>`.
11. Desafio: crie um `record` `Pedido` com uma lista de itens e um método que calcula o total.
12. Desafio: use pattern matching para calcular a área de formas diferentes a partir de uma lista de objetos.
