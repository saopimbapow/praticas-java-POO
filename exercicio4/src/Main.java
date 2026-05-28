import Animal_som.Animal;
import Animal_som.cachorro;
import Animal_som.gato;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<cachorro> cachorros = new ArrayList<>();
        ArrayList<gato> gatos = new ArrayList<>();

        while(true) {
            System.out.println("--som do animal--");
            System.out.println("Escolha um animal");
            System.out.println(" 0)cachorro  --  1)gato -- 2)mostrar dados do animal -- 3)mostrar todos os sons dos animals -- 4)sair");
            System.out.println("digite a sua opção:");

            String entrada = scanner.next();

            if(!entrada.matches("[0-9]+")){
                System.out.println("erro");
                continue;
            }

            int escolha = Integer.parseInt(entrada);

            if (escolha == 0) {
                System.out.println("som do animal: ");
                String som = scanner.next();
                System.out.println("nome do animal: ");
                String nome = scanner.next();
                cachorro somcachorro = new cachorro(som, nome);
                somcachorro.setSom(som);
                somcachorro.setNomedocachorro(nome);
                cachorros.add(somcachorro);
                animals.add(somcachorro);

            } else if (escolha == 1) {
                System.out.println("som do animal: ");
                String som2 = scanner.next();
                System.out.println("nome do animal: ");
                String nome2 = scanner.next();
                gato somgato = new gato(som2, nome2);
                somgato.setSom(som2);
                somgato.setnome(nome2);
                gatos.add(somgato);
                animals.add(somgato);

            } else if (escolha == 2) {
                System.out.println("escolha um animal");
                System.out.println(" 0)cachorro  --  1)gato -- 2)voltar");

                String entrada2 = scanner.next();
                if(!entrada2.matches("[0-9]+")){
                    System.out.println("erro");
                    continue;
                }
                int escolha2 = Integer.parseInt(entrada2);

                if (escolha2 == 0) {
                    for(int i = 0; i < cachorros.size(); i++){
                        System.out.println("Nome do cachorro: " + cachorros.get(i).getnomedocachorro());
                        System.out.println("som do cachorro: " + cachorros.get(i).getSom());
                        System.out.println("---------");
                    }
                } else if (escolha2 == 1) {
                    for(int i = 0; i < gatos.size(); i++){
                        System.out.println("Nome do gato: " + gatos.get(i).getnome());
                        System.out.print("som do gato: ");
                        System.out.println(gatos.get(i).getSom());
                        System.out.println("---------");
                    }
                } else if (escolha2 == 2) {
                    System.out.println("voltando");
                }

            } else if (escolha == 3) {
                System.out.println("som dos animals: ");
                for(int i = 0; i < animals.size(); i++){
                    animals.get(i).exibirsom();
                }
            } else if (escolha == 4) {
                break;
            } else {
                System.out.println("erro");
            }
        }
    }
}