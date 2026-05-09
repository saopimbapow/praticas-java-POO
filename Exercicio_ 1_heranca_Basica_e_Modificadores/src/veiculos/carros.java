package veiculos;

public class carros extends Veiculo {
    private boolean carroeletrico;
    private int cavalos;
    public carros(String marca, String modelo, boolean carroeletrico, int cavalo) {
        super(marca, modelo);
        this.carroeletrico = carroeletrico;
        this.cavalos = cavalo;
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("O carro tem: cavalos = " + cavalos);
        if(carroeletrico == true){
            System.out.println("O carro é Elétrico.");
        }else {
            System.out.println("O carro é: manual " );
        }


    }
}
