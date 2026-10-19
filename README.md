<div align="center">

# ☕ Java — Operators & Flow Control

### Understand the condition. Control the execution.

**A focused Java study project about logical operators and control flow — written, tested, and documented while learning.**

[![Language](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
<img src="https://img.shields.io/badge/Status-Completed-2ea44f?style=for-the-badge" alt="Project completed">
[![Documentation](https://img.shields.io/badge/Docs-English%20%7C%20Português-2F80ED?style=for-the-badge)](#-choose-your-language--escolha-seu-idioma)

<br>

**[🇺🇸 English](#-english) · [🇧🇷 Português](#-português) · [🧭 Roadmap](#-learning-roadmap--roteiro-de-estudos) · [📂 Structure](#-project-structure--estrutura-do-projeto)**

</div>

---

<details open>
<summary><strong>🇺🇸 English</strong></summary>

## 👋 About the project

Welcome to this **Java Operators & Flow Control** study project! This repository focuses on how logical conditions are evaluated and how they determine which blocks of code execute.

The examples are part of a hands-on learning process: write the code, run it, inspect the result, and change values to understand the logic instead of memorizing syntax alone.

## 🎯 What you will find here

- 🔗 **Logical operators:** `&&` (AND), `||` (OR), and `!` (NOT).
- 🚦 **Flow control:** `if`, `else if`, `else`, and `switch-case`.
- 🧠 **Boolean expressions:** evaluate conditions and store results in `boolean` variables.
- 🧩 **Operator precedence:** understand how combined conditions are evaluated and when parentheses improve clarity.
- 💻 **Practical examples and exercises** to test your understanding.
- 🔁 **Two approaches when useful:**
  - **Method 1:** place a condition directly inside an `if` statement.
  - **Method 2:** store a condition in a clearly named Boolean variable when it improves readability or reuse.

> **Learning principle:** more lines do not automatically mean better code. Choose the approach that makes the logic easiest to understand and maintain.

## 🚦 Flow control

### `if`, `else if`, and `else`

Use `if` to execute a block when a condition is true. `else if` checks another condition when earlier conditions were false, and `else` handles the remaining cases.

### `switch` and `case`

Use `switch` when you want to choose one execution path based on the value of an expression. Each `case` represents a value to match, and `default` handles values that do not match any listed case.

```java
int day = 3;

switch (day) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    case 3 -> System.out.println("Wednesday");
    default -> System.out.println("Unknown day");
}
```

In this example, `day` is `3`, so the program prints `Wednesday`. The `default` branch runs only when none of the cases match.

This example uses the arrow syntax (`case value ->`), supported in Java 14 and later. With this syntax, a matching branch does not fall through to the next case, so `break` is not needed. `switch` selects a branch; it does not repeat instructions like a loop.

## 🧪 How to use this project

1. Read one concept at a time.
2. Type the examples manually and run them.
3. Change variable values and predict the output before execution.
4. Combine operators and explain the result step by step.
5. Complete the exercises, then test your reasoning with the program.

## 🧭 Learning roadmap

- [x] Practice logical operators: `&&`, `||`, and `!`
- [x] Use Boolean expressions in conditions
- [x] Practice `if`, `else if`, and `else`
- [x] Practice `switch-case` with arrow syntax
- [x] Explore operator precedence in combined conditions
- [x] Compare direct conditions with named Boolean variables
- [x] Document examples and exercises

## 📂 Project structure

```text
Java-Learning-Library/
├── README.md
└── Fundamentos/
    └── OperadoresLogicos.md
    └── Laco_If.java
    └── Laco_IfElse.java
    └── Laco_IfElseIf.java
    └── OperadoresLogicos.java
    └── Controle_Switch.java
```

## 🤝 Philosophy

This project records a specific step in my Java learning journey. The goal is to understand the logic behind the code, write it independently, and improve readability through practice.

**One concept at a time. Understand it, then build on it.**

</details>

<details>
<summary><strong>🇧🇷 Português</strong></summary>

## 👋 Sobre o projeto

Boas-vindas a este projeto de estudo sobre **Operadores e Controle de Fluxo em Java**! O foco é compreender como as condições lógicas são avaliadas e como elas determinam quais blocos de código serão executados.

Os exemplos fazem parte de um aprendizado prático: escrever o código, executá-lo, observar o resultado e alterar os valores para entender a lógica, em vez de apenas memorizar a sintaxe.

## 🎯 O que você encontrará aqui

- 🔗 **Operadores lógicos:** `&&` (AND), `||` (OR) e `!` (NOT).
- 🚦 **Controle de fluxo:** `if`, `else if`, `else` e `switch-case`.
- 🧠 **Expressões booleanas:** avaliar condições e armazenar resultados em variáveis `boolean`.
- 🧩 **Precedência de operadores:** entender como condições combinadas são avaliadas e quando parênteses ajudam na clareza.
- 💻 **Exemplos práticos e exercícios** para testar o entendimento.
- 🔁 **Duas abordagens quando forem úteis:**
  - **Método 1:** escrever a condição diretamente no `if`.
  - **Método 2:** armazenar a condição em uma variável booleana com nome claro quando isso melhorar a leitura ou permitir reutilização.

> **Princípio de aprendizado:** mais linhas não significam automaticamente código melhor. Escolha a abordagem que torne a lógica mais fácil de entender e manter.

## 🚦 Controle de fluxo

### `if`, `else if` e `else`

Use `if` para executar um bloco quando uma condição for verdadeira. `else if` verifica outra condição quando as anteriores são falsas, e `else` trata os casos restantes.

### `switch` e `case`

Use `switch` quando quiser escolher um caminho de execução com base no valor de uma expressão. Cada `case` representa um valor possível, e `default` trata os valores que não correspondem a nenhum dos casos listados.

```java
int numero = 3;

switch (numero) {
    case 1 -> System.out.println("Segunda");
    case 2 -> System.out.println("Terça");
    case 3 -> System.out.println("Quarta");
    default -> System.out.println("Opção não reconhecida");
}
```

Neste exemplo, `numero` vale `3`, então o programa exibe `Quarta`. O bloco `default` é executado somente quando nenhum dos casos corresponde ao valor recebido.

O exemplo usa a sintaxe com setas (`case valor ->`), suportada no Java 14 ou superior. Nessa sintaxe, o caso correspondente não continua automaticamente para o próximo, por isso não é necessário usar `break`. O `switch` seleciona um caminho; ele não repete instruções como um laço de repetição.

## 🧪 Como usar este projeto

1. Leia um conceito por vez.
2. Digite os exemplos manualmente e execute-os.
3. Altere os valores das variáveis e tente prever a saída antes de executar.
4. Combine operadores e explique o resultado passo a passo.
5. Faça os exercícios e depois confira seu raciocínio com o programa.

## 🧭 Roteiro de estudos

- [x] Praticar os operadores lógicos: `&&`, `||` e `!`
- [x] Usar expressões booleanas em condições
- [x] Praticar `if`, `else if` e `else`
- [x] Praticar `switch-case` com a sintaxe de setas
- [x] Explorar a precedência em condições combinadas
- [x] Comparar condições diretas com variáveis booleanas nomeadas
- [x] Documentar exemplos e exercícios

## 📂 Estrutura do projeto

```text
Java-Learning-Library/
├── README.md
└── Fundamentos/
    └── OperadoresLogicos.md
    └── Laco_If.java
    └── Laco_IfElse.java
    └── Laco_IfElseIf.java
    └── OperadoresLogicos.java
    └── Controle_Switch.java
```

## 🤝 Filosofia

Este projeto registra uma etapa específica da minha jornada de aprendizado em Java. O objetivo é compreender a lógica por trás do código, escrevê-lo de forma independente e melhorar a legibilidade com a prática.

**Um conceito de cada vez. Entender primeiro; construir depois.**

</details>

---

<div align="center">

**Made with ☕, curiosity, and consistency.**  
**Feito com ☕, curiosidade e consistência.**

</div>
