import Dominio.funcionario;
import Dominio.gerente;
import Dominio.vendedor;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        funcionario funcionarios = null;
        gerente gerentes = null;
        vendedor vendedores = null;


        while (true) {
            System.out.println("\n 0) funcionario \n 1) gerente  \n 2) Vendedor \n 3) calcular salario \n 4) exibir dados");
            int opcao = scanner.nextInt();

            switch (opcao) {
            case 0:
                System.out.println("Digite seu nome(funcionario): ");
                String nome = scanner.next();
                System.out.println("Digite seu cpf(funcionario): ");
                String cpf = scanner.next();
                System.out.println("Digite seu salario base(funcionario): ");
                double salarioBase = scanner.nextDouble();
                funcionarios = new funcionario(nome, cpf, salarioBase);
                funcionarios.addfuncionario(funcionarios);
                
                System.out.println("Dados atualizados com sucesso!");
                //funcionarios.imprimirdados();
                break;
            case 1:
                    System.out.println("Digite seu nome(gerente): ");
                    String nome2 = scanner.next();
                    System.out.println("Digite seu cpf(gerente): ");
                    String cpf2 = scanner.next();
                    System.out.println("Digite seu salario base (gerente): ");
                    double salarioBase2 = scanner.nextDouble();
                    gerentes = new gerente(nome2, cpf2, salarioBase2);
                    gerentes.addfuncionario(gerentes);
                    System.out.println("Dados atualizados com sucesso!");
                    break;
            case 2:
                System.out.println("Digite seu nome(vendedor): ");
                String nome3 = scanner.next();
                System.out.println("Digite seu cpf(vendedor): ");
                String cpf3 = scanner.next();
                System.out.println("Digite seu salario base (vendedor): ");
                double salarioBase3 = scanner.nextDouble();
                System.out.println("Digite o seu total de vendas (vendedor): ");
                double totaldevendas2 = scanner.nextDouble();
                System.out.println("Digite a comissão (ex: 0.05 para 5%): ");
                double comissao2 = scanner.nextDouble();
                 vendedores = new vendedor(nome3, cpf3, salarioBase3, totaldevendas2,comissao2);
                 vendedores.addfuncionario(vendedores);
                 System.out.println("Dados atualizados com sucesso!");
                 break;
            case 3:
                System.out.println("De quem voçê quer exibir o salario");
                System.out.println("\n 0) gerente \n 1) funcionario \n 2) vendedor ");
                int opcao3 = scanner.nextInt();
                switch (opcao3) {
                    case 0:
                        if (gerentes != null) {
                            gerentes.calcularSalario();

                        } else {
                            System.out.println("Nenhum gerente foi encontrado!");
                        }
                        break;
                    case 1:
                        if (funcionarios != null) {
                            funcionarios.calcularSalario();

                        }else{
                            System.out.println("Nenhum funcionario foi encontrado!");
                        }
                        break;
                    case 2:
                        if (vendedores != null) {
                            vendedores.calcularSalario();

                        }else{
                            System.out.println("Nenhum vendedor foi encontrado!");
                        }
                        break;
                    default:
                        System.out.println("opção invalida");
                }
                break;

            case 4:

                System.out.println("Digite de quem você quer ver");
                System.out.println("\n 0) gerente \n 1) funcionario \n 2) vendedor ");
                int opcao2 = scanner.nextInt();
                switch (opcao2) {
                    case 0:
                        if (gerentes != null) {
                           gerentes.imprimirdados();

                        } else {
                            System.out.println("Nenhum dado foi encontrado.");
                        }
                        break;
                    case 1:
                        if (funcionarios != null) {
                           funcionarios.imprimirdados();

                        } else {
                            System.out.println("Nenhum dado foi encontrado.");
                        }
                        break;
                    case 2:
                        if (vendedores != null) {
                            vendedores.imprimirdados();

                        } else {
                            System.out.println("Nenhum dado foi encontrado.");
                        }
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
                break;



        }

        }


    }
}

