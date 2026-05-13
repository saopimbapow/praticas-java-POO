package sistemabancario;
import java.util.Scanner;
public class conta {
    private Double salario;
    private String nome;

    Scanner scanner = new Scanner(System.in);

    public void contab(Double salario, String nome){

        this.nome = nome;
        this.salario = salario;

    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }


    public void mostrardadosconta(){

        System.out.println("Salario: R$ " + getSalario());
        System.out.println("Nome do conta: " + getNome());

    }

    public void sacar(){
        System.out.println("Seu Saldo é: " + getSalario());
        System.out.println("Quanto voce deseja sacar: ");
        Double sacar = scanner.nextDouble();

        if(salario >= sacar){

           salario -= sacar;
           System.out.println("Saldo atual: " + salario);


        }
        else{
            System.out.println("Saldo insuficiente para sacar");
        }



    }
}
