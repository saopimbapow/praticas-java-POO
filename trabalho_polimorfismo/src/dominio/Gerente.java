package dominio;

public class Gerente extends Funcionario{
    private  double BONUS_FIXO;

    public Gerente(String nome, double salarioBase, double BONUS_FIXO) {
        super(nome, salarioBase);
        this.BONUS_FIXO = BONUS_FIXO;
    }

    @Override
    public double calcularSalario() {
        System.out.println("calculando salario do gerente: ");
        double salariofinal = getSalarioBase() + BONUS_FIXO;
        return salariofinal;
    }
    @Override
    public String toString() {
        return "Gerente: " + getNome() + " -  Salario: R$ " + calcularSalario() ;
    }
}
