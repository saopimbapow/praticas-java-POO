package dominio;

public enum Jogada  {
    PEDRA,
    PAPEL,
    TESOURA;

    public boolean vence(Jogada outra) {
        if(this == PAPEL && outra == PEDRA ) {
            System.out.println("Jogada PAPEL vencedor");
            return true;
        }
        else if(outra == TESOURA && this == PEDRA ) {
            System.out.println("Jogada PEDRA vencedor");
            return true;
        }
        else if(outra == PAPEL && this == TESOURA ) {
            System.out.println("Jogada TESOURA vencedor");
            return true;
        }

        return false;
    }
}
