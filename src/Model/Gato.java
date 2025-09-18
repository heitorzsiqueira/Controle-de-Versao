package Model;

public class Gato extends Animais {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }
}