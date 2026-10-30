# Maratona Java — Dev Dojo 🚀

Anotações pessoais, exercícios e códigos de exemplo do curso **[Maratona Java](https://www.youtube.com/watch?v=VKjFuX91G5Q&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW)** do canal **Dev Dojo**, organizados como um *vault* do [Obsidian](https://obsidian.md/) com um projeto Java para acompanhar as aulas.

![Java](https://img.shields.io/badge/Java-25_LTS-ED8B00?logo=openjdk&logoColor=white)
![Obsidian](https://img.shields.io/badge/Notas-Obsidian-7C3AED?logo=obsidian&logoColor=white)
![Progresso](https://img.shields.io/badge/Aulas_conclu%C3%ADdas-8%2F284-blue)
![Exercícios](https://img.shields.io/badge/Exerc%C3%ADcios-904-brightgreen)

---

## 📖 Sobre

Este repositório documenta minha jornada de aprendizado em Java, do zero ao avançado, seguindo a playlist do Dev Dojo. O conteúdo está em português e mistura **teoria**, **tutoriais passo a passo**, **exercícios práticos** e **código executável**.

Não é um projeto de aplicação: é um caderno de estudos estruturado, versionado e aberto para consulta.

### O que tem aqui

| Conteúdo | Descrição |
| --- | --- |
| 🗺️ **Roteiro do curso** | Checklist com as **284 aulas** da maratona, divididas em 6 módulos, com links úteis e marcação de progresso. |
| ✍️ **Anotações das aulas** | Resumos teóricos com imagens e diagramas, no formato Obsidian (`[[wikilinks]]` e `#tags`). |
| 🧩 **Banco de exercícios** | **904 exercícios** originais em **53 seções**, liberados progressivamente conforme o conteúdo estudado. |
| ☕ **Exemplos em Java** | Projeto IntelliJ com o código escrito durante as aulas. |
| 🖼️ **Imagens de apoio** | Diagramas e capturas de tela usados nas anotações. |

---

## 📂 Estrutura

```text
maratona-java-dev-dojo/
├── Maratona Java - Dev Dojo/                  # Vault do Obsidian
│   ├── Roteiro Maratona Java - Dev Dojo.md    # Checklist das 284 aulas
│   ├── Exercícios da Maratona Java.md         # 904 exercícios em 53 seções
│   ├── Anotações/
│   │   └── (0-9) Aulas Introdutórias.md       # Notas das aulas 0 a 9
│   │   └── (10-14) Tipos primitivos.md        # Notas das aulas 10 a 14
│   ├── Imagens/                               # Diagramas e capturas de tela
│   └── .obsidian/                             # Configuração do vault
└── exemplos-maratona-java/                    # Projeto Java com os exemplos do curso
    └── src/com/gustavo/maratonajava/
        └── introducao/Example01.java
        └── introducao/Example02.java
        └── introducao/Example03.java
```

---

## 🎯 Progresso no curso

Legenda: ✅ concluído · 🔄 em andamento · ⬜ não iniciado

| Módulo | Aulas | Tema | Status |
| --- | :---: | --- | :---: |
| **Básico** | 01–38 | Como o Java funciona, JDK, variáveis de ambiente, tipos primitivos, operadores, condicionais, laços e arrays | 🔄 14/38 |
| **Intermediário** | 39–94 | Orientação a objetos: classes, métodos, encapsulamento, construtores, herança, enums, classes abstratas, interfaces e polimorfismo | ⬜ |
| **Avançado** | 95–182 | Exceções, classes utilitárias (Wrappers, Strings, datas, Regex), IO/NIO, serialização e coleções | ⬜ |
| **Mais avançado** | 183–219 | Generics, classes internas, lambdas, method references, Optional e Streams | ⬜ |
| **Punk** | 220–279 | Threads, concorrência, `CompletableFuture`, padrões de projeto e JDBC | ⬜ |
| **Finalização** | 280–284 | JUnit, atualização de JDK, Records e Pattern Matching | ⬜ |

> **Status atual (29/10/2026):** 14 de 284 aulas concluídas (aulas 01–14). Anotações escritas das aulas introdutórias (02–14), roteiro completo mapeado e o primeiro projeto Java compilando e executando.

---

## 🧩 Exercícios

O arquivo [Exercícios da Maratona Java](Maratona%20Java%20-%20Dev%20Dojo/Exerc%C3%ADcios%20da%20Maratona%20Java.md) contém **904 exercícios** distribuídos em **53 seções**. Cada seção informa até qual aula é preciso ter assistido e quais recursos podem ser usados — os enunciados não cobram conteúdo ainda não ensinado.

A progressão acompanha o curso:

- **Básico** — tipos primitivos, operadores, condicionais, repetição, arrays e matrizes.
- **Intermediário** — classes, métodos, encapsulamento, sobrecarga, construtores, `static`, associação, herança, `final`, enums, classes abstratas, interfaces e polimorfismo.
- **Avançado** — exceções, Wrappers, Strings, datas legadas e `java.time`, `ResourceBundle`, Regex, `Scanner`, IO, NIO e serialização.
- **Coleções** — `equals`/`hashCode`, List, ordenação, Set, Map e Queue.
- **Mais avançado** — Generics, classes internas, lambdas, method references, Optional e Streams.
- **Punk** — threads, concorrência, padrões de projeto e JDBC.
- **Finalização** — JUnit, Records e Pattern Matching.

Os exercícios são apenas enunciados: as soluções ficam por conta de quem resolve. A partir da aula 68 os problemas podem envolver leitura de dados pelo teclado; antes disso, usa-se valores fixos no código.

---

## ☕ Exemplos em Java

O projeto [`exemplos-maratona-java`](exemplos-maratona-java) reúne o código escrito durante as aulas. É um projeto Java simples, sem Maven/Gradle, com o código-fonte em `src/` e pacotes no padrão `com.gustavo.maratonajava.<assunto>`.

```text
└── exemplos-maratona-java/
    └── src/com/gustavo/maratonajava/
        └── introducao/Example01.java
        └── introducao/Example02.java
        └── introducao/Example03.java
```

### Executar pelo IntelliJ IDEA

1. Abra a pasta `exemplos-maratona-java` no IntelliJ.
2. Confirme o **JDK 25** em **File → Project Structure → Project SDK**.
3. Abra uma classe com `main` e clique em ▶️.

### Compilar e executar pelo terminal

Na raiz do projeto de exemplos:

```bash
javac -d out src/com/gustavo/maratonajava/introducao/OlaMundo.java
java -cp out com.gustavo.maratonajava.introducao.OlaMundo
```

> A pasta `out/` (bytecode compilado) é ignorada pelo Git.

---

## 🛠️ Como usar este repositório

### Visualizar as notas no Obsidian (recomendado)

1. Instale o [Obsidian](https://obsidian.md/download).
2. Abra o Obsidian e escolha **Open folder as vault**.
3. Selecione a pasta `Maratona Java - Dev Dojo`.

Assim os links internos (`[[...]]`), as imagens incorporadas (`![[...]]`) e as tags funcionam corretamente.

> No GitHub, o Markdown é exibido, mas os wikilinks e as imagens incorporadas do Obsidian não são renderizados. Para uma leitura confortável, use o Obsidian.

### Acompanhar o progresso

- Marque as aulas concluídas no [roteiro](Maratona%20Java%20-%20Dev%20Dojo/Roteiro%20Maratona%20Java%20-%20Dev%20Dojo.md).
- Crie novas notas em `Anotações/` seguindo o padrão `Assunto (aulas X-Y).md`.
- Adicione os exemplos de cada aula em `exemplos-maratona-java/src/com/gustavo/maratonajava/`.
- Resolva os exercícios na ordem das seções.

---

## ⚙️ Ambiente

Configuração usada durante os estudos (aulas 02–06):

- **JDK 25 (LTS)** — a versão LTS mais recente na data das anotações.
- **`JAVA_HOME`** apontando para a pasta de instalação do JDK.
- **`Path`** contendo `%JAVA_HOME%\bin` (e sem o `javapath` da Oracle).
- IDE: **IntelliJ IDEA Community**, com o projeto de exemplos configurado para o JDK 25.
- Para os módulos finais: **Maven**, **Docker**, **MySQL** e **JUnit**.

Passo a passo da configuração no **Windows** e no **Linux Mint** em [Anotações/Aulas Introdutórias](Maratona%20Java%20-%20Dev%20Dojo/Anota%C3%A7%C3%B5es/Aulas%20Introdut%C3%B3rias%20%280-9%29.md).

---

## 🔗 Links úteis

- [Repositório no GitHub](https://github.com/oldFaraday/maratona-java-dev-dojo)
- [Playlist — Maratona Java (Dev Dojo)](https://www.youtube.com/watch?v=VKjFuX91G5Q&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW)
- [Canal Dev Dojo](https://www.youtube.com/@devdojo)
- [Download do JDK (Oracle)](https://www.oracle.com/br/java/technologies/downloads/)
- [IntelliJ IDEA Community](https://www.jetbrains.com/pt-br/idea/download/)
- [Histórico de versões do Java](https://www.codejava.net/java-se/java-se-versions-history)
- [Documentação oficial do Java](https://docs.oracle.com/en/java/)
- [Sintaxe Markdown](https://learn.getgrav.org/2/content/markdown)

---

## 📌 Próximos passos

- [ ] Concluir o módulo **Básico** (aulas 09–38)
- [ ] Escrever as anotações das aulas 09 em diante
- [ ] Adicionar exemplos de código de cada aula em `exemplos-maratona-java`
- [ ] Publicar as soluções dos exercícios em código Java
- [ ] Organizar os projetos práticos (JDBC, JUnit) em pastas separadas
- [ ] Manter as anotações atualizadas a cada módulo

---

## 🙏 Créditos

Todo o conteúdo didático, a estrutura do curso e os exemplos originalmente apresentados são de autoria do **[Dev Dojo](https://devdojo.academy/)**. Este repositório contém apenas anotações pessoais, exercícios de prática e códigos de acompanhamento elaborados durante as aulas.

Feito com ☕ e disciplina.
