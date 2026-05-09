import veiculos.Veiculo;
import veiculos.carros;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do veiculo: ");
        String nomeveiculo = scanner.next();

        System.out.println("Digite o modelo do marca: ");
        String marcaveiculo = scanner.next();


        System.out.println("Digite se o carro é Elétrico : ");
        boolean veiculoeletrico = scanner.nextBoolean();

        System.out.println("quantas cavalos tem o carro: ");
        int cavalos = scanner.nextInt();


        Veiculo veiculo = new Veiculo(nomeveiculo, marcaveiculo);
        carros carro = new carros(marcaveiculo, nomeveiculo, veiculoeletrico, cavalos);
        //veiculo.exibirDados();
        //carro.exibirDados();
        //if(alterar) {

          //  System.out.println("Digite o nome do veiculo: ");
           // String nomeveiculo2 = scanner.next();
           // veiculo.setMarca(nomeveiculo2);
        //}
        //System.out.println("modelo do carro: " + veiculo.getModelo());
        System.out.println("marca do carro: " + veiculo.getMarca());


        veiculo.getModelo();

    }

}