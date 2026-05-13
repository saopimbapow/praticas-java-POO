
import sistemabancario.contacorrente;
import sistemabancario.contapoupanca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        contacorrente contaco = null;
        contapoupanca contaP = null;



        while (true) {
            System.out.print("\nMenu\n[1]Criar conta poupança\n[2]Criar conta corrente\n[3]Realizar saque\n[4]Cheque especial\n[5]exibir dados\n[0]Sair\nOpcao: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.println("Digite seu nome: ");
                String nome = scanner.next();
                System.out.println("Digite seu saldo: ");
                double saldo = scanner.nextDouble();
                System.out.println("Digite a taxa de saque: ");
                double taxa = scanner.nextDouble();

                contaP = new contapoupanca(taxa);
                contaP.contab(saldo, nome);
                System.out.println("Conta poupança criada!");
                System.out.println(" Nome: " + contaP.getNome() + "\n saldo: " + contaP.getSalario());


            } else if (menu == 2) {
                System.out.println("Digite seu nome: ");
                String nome = scanner.next();
                System.out.println("Digite seu saldo: ");
                double saldo = scanner.nextDouble();
                System.out.println("Digite sua taxa saque: ");
                double taxaSaque = scanner.nextInt();

                contaco = new contacorrente(taxaSaque);
                contaco.contab(saldo, nome);
                System.out.println("Conta corrente criada!");

            } else if (menu == 3) {
                System.out.println("(1)Poupança (2)Corrente");
                int tipo = scanner.nextInt();
                if (tipo == 1 && contaP != null) {
                    contaP.sacar();
                } else if (tipo == 2 && contaco != null) {
                    contaco.sacar();
                } else {
                    System.out.println("Conta não criada!");
                }

            } else if (menu == 4) {
                if (contaco == null) {
                    System.out.println("Crie uma conta corrente primeiro!");
                } else {
                    System.out.println("Digite o valor: ");
                    int valor = scanner.nextInt();
                    contaco.chequeEspecial(valor);
                }

            } else if (menu == 0) {
                System.out.println("Fechando.");
                break;

            } else if(menu == 5) {
                System.out.println("\n(0)conta poupança\n(1)conta corrente");
                int menu2 = scanner.nextInt();
                if(menu2 == 0) {
                    System.out.println("sua conta:");
                    System.out.println(" Nome: " + contaP.getNome() + "\n saldo: " + contaP.getSalario());
                }
                else if(menu2 == 1) {
                    System.out.println("sua conta:");
                    System.out.println(" Nome: " + contaco.getNome() + "\n saldo: " + contaco.getSalario());
                }

            }
        }
        scanner.close();
    }
}