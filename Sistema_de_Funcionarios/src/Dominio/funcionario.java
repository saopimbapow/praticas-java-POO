package Dominio;

import java.util.ArrayList;

public class funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;
    public ArrayList<funcionario> funcionarios = new ArrayList<funcionario>();


    public funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;

    }
    public void addfuncionario(funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void calcularSalario(){
        System.out.println("Salario do funcionario: " );
        System.out.println(salarioBase);
    }
    public void imprimirdados(){

            for(int i = 0; i < funcionarios.size(); i++){
                funcionario funcionario = funcionarios.get(i);
                System.out.println("nome: " + funcionario.getNome());
                System.out.println("cpf: " + funcionario.getCpf());
                System.out.println("salario base: " + funcionario.getSalarioBase());
            }

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {

        this.salarioBase = salarioBase;
    }
}
