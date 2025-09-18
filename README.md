# Projeto Animais

Este projeto Java simples permite cadastrar animais (cachorro e gato), informando nome, idade e tipo, utilizando um menu interativo no terminal.

## Estrutura de Pastas

- `src/Model`: contém as classes dos animais (`Animais`, `Cachorro`, `Gato`)
- `src/Main.java`: classe principal com o menu de cadastro
- `lib`: pasta para dependências externas
- `bin`: pasta para arquivos compilados

## Como Executar

1. Compile os arquivos Java:
   ```sh
   javac -d bin src/Model/*.java src/Main.java
   ```
2. Execute o programa:
   ```sh
   java -cp bin Main
   ```

## Funcionalidades

- Cadastro de animais (cachorro ou gato)
- Informar nome e idade
- Exibir informações e emitir som característico
- Menu interativo para múltiplos cadastros

## Exemplo de Uso

```
Escolha o animal (1 - Cachorro, 2 - Gato):
1
Digite o nome do animal: Rex
Digite a idade do animal: 5
Animal criado:
Nome: Rex
Idade: 5
O cachorro late: Au Au!
Deseja cadastrar outro animal? (s/n): n
Programa encerrado.
```

## Requisitos

- Java 8 ou superior
- Visual Studio Code (opcional)

---

Projeto desenvolvido para fins de aprendizado por Heitor Zeferino Siqueira RA:42521884.