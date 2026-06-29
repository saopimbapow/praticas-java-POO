package dominio;
import java.util.Scanner;


public class Jogador {
    private String nome;
    private Jogada jogada;

    public Jogador(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void escolherJogada(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua opção: ");
        System.out.println(" 0)PEDRA \n 1)PAPEL \n 2)TESOURA");
        int opcao = scanner.nextInt();
        this.jogada = Jogada.values()[opcao];

        System.out.println("jogador: " + nome);
        System.out.println("opçao do jogador foi: " + opcao);

    }

    public Jogada getJogada() {
        return jogada;
    }

    public void setJogada(Jogada jogada) {
        this.jogada = jogada;
    }
}

