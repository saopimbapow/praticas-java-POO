package sistemabancario;

import java.util.Scanner;

public class contacorrente extends conta {
    private Double taxaSaque ;
    Scanner scanner = new Scanner(System.in);


    public contacorrente(Double taxaSaque)
    {
        this.taxaSaque = taxaSaque;
    }


    public double chequeEspecial(int valor) {
        if (valor >= getSalario() && getSalario() > 0) {

            double valorComJuros = valor * 1.08 + (taxaSaque / 100.0);
            setSalario(getSalario() - valorComJuros);
            System.out.println("Cheque especial utilizado! Valor com juros: " + valorComJuros);
        } else {

            System.out.println("Saldo suficiente, sem juros.");
        }
        System.out.println("Saldo atual: " + getSalario());
        return getSalario();
    }
}
