import dominio.Jogada;
import dominio.Jogador;
import dominio.Partida;

import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogador j1 = new Jogador("bernardo");
        Jogador j2 = new Jogador("Joao");
        Partida partida = new Partida();

        System.out.println("qual modo de jogo você quer usar: ");
        System.out.println(" 0) jogar x1 \n 1) jogar com o bot");
        int modo = scanner.nextInt();
        if(modo == 0){

            partida.jogar(j1,j2);
        }
        else if(modo == 1){
            partida.jogar2(j1);
        }

    }
}
