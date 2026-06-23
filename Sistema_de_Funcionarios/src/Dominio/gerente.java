package Dominio;

public class gerente extends  funcionario {
    private double bonus;

    public gerente( String nome, String cpf, double salarioBase) {
        super(nome,cpf,salarioBase);
        this.bonus = 120;
    }

    @Override
    public void calcularSalario() {
        double salariobonus =  super.getSalarioBase() + bonus;
        System.out.println("Salario Base do gerente(com bonus): " + salariobonus);

    }
    @Override
    public void imprimirdados() {
        super.imprimirdados();
    }

}
