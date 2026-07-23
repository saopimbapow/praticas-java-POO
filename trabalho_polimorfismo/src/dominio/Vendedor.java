package dominio;

public class Vendedor extends Funcionario{
    private double TotalDeVendas;
    private static final double BONUS_FIXO = 0.10;

    public Vendedor(String nome, double salarioBase, double totalDeVendas) {
        super(nome, salarioBase);
        TotalDeVendas = totalDeVendas;
    }

    @Override
    public double calcularSalario() {
        System.out.println("calculando salario do Vendedor: ");
        Double conta = TotalDeVendas * BONUS_FIXO;
        double contafinal = getSalarioBase() +  conta;
        return contafinal;
    }
    @Override
    public String toString() {
        return "Vendedor: " + getNome() + " -  Salario: R$ " + calcularSalario() ;
    }
}
