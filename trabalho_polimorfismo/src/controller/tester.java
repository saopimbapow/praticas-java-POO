package controller;
import java.util.ArrayList;

import dominio.Estagiário;
import dominio.Funcionario;
import dominio.Gerente;
import dominio.Vendedor;

public class tester {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Gerente gerente = new Gerente("tony", 3500, 1000);
        funcionarios.add(gerente);
        Gerente gerente2 = new Gerente("Bernardo", 1000, 1800);
        funcionarios.add(gerente2);
        Vendedor vendedor = new Vendedor("Dudu", 3500, 15000);
        funcionarios.add(vendedor);
        Vendedor vendedor2 = new Vendedor("lucas", 3500, 15001);
        funcionarios.add(vendedor2);
        Estagiário estagiário = new Estagiário("otavio", 1000);
        funcionarios.add(estagiário);
        Estagiário estagiário2 = new Estagiário("flavio", 1200);
        funcionarios.add(estagiário2);

        for(int i = 0; i < funcionarios.size(); i++){
            System.out.println(funcionarios.get(i).toString());
            System.out.println("----------------");

        }

    }
}
