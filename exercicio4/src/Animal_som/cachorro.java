package Animal_som;

public class cachorro extends Animal{
    private String nomedocachorro;
    public cachorro(String som,String nomedocachorro){
        super(som);
        this.nomedocachorro=nomedocachorro;
    }
    public String getnomedocachorro(){
        return nomedocachorro;
    }
    public void setNomedocachorro(String nomedocachorro){
        this.  nomedocachorro=nomedocachorro;
    }
    @Override
    public void exibirsom(){
        System.out.println("nome do cachorro: " + getnomedocachorro());
        System.out.println("som do cachorro: "+ super.getSom());
    }


}
