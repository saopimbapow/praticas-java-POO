package dominio;
import java.util.Random;
import java.util.Scanner;

public class Partida {
    private boolean vencedor = false;
    private boolean perdedor = false;
    
    private Jogada jogadas;


    public void jogar(Jogador j1, Jogador j2) {
        j1.escolherJogada();
        j2.escolherJogada();
        if(j1.getJogada().vence(j2.getJogada())){
            System.out.println("o "+ j1.getNome() +" é o vencedor");
            vencedor = true;
            System.out.println(" vencedor: " + vencedor + " " + j1.getNome() );
        }
        else if(j2.getJogada().vence(j1.getJogada())){
            System.out.println("o "+ j2.getNome() +" é o vencedor");
            perdedor = true;
            System.out.println(" vencedor: " + perdedor +  " " + j2.getNome() );
        }
        else{
            System.out.println("empate");
        }

    }
    public void jogar2 (Jogador j1){
        Random random = new Random();
        System.out.println("jogadas do bot :");
        System.out.println("\n 0)PEDRA \n 1)PAPEL \n 2)TESOURA");
        int numero = random.nextInt(3);
        this.jogadas = Jogada.values()[numero];

       j1.escolherJogada();
       System.out.println("o bot escolheu:" + numero);

       if(j1.getJogada().vence(jogadas)){
           System.out.println("jogador "+ j1.getNome()  +" é o vencedor");
       }
       else if(jogadas.vence(j1.getJogada())){
           System.out.println("bot é o vencedor");
       }
       else{
           System.out.println("empate");
       }




    }
}
