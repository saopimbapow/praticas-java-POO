package Dominio;

public class vendedor extends funcionario{
    private double totaldevendas;
    private double comissao;

    public vendedor(String nome, String cpf, double salarioBase , double comissao,  double totaldevendas) {
        super(nome,cpf,salarioBase);
        this.comissao= comissao;
        this.totaldevendas = totaldevendas;
    }
    @Override
    public void calcularSalario() {
        double salariototalvendedor = getSalarioBase() + (totaldevendas * comissao);
        System.out.println("salario total vendedor: " + salariototalvendedor);
    }

    @Override
    public void imprimirdados() {
        super.imprimirdados();
        System.out.println(" total de vendas: " + totaldevendas);
    }
}
