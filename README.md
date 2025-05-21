``` mermaid
classDiagram

class Tarefa {
  +Long id
  +String descricao
  +LocalDate data
  +String responsavel
  +boolean concluida
}

class ItemEstoque {
  +Long id
  +String nome
  +int quantidadeAtual
  +boolean precisaComprar
}

class Compra {
  +Long id
  +LocalDate dataCompra
  +int quantidadeComprada
}

class RegistroLimpeza {
  +Long id
  +String comodo
  +LocalDate dataLimpeza
}

ItemEstoque "1" --> "0..*" Compra : históricoCompras

```
