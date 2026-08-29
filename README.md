# Praticando Java: String e Regex

Repositório de estudos e exercícios práticos em Java voltados para manipulação de `String` e utilização de expressões regulares (`Regex`).

O projeto reúne exemplos independentes para praticar operações comuns de processamento de texto, formatação, substituição, extração e validação de informações utilizando recursos da API padrão do Java.

## 🎯 Objetivo

Consolidar conhecimentos sobre manipulação de textos em Java e introduzir o uso de expressões regulares para identificação, validação e processamento de padrões.

Os exemplos foram organizados em exercícios independentes, permitindo estudar cada conceito de forma isolada e acompanhar a evolução das implementações.

## ✨ Funcionalidades

O projeto contém exercícios relacionados a:

* Conversão de textos para maiúsculas e minúsculas;
* Extração de hashtags de um texto;
* Extração de partes específicas de uma `String`;
* Formatação de números;
* Remoção de espaços em branco;
* Substituição de partes de uma `String`;
* Validação de códigos de referência;
* Validação de CPF;
* Validação de senhas utilizando Regex;
* Verificação da existência de uma substring;
* Utilização de `Pattern` e `Matcher`;
* Formatação de números de telefone utilizando expressões regulares;
* Manipulação de texto utilizando métodos da classe `String`.

Os exercícios estão separados por diretórios dentro do pacote `exercicios`, enquanto exemplos gerais ficam no pacote `principal`.

## 🛠️ Tecnologias utilizadas

| Tecnologia                | Utilização                            |
| ------------------------- | ------------------------------------- |
| Java                      | Linguagem principal                   |
| Java `String` API         | Manipulação e transformação de textos |
| `java.util.regex.Pattern` | Criação de padrões Regex              |
| `java.util.regex.Matcher` | Busca e validação de padrões          |
| IntelliJ IDEA             | Estrutura/configuração do projeto     |

O código utiliza *text blocks* do Java, recurso disponível a partir do Java 15. Por isso, recomenda-se utilizar **JDK 15 ou superior**.

## 📁 Estrutura do projeto

```text
praticando_java-string_e_regex/
├── src/
│   └── com/
│       └── github/
│           └── lucasdevrj/
│               ├── exercicios/
│               │   ├── convertendomaiusculasparaminusculas/
│               │   ├── extraindohastagsdeumtexto/
│               │   ├── extraindopartedeumastring/
│               │   ├── formatandonumeros/
│               │   ├── removedorespacosembranco/
│               │   ├── substituindopartedeumastring/
│               │   ├── validandocodigosdereferencia/
│               │   ├── validandocpf/
│               │   ├── validandosenhascomregex/
│               │   └── verificandoseumastringcontemsubstring/
│               │
│               └── principal/
│                   ├── Principal.java
│                   └── PrincipalRegex.java
│
├── .gitignore
└── praticando_java-string_e_regex.iml
```

A organização separa os exemplos gerais dos exercícios específicos, facilitando a navegação pelo conteúdo de estudo.

## ▶️ Como executar

### Pré-requisitos

* JDK 15 ou superior;
* IntelliJ IDEA ou outra IDE com suporte a projetos Java.

### IntelliJ IDEA

1. Clone o repositório:

```bash
git clone https://github.com/LucasDevRJ/praticando_java-string_e_regex.git
```

2. Acesse o diretório:

```bash
cd praticando_java-string_e_regex
```

3. Abra o projeto no IntelliJ IDEA.
4. Aguarde a IDE reconhecer o módulo Java.
5. Execute as classes que possuem o método `main`.

Entre os exemplos principais estão:

```text
com.github.lucasdevrj.principal.Principal
com.github.lucasdevrj.principal.PrincipalRegex
```

Cada exercício também possui sua própria classe de entrada quando aplicável.

## 💡 Exemplos de uso

### Manipulação de String

O projeto demonstra operações como:

```java
String professor = "Jacqueline Oliveira";

System.out.println(professor.toUpperCase());
System.out.println(professor.toLowerCase());
```

Também são utilizados recursos como `trim()`, `replace()` e `String.format()` para transformação e formatação de textos.

### Expressões regulares

A classe `PrincipalRegex` demonstra a criação de um padrão utilizando `Pattern` e sua aplicação por meio de `Matcher`:

```java
Pattern padrao = Pattern.compile("\\w+@\\w+.\\w+");
Matcher matcher = padrao.matcher(texto);

if (matcher.find()) {
    System.out.println(matcher.group());
}
```

### Formatação de telefone

Também existe um exemplo de agrupamento de dígitos utilizando Regex:

```java
String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
```

Quando o valor corresponde ao padrão esperado, os grupos capturados são utilizados para produzir uma representação formatada do telefone.

## 📚 Conceitos aplicados

O repositório permite praticar conceitos importantes da linguagem Java:

* Classe `String`;
* Métodos de manipulação de strings;
* `String.format()`;
* `printf()`;
* `trim()`;
* `replace()`;
* `toUpperCase()`;
* `toLowerCase()`;
* *Text blocks*;
* Expressões regulares;
* `Pattern`;
* `Matcher`;
* Grupos de captura;
* `find()`;
* `matches()`;
* Validação baseada em padrões;
* Organização de código em pacotes.

## 🧠 Aprendizados

Os exercícios reforçam uma habilidade importante para aplicações Java: transformar dados textuais antes de utilizá-los na aplicação.

Além das operações básicas da classe `String`, o projeto introduz Regex como ferramenta para trabalhar com padrões mais estruturados, como e-mails, telefones, códigos e informações que precisam obedecer a determinados formatos.

A separação dos exercícios também favorece o aprendizado incremental, permitindo testar cada conceito individualmente.

## 👤 Autor

**LucasDevRJ**

GitHub: [LucasDevRJ](https://github.com/LucasDevRJ)

## 📄 Licença

Nenhuma licença está identificada atualmente no repositório.

Caso o projeto seja disponibilizado como Open Source, recomenda-se adicionar um arquivo `LICENSE` definindo formalmente as condições de uso, modificação e distribuição.
