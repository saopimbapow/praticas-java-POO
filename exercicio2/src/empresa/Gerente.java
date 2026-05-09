package empresa;

public class Gerente extends Funcionario {

    private Boolean departamento;
    private String nomedodepartamento;

    public Gerente( String nome, Double salario, Boolean departamento,  String nomedodepartamento) {
        super(nome, salario);
        this.departamento = departamento;
        this.nomedodepartamento = nomedodepartamento;
    }

    public Double bonificacaosalario(){

       return super.getSalario() * 0.10;
    }
    @Override
    public void exibirDadosFuncionario() {
        super.exibirDadosFuncionario();
        System.out.println("salario com bonificaçao: " + bonificacaosalario());

        if (departamento == true) {
            System.out.println("O funcionário se encontra dentro do Departamento.");
            System.out.println("nome do departamento: " + nomedodepartamento);
        }
        else {
            System.out.println("O funcionário não se encontra dentro do Departamento.");
        }
    }
}
