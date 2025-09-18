package Model;

public class Cachorro extends Animais {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}