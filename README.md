# Práticas de Coleções em Java ☕

Este repositório contém uma série de pequenos exercícios práticos em Java. O objetivo principal destas atividades é treinar e consolidar o uso de diferentes estruturas de dados pertencentes ao **Java Collections Framework** (Listas, Filas, Conjuntos e Mapas).

## 📂 Visão Geral dos Arquivos

Cada arquivo `.java` aborda um cenário prático utilizando uma estrutura de dados específica:

* **`Alunos.java` (Uso de `HashMap`)**
    * **Descrição:** Sistema simples de controle de alunos associando uma matrícula (Chave/Integer) ao nome do aluno (Valor/String).
    * **Conceitos:** Inserção (`put`), busca (`containsKey`, `get`), remoção (`remove`) e iteração iterando sobre as chaves e valores com `Map.Entry`.

* **`CalculoMedia.java` (Uso de `ArrayList`)**
    * **Descrição:** Armazena as notas de uma turma e calcula a média final, exibindo se a turma atingiu o critério de aprovação (nota >= 7.0).
    * **Conceitos:** Armazenamento dinâmico de `Double`, laços de repetição (for-each) e lógica matemática condicional.

* **`Fila.java` (Uso de `Queue` com `LinkedList`)**
    * **Descrição:** Simulação de uma fila de atendimento de clientes. 
    * **Conceitos:** Princípio FIFO (First In, First Out). Uso dos métodos `.add()` para enfileirar, `.peek()` para espiar o próximo a ser atendido e `.poll()` para atender e remover da fila.

* **`ListaCompras.java` (Uso de `ArrayList`)**
    * **Descrição:** Criação e exibição de uma lista de compras de supermercado.
    * **Conceitos:** Adição de elementos do tipo `String` e contagem do tamanho da lista utilizando o método `.size()`.

* **`ListaPresenca.java` (Uso de `HashSet`)**
    * **Descrição:** Sistema de lista de presença que evita automaticamente a duplicação de nomes.
    * **Conceitos:** Propriedade fundamental do `Set` de não permitir elementos repetidos, iteração rápida e contagem de elementos únicos.

## 🚀 Como Executar

Pré-requisito: Você precisa ter o [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Baixe ou clone os arquivos deste repositório para o seu computador.
2. Abra o terminal (ou prompt de comando) e navegue até a pasta onde os arquivos foram salvos.
3. Compile o arquivo desejado usando o comando `javac`. Exemplo:
   ```bash
   javac Fila.java
