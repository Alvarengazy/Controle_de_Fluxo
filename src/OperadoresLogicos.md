# Operadores e Controle de Fluxo em Java

Material de estudo sobre operadores e estruturas de controle de fluxo em Java. Os exemplos são pequenos e independentes, feitos para praticar a lógica e entender como o programa decide quais instruções executar.

## 1. Operadores lógicos

### AND (`&&`)

Retorna `true` somente quando **as duas condições** são verdadeiras.

```java
boolean temIngresso = true;
int idade = 18;

if (idade >= 18 && temIngresso) {
    System.out.println("Pode entrar!");
}
```

### OR (`||`)

Retorna `true` quando **pelo menos uma das condições** é verdadeira.

```java
boolean temIngresso = false;
boolean conheceAlguem = true;

if (temIngresso || conheceAlguem) {
    System.out.println("Pode avançar!");
}
```

### NOT (`!`)

Inverte um valor booleano: `true` passa a `false`, e `false` passa a `true`.

```java
boolean bloqueado = false;

if (!bloqueado) {
    System.out.println("Não está bloqueado.");
}
```

## 2. Guardar uma condição em uma variável

Uma condição pode ser avaliada diretamente no `if` ou guardada em uma variável `boolean` antes. A segunda forma pode ajudar quando o nome explica a regra ou quando o resultado será reutilizado.

**Método 1 — condição direta**

```java
if (idade >= 18 && temIngresso) {
    System.out.println("Pode entrar!");
}
```

**Método 2 — condição nomeada**

```java
boolean liberado = idade >= 18 && temIngresso;

if (liberado) {
    System.out.println("Pode entrar!");
}
```

Nenhuma forma é sempre melhor. Prefira a que deixa a intenção mais clara; não crie variáveis desnecessárias para condições triviais.

## 3. Controle de fluxo: `if`, `else if` e `else`

- `if`: executa um bloco se a condição for verdadeira.
- `else if`: testa outra condição caso as anteriores não tenham sido atendidas.
- `else`: executa quando nenhuma das condições anteriores foi verdadeira.

```java
int idade = 17;

if (idade >= 18) {
    System.out.println("Maior de idade.");
} else if (idade >= 16) {
    System.out.println("Tem pelo menos 16 anos.");
} else {
    System.out.println("Tem menos de 16 anos.");
}
```

As condições são verificadas em ordem. Assim que um ramo é executado, os ramos seguintes dessa mesma cadeia são ignorados.

## 4. Precedência dos operadores lógicos

O operador `&&` tem precedência maior que `||`. Para evitar confusão em expressões combinadas, use parênteses quando eles tornarem a intenção mais clara.

```java
boolean resultado = (idade >= 18 && temIngresso) || !bloqueado;
```

A expressão é verdadeira se a pessoa tiver pelo menos 18 anos **e** ingresso, ou se não estiver bloqueada.

## 5. Boas práticas

- Use nomes que expressem o significado da condição, como `liberado` ou `bloqueado`.
- Lembre-se de que `!` inverte a expressão inteira que vem logo depois dele.
- Teste casos verdadeiros e falsos para cada condição.
- Use parênteses em expressões lógicas complexas para facilitar a leitura.
- Uma variável booleana representa o resultado de uma condição; ela não verifica fatos por conta própria.

## Exercícios

1. Se `idade = 17` e `temIngresso = true`, qual é o resultado de `idade >= 18 && temIngresso`?
2. Se `temIngresso = false` e `conheceAlguem = false`, qual é o resultado de `temIngresso || conheceAlguem`?
3. Se `bloqueado = true`, o bloco `if (!bloqueado)` será executado? Explique por quê.
4. O que será executado nesta cadeia: `if`, `else if` e `else`, quando `idade = 17`?

---

Este documento acompanha a prática dos operadores e do controle de fluxo. O conteúdo será ampliado à medida que esses temas forem estudados.
