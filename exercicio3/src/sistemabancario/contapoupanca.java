package sistemabancario;

public class contapoupanca extends conta {

        private  double TAXA_SAQUE;

        public contapoupanca(double taxaSaque) {

            this.TAXA_SAQUE = taxaSaque ;
        }
    @Override
    public void sacar(){
        System.out.println("Seu Saldo é: " + getSalario());
        System.out.println("Quanto voce deseja sacar: ");
        Double sacar = scanner.nextDouble();

        if(getSalario() >= sacar){

            setSalario(getSalario() - (sacar * ( 1 +  TAXA_SAQUE /100 )));
            System.out.println("Saldo atual: " + getSalario());


        }
        else{
            System.out.println("Saldo insuficiente para sacar");
        }




    }



}
