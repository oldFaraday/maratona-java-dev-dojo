## Aula 2: Como o Java funciona

#### Escreva uma vez e rode em qualquer lugar:
Normalmente o SO faz a tradução do código para o hardware, mas com o Java Virtual Machine ( #JVM ) existe uma camada de tradução entre o seu código e o SO, ou seja, há toda uma camada de abstração extra entre o código e o SO.
Para desenvolver em Java utiliza-se o Java Development Kit ( #JDK ), um kit que contem ferramentas de debug e o compilador, por exemplo.

![[Funcionamento do Java.svg]]
___
## Aula 3: Instalando o JDK
O JDK pode ser baixado no [site da Oracle](https://www.oracle.com/br/java/technologies/downloads/) pra Windows MacOS e Linux (.deb/.npm)
Outro link útil é o [histórico de versões](https://www.codejava.net/java-se/java-se-versions-history) do Java mantido pelo site CodeJava. Atualmente (em 28/10/2026) estamos na versão 27 do Java e a versão LTS, comumente usada por empresas e a que eu instalei, é a 25.
___
## Aula 4: Configurando variáveis de ambiente
No Windows é necessário criar uma variável de ambiente para o Java. O padrão convencionado é o JAVA_HOME, ele deve apontar para a pasta onde o #JDK está instalado.
Depois é necessário configurar o o path para apontar para o %JAVA_HOME%
### Como configurar as variáveis de ambiente no Windows:
1. Comece pesquisando por "variáveis de ambiente" na busca do Windows. Ao acessar clique em "Novo".
![[Tutorial Variáveis de Ambiente 01.png]]

2. Preencha o campo de nome com o valor "JAVA_HOME" e o valor com o caminho da instalação do JDK.
![[Tutorial Variáveis de Ambiente 02.png]]

3. Com isso feito é necessário editar o path.
![[Tutorial Variáveis de Ambiente 03.png]]

4. Remova o "C:\Program Files\Common Files\Oracle\Java\javapath"
![[Tutorial Variáveis de Ambiente 04.png]]

5. Adicione um novo registro na lista com o valor "%JAVA_HOME%\bin"
![[Tutorial Variáveis de Ambiente 05.png]]

Isso vai apontar para a pasta bin dentro da pasta de instalação do JDK garantido acesso independentemente das permissões de acesso do usuário.