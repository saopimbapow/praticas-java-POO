package veiculos;

public class Veiculo {
    private String marca;
    private String modelo;


    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirDados() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {

        return modelo;
    }
    public void setMarca(String marcasdudu) {
        this.marca = marcasdudu;
    }
}
