import empresa.Funcionario;
import empresa.Gerente;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeF = scanner.nextLine();
        System.out.println("Digite seu salario: ");
        double salarioF = scanner.nextDouble();

        Funcionario funcionarios = new Funcionario(nomeF, salarioF);
        System.out.println("o funcionario se encontra dentro do Departamento(true ou false): ");
        Boolean funcionarioDe = scanner.nextBoolean();
        System.out.println("Digite o nome do departamento: ");
        String nomeDe = scanner.next();
        Gerente gerente = new Gerente(nomeF,salarioF,funcionarioDe,nomeDe);

        //funcionarios.exibirDadosFuncionario();

        //System.out.println("Nome: " + funcionarios.getNome());
       //System.out.println("Salário: " + funcionarios.getSalario());

        gerente.exibirDadosFuncionario();

    }

}