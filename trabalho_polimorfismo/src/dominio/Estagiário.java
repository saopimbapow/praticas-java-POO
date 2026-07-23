package dominio;

public class Estagiário extends Funcionario {
    private static final double BONUS_FIXO = 0.60;
    public Estagiário(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        System.out.println("calculando salario do estagiario: ");
        double SalarioEstagiario = getSalarioBase() * BONUS_FIXO;
        return SalarioEstagiario;
    }

    @Override
    public String toString() {
        return "Estagiário: " + getNome() + " -  Salario: R$ " + calcularSalario() ;
    }

}
