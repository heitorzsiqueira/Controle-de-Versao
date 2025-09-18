import java.util.Scanner;
import Model.Cachorro;
import Model.Gato;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha o animal (1 - Cachorro, 2 - Gato):");
            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Digite o nome do animal: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade do animal: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

            if (escolha == 1) {
                Cachorro cachorro = new Cachorro(nome, idade);
                System.out.println("Animal criado:");
                System.out.println("Nome: " + cachorro.getNome());
                System.out.println("Idade: " + cachorro.getIdade());
                cachorro.emitirSom();
            } else if (escolha == 2) {
                Gato gato = new Gato(nome, idade);
                System.out.println("Animal criado:");
                System.out.println("Nome: " + gato.getNome());
                System.out.println("Idade: " + gato.getIdade());
                gato.emitirSom();
            } else {
                System.out.println("Opção inválida.");
            }

            System.out.print("Deseja cadastrar outro animal? (s/n): ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}