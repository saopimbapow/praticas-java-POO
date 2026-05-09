package empresa;

public class Funcionario {
    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public void exibirDadosFuncionario() {

        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }

    public String getNome() {
        return nome;
    }
    public Double getSalario(){
        return salario;
    }
}
