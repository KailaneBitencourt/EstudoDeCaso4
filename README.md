# 🚗 Sistema de Gerenciamento de Transportes

Este projeto simula o gerenciamento de diferentes meios de transporte de uma empresa. Cada transporte possui características específicas e um método para exibir seus detalhes, utilizando os conceitos de **herança** e **polimorfismo** da programação orientada a objetos em Java.

## 📚 Estrutura do Projeto

O sistema é baseado em uma classe abstrata principal e três subclasses:

### 🔷 Classe Base

- **Transporte**
  - Atributo:
    - `capacidade` (número de passageiros)
  - Método abstrato:
    - `mostrarDetalhes()`

### 🛴 Subclasses

- **Bicicleta**
  - Atributo adicional: `temMarchas` 

- **Carro**
  - Atributo adicional: `combustivel` 

- **Ônibus**
  - Atributo adicional: `linha` 

